package com.dwd.www.service;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.model.RiderDTO;
import io.restassured.response.Response;

/**
 * 完成操作
 * Created by Chen WenJie on 2018/12/18.
 */
public interface FinishOrder {

    Response FinishOrderOperation(Order order, RiderDTO riderDTO);

}
