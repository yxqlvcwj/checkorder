package com.dwd.www.service;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.model.RiderDTO;

/**
 * Created by Chen WenJie on 2018/12/18.
 */
public interface RiderLoginAndComToWork {

    RiderDTO login(Order order, String mobile);
}
