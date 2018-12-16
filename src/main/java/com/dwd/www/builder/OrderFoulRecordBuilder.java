package com.dwd.www.builder;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.cobarc_shard3.domain.OrderFoulRecord;
import com.dwd.www.db.cobarc_shard3.mapper.OrderFoulRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Chen WenJie on 2018/12/7.
 */
@Component
public class OrderFoulRecordBuilder {

    @Autowired
    private OrderFoulRecordMapper orderFoulRecordMapper;

    //订单查询超距
    public List<OrderFoulRecord> findOrderFoulRecordByOrderInfo(Order order) {

        if (order == null) {

            return null;

        } else {
            List<OrderFoulRecord> orderFoulRecordList = orderFoulRecordMapper.getOrderFoulRecordByriderIdAndOrderId(order);

            return orderFoulRecordList;
        }
    }

        //查询超距信息
        public OrderFoulRecord findOrderFoulRecordByOrderInfoAndStatus(Order order,String status) {
            if (order == null) {

                return null;

            } else {
                OrderFoulRecord orderFoulRecord = orderFoulRecordMapper.getOrderFoulRecordByriderIdAndOrderIdAndOrderPahse(order, status);
                return orderFoulRecord;
            }
        }
}
