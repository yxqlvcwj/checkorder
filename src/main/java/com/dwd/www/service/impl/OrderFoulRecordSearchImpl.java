package com.dwd.www.service.impl;

import com.dwd.www.builder.OrderFoulRecordBuilder;
import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.cobarc_shard3.domain.OrderFoulRecord;
import com.dwd.www.service.OrderFoulRecordSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chen WenJie on 2018/12/11.
 */
@Service
public class OrderFoulRecordSearchImpl implements OrderFoulRecordSearch{
    @Autowired
    private OrderFoulRecordBuilder orderFoulRecordBuilder;

    //根据订单获取超距列表
    @Override
    public  List<OrderFoulRecord> getOrderFoulRecordByriderIdAndOrderId(Order order) {
        if (order==null){
            return  null;
        }else {
            return orderFoulRecordBuilder.findOrderFoulRecordByOrderInfo(order);
        }
    }

    //根据订单和状态查询超距信息
    @Override
    public OrderFoulRecord getOrderFoulRecordByriderIdAndOrderIdAndOrderPahse(Order order, String status) {
        if (order==null){
            return  null;
        }else {
            return  orderFoulRecordBuilder.findOrderFoulRecordByOrderInfoAndStatus(order,status);
        }
    }
}
