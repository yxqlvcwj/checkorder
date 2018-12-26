package com.dwd.www.service.impl;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.model.RiderDTO;
import com.dwd.www.service.ObtainGood;
import com.dwd.www.untils.ServerSettings;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * 订单离店接口实现类
 * Created by Chen WenJie on 2018/12/18.
 */
@Service
@Slf4j
public class ObtainGoodImpl implements ObtainGood {

    @Autowired
    private ServerSettings serverSettings;

    @Override
    public Response ObtainGoodOperation(Order order, RiderDTO riderDTO,boolean checkDistance,String distanceReason) {
        String url="/" +serverSettings.riderVersion +  "/rider/order-operation/obtain-good.json";
        Map<String,Object> param = new HashMap<>();
        param.put("cityId",order.getCityId());
        param.put("riderId",riderDTO.getRiderId());
        param.put("orderId",order.getId());
        param.put("lat",order.getFromLat());
        param.put("lng",order.getFromLng());
        param.put("shopId",order.getShopId());
        param.put("considerDis","0");
        param.put("distanceReason","");
        param.put("groupId",order.getGroupId());
        param.put("token",riderDTO.getToken());
        param.put("developerTest","1");
        Response response=given().params(param).when().post(serverSettings.riderService + url);
        log.info(">>>>> 骑手离店 param       ：" + param);
        log.info(">>>>> 骑手离店 response    ：" + response.asString());
        return response;
    }
}
