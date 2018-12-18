package com.dwd.www.service.impl;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.model.RiderDTO;
import com.dwd.www.service.RiderLoginAndComToWork;
import com.dwd.www.untils.ServerSettings;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.path.json.JsonPath.from;

/**
 * 登录接口实现类
 * Created by Chen WenJie on 2018/12/18.
 */
@Service
@Slf4j
public class RiderLoginAndComToWorkImpl implements RiderLoginAndComToWork {

    @Autowired
    private ServerSettings serverSettings;

    @Override
    public RiderDTO login(Order order, String mobile) {
        String riderLoginUrl="/"+ serverSettings.riderVersion+ "/rider/base/login.json";
        String token;
        Map<String,String> para=new HashMap<String, String>();
        para.put("mobile",mobile);
        para.put("captcha","123456");
        para.put("cityId","1");
        para.put("lat","30315285");
        para.put("lng","120166136");
        para.put("version","5.6.3");
        para.put("imei","55f2f688320ab857718fb28042b2b2a9");
        para.put("source","vivo"); //手机厂商
        para.put("client","Android4.4.4");
        para.put("channelId","0"); //渠道id
        para.put("phoneVersion","vivo+X7"); //手机型号
        para.put("developerTest","1");
        para.put("clientId","6eb85633223e8d60480b7fa9e1f58ed4");
        //登录
        Response response = given().params(para).when().post(serverSettings.riderService+riderLoginUrl);
        log.info(">>>>> 骑手登录url "+serverSettings.riderService+riderLoginUrl);
        log.info(">>>>> 骑手登录response "+response.asString());
        //骑手对象封装
        RiderDTO riderDTO = new RiderDTO();
        riderDTO.setCityId(response.then().extract().path("data.originCityId"));
        riderDTO.setMobile(mobile);
        riderDTO.setRiderId(from(response.asString()).getString("data.riderId"));
        riderDTO.setRiderType(from(response.asString()).getString("data.riderType"));
        riderDTO.setInsuranceFee(from(response.asString()).getString("data.insuranceFee"));
        riderDTO.setAreaCode(response.then().extract().path("data.areaCode"));
        riderDTO.setGuideVersion(from(response.asString()).getString("data.guideVersion"));
        riderDTO.setTradingAreaId(from(response.asString()).getString("data.tradingAreaId"));
        riderDTO.setRiderName(response.then().extract().path("data.riderName"));
        riderDTO.setIdentityCard(response.then().extract().path("data.identityCard"));
        riderDTO.setToken(from(response.asString()).getString("data.token"));
        //骑手开启工作
        String comeToWorkUri = "/" + serverSettings.riderVersion + "/rider/base/come-to-work.json";
        Map<String, Object> params = new HashMap<>();
        params.put("cityId",riderDTO.getCityId());
        params.put("riderId",riderDTO.getRiderId());
        params.put("lat",order.getFromLat());
        params.put("lng",order.getFromLng());
        params.put("cityName","杭州市");
        params.put("workingAreaLat",order.getFromLat());
        params.put("workingAreaLng",order.getFromLng());
        params.put("radius","2.5");
        params.put("token",riderDTO.getToken());
        params.put("developerTest","1");
        Response response1 = given().contentType(ContentType.JSON).params(params).request().when().get(serverSettings.riderService+comeToWorkUri);
        log.info(">>>>> 骑手开启工作response "+response1.asString());
        return riderDTO;
    }
}
