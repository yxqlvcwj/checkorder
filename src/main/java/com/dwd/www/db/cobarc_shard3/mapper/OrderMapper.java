package com.dwd.www.db.cobarc_shard3.mapper;

import com.dwd.www.db.cobarc_shard3.domain.Order;

import org.apache.ibatis.annotations.*;

public interface OrderMapper {

   @Select("select * from `order` where id=#{id}")
    Order findOrderByOrderId(@Param("id") String id);
}