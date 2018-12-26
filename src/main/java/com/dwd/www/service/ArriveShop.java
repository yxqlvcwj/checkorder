package com.dwd.www.service;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.model.RiderDTO;
import io.restassured.response.Response;

/**
 * 到店操作
 * Created by Chen WenJie on 2018/12/18.
 */
public interface ArriveShop {

    Response ArriveShopOperation(Order order, RiderDTO riderDTO,boolean checkDistance,String distanceReason);
}
