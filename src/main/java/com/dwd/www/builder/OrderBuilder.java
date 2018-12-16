package com.dwd.www.builder;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.cobarc_shard3.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 获取订单相关数据
 * Created by Chen WenJie on 2018/12/7.
 */
@Component
public class OrderBuilder {
    /**
     * 注解获取bean
     */
    @Autowired
    private OrderMapper orderMapper;

    //根据订单id获取订单对象
    public Order orderSearch(String id) {
        //根据订单号查询订单对象
        Order order = orderMapper.findOrderByOrderId(id);
        if (order == null) {
            return null;
        } else {
            return order;
        }
    }
}
