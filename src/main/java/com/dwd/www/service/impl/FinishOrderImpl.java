package com.dwd.www.service.impl;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.model.RiderDTO;
import com.dwd.www.service.FinishOrder;
import com.dwd.www.untils.ServerSettings;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * 完成订单接口实现类
 * Created by Chen WenJie on 2018/12/18.
 */
@Service
@Slf4j
public class FinishOrderImpl implements FinishOrder {

    @Autowired
    private ServerSettings serverSettings;

    @Override
    public Response FinishOrderOperation(Order order, RiderDTO riderDTO) {
        String url = "/" + serverSettings.riderVersion + "/rider/order-operation/finish-order.json";
        Map<String, Object> param = new HashMap<>();
        param.put("cityId", order.getCityId());
        param.put("riderId", riderDTO.getRiderId());
        param.put("orderId", order.getId());
        param.put("lat", order.getFromLat());
        param.put("lng", order.getFromLng());
        param.put("considerDis", "0");
        param.put("distanceReason", "");
        param.put("receivingCode", "");
        param.put("waybillNo", "");
        param.put("expressId", "");
        param.put("groupId", order.getGroupId());
        param.put("token", riderDTO.getToken());
        param.put("developerTest","1");
        Response response = given().params(param).when().post(serverSettings.riderService + url);
        log.info(">>>>> 订单送达 params  ：{}",param);
        log.info(">>>>> 订单送达 response ：{}",response.asString());
        return response;
    }
}