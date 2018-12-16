package com.dwd.www.service;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.cobarc_shard3.domain.OrderFoulRecord;

import java.util.List;

/**
 * Created by Chen WenJie on 2018/12/11.
 */
public interface OrderFoulRecordSearch {
    List<OrderFoulRecord> getOrderFoulRecordByriderIdAndOrderId(Order order);

    OrderFoulRecord getOrderFoulRecordByriderIdAndOrderIdAndOrderPahse(Order order,String status);

}
