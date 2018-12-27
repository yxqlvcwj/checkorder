package com.dwd.www.service.impl;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.model.RiderDTO;
import com.dwd.www.service.ArriveShop;
import com.dwd.www.untils.ServerSettings;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * 到店接口实现类
 * Created by Chen WenJie on 2018/12/18.
 */
@Service
@Slf4j
public class ArriveShopImpl implements ArriveShop{

    @Autowired
    private ServerSettings serverSettings;

    @Override
    public Response ArriveShopOperation(Order order, RiderDTO riderDTO,boolean checkDistance,String distanceReason) {
        String arriveShopUri = "/" +serverSettings.riderVersion + "/rider/order-operation/arrive-shop.json";
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
        params.put("riderId", String.valueOf(riderDTO.getRiderId()));
        params.put("cityId", String.valueOf(order.getCityId()));
        params.put("shopId", String.valueOf(order.getShopId()));
        params.put("groupId", String.valueOf(order.getGroupId()));
        params.put("orderId", String.valueOf(order.getId()));
        params.put("token", riderDTO.getToken());
        params.put("developerTest","1");
        Response response = given().params(params).when().post(serverSettings.riderService + arriveShopUri);
        log.info("骑手到店response："+response.asString());
        return response;
    }
}
