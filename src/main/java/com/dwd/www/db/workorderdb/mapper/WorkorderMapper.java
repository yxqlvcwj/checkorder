package com.dwd.www.db.workorderdb.mapper;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.workorderdb.domain.Workorder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WorkorderMapper {

    @Select("select * from `workorder` where id=#{id}")
    Workorder findOrderByOrderId(String id);

    //对象入参，添加注解，不然报错找不到参数
    @Select("select * from workorder where service_id = #{order.id} and source_id = #{order.riderId}")
    List<Workorder> getWorkorderByServiceIdAndItemCodeAndSourceId(@Param("order") Order order);


}