package com.dwd.www.service.impl;

import com.alibaba.fastjson.JSON;
import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.model.RiderDTO;
import com.dwd.www.service.SetOrderAbnormal;
import com.dwd.www.untils.ServerSettings;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * 异常完成接口实现类
 * Created by Chen WenJie on 2018/12/18.
 */
@Service
@Slf4j
public class SetOrderAbnormalImpl implements SetOrderAbnormal {

    @Autowired
    private ServerSettings serverSettings;

    @Override
    public Response SetOrderAbnormalOperation(Order order, RiderDTO riderDTO,boolean checkDistance,String distanceReason) {
        String url = "/" + serverSettings.riderVersion + "/rider/order-operation/set-order-abnormal.json";
        Map<String, Object> params = new HashMap<>();
        if (checkDistance==true){
            params.put("lng", "120166017");
            params.put("lat", "30315555");
            if ("".equals(distanceReason)){
                params.put("distanceReason", "");
            }else {
                params.put("distanceReason", distanceReason);
            }
        }else{
            params.put("lng", String.valueOf(order.getFromLng()));
            params.put("lat", String.valueOf(order.getFromLat()));
            params.put("distanceReason", "");
        }
        params.put("cityId", order.getCityId());
        params.put("riderId", riderDTO.getRiderId());
        params.put("orderId", order.getId());
        params.put("abnormalReason", "53");
        params.put("groupId",order.getGroupId());
        params.put("token", riderDTO.getToken());
        params.put("developerTest","1");
        Response response = given().params(params).contentType("application/x-www-form-urlencoded;charset=utf-8").when().post(serverSettings.riderService + url);
        log.info(">>>>> 设置异常订单 req  ：\n"+ JSON.toJSONString(params,true));
        log.info(">>>>> 设置异常订单 resp ："+response.asString());
        return response;
    }
}
