//package com.dwd.www.db.cobarc_shard3.mapper;
//
//import com.dwd.www.db.cobarc_shard3.domain.OrderDetail;
//import com.dwd.www.db.cobarc_shard3.domain.OrderDetailExample;
//import java.util.List;
//import org.apache.ibatis.annotations.Param;
//
//public interface OrderDetailMapper {
//    int countByExample(OrderDetailExample example);
//
//    int deleteByExample(OrderDetailExample example);
//
//    int deleteByPrimaryKey(Long id);
//
//    int insert(OrderDetail record);
//
//    int insertSelective(OrderDetail record);
//
//    List<OrderDetail> selectByExample(OrderDetailExample example);
//
//    OrderDetail selectByPrimaryKey(Long id);
//
//    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);
//
//    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);
//
//    int updateByPrimaryKeySelective(OrderDetail record);
//
//    int updateByPrimaryKey(OrderDetail record);
//}