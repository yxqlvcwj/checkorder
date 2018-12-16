package com.dwd.www.service.impl;

import com.dwd.www.builder.OrderBuilder;
import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.service.OrderSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Chen WenJie on 2018/12/7.
 */
@Service
public class OrderSearchImpl implements OrderSearch{

    @Autowired
    private OrderBuilder orderBuilder;
    @Override
    public Order orderSearch(String id) {
        return orderBuilder.orderSearch(id);
    }
}
