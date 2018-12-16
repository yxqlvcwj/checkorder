package com.dwd.www.service;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.workorderdb.domain.Workorder;

import java.util.List;

/**
 * Created by Chen WenJie on 2018/12/7.
 */
public interface WorkorderSearch {

    //根据订单id查询订单详情
    List<Workorder> getWorkorderByServiceIdAndItemCodeAndSourceId(Order order);
}
