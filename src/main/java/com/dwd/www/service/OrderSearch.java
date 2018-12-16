package com.dwd.www.service;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import org.springframework.stereotype.Service;

/**
 * Created by Chen WenJie on 2018/12/7.
 */
public interface OrderSearch {

    //根据订单id查询订单详情
    Order orderSearch(String id);
}
