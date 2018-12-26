package com.dwd.www.service.impl;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.model.RiderDTO;
import com.dwd.www.service.RobOrder;
import com.dwd.www.untils.ServerSettings;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * 抢单接口实现类
 * Created by Chen WenJie on 2018/12/18.
 */
@Service
@Slf4j
public class RobOrderImpl implements RobOrder {

    @Autowired
    private ServerSettings serverSettings;

    @Override
    public Response RobOrderOperation(Order order, RiderDTO riderDTO,boolean checkDistance) {
        String uri= "/"+serverSettings.riderVersion+"/rider/order-operation/rob-order.json";
        Map<String,Object> param=new HashMap<>();
        param.put("cityId",riderDTO.getCityId());
        param.put("riderId",riderDTO.getRiderId());
        param.put("orderId",order.getId());
        param.put("groupId",order.getGroupId());
        param.put("platformId",order.getPlatformShopid());
        param.put("lat",order.getFromLat());
        param.put("lng",order.getFromLng());
        param.put("orderIndex","1");        // 订单列表序号
        param.put("matchingDegree","20");   // 顺路度
        param.put("from","0");
        param.put("forceRob","0");
        param.put("token",riderDTO.getToken());
        param.put("developerTest","1");
        Response response= given().contentType(ContentType.JSON).params(param)
                .request().when().get(serverSettings.riderService+uri);
        log.info("抢单结果response："+response.asString());
        return response;

    }
}
