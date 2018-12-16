package com.dwd.www.db.cobarc_shard3.mapper;


import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.cobarc_shard3.domain.OrderFoulRecord;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderFoulRecordMapper {
//    int countByExample(OrderFoulRecordExample example);
//
//    int deleteByExample(OrderFoulRecordExample example);
//
//    int deleteByPrimaryKey(Long id);
//
//    int insert(OrderFoulRecordSearch record);
//
//    int insertSelective(OrderFoulRecordSearch record);
//
//    List<OrderFoulRecordSearch> selectByExample(OrderFoulRecordExample example);
//
//    OrderFoulRecordSearch selectByPrimaryKey(Long id);
//
//    int updateByExampleSelective(@Param("record") OrderFoulRecordSearch record, @Param("example") OrderFoulRecordExample example);
//
//    int updateByExample(@Param("record") OrderFoulRecordSearch record, @Param("example") OrderFoulRecordExample example);
//
//    int updateByPrimaryKeySelective(OrderFoulRecordSearch record);
//
//    int updateByPrimaryKey(OrderFoulRecordSearch record);

    @Select("select * from order_foul_record where order_id=#{order.id} and rider_id=#{order.riderId} and deal_type= 1")
    List<OrderFoulRecord>  getOrderFoulRecordByriderIdAndOrderId(@Param("order") Order order);

    @Select("select * from order_foul_record where order_id=#{order.id} and rider_id=#{order.riderId} and order_phase = #{status} and deal_type= 1 order by ins_tm desc limit 0,1")
    OrderFoulRecord  getOrderFoulRecordByriderIdAndOrderIdAndOrderPahse(@Param("order") Order order,@Param("status") String status);

}