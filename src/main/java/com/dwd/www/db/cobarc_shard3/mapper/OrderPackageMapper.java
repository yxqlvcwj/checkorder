//package com.dwd.www.db.cobarc_shard3.mapper;
//
//import com.dwd.www.db.cobarc_shard3.domain.OrderPackage;
//import com.dwd.www.db.cobarc_shard3.domain.OrderPackageExample;
//import java.util.List;
//import org.apache.ibatis.annotations.Param;
//
//public interface OrderPackageMapper {
//    int countByExample(OrderPackageExample example);
//
//    int deleteByExample(OrderPackageExample example);
//
//    int deleteByPrimaryKey(Long id);
//
//    int insert(OrderPackage record);
//
//    int insertSelective(OrderPackage record);
//
//    List<OrderPackage> selectByExample(OrderPackageExample example);
//
//    OrderPackage selectByPrimaryKey(Long id);
//
//    int updateByExampleSelective(@Param("record") OrderPackage record, @Param("example") OrderPackageExample example);
//
//    int updateByExample(@Param("record") OrderPackage record, @Param("example") OrderPackageExample example);
//
//    int updateByPrimaryKeySelective(OrderPackage record);
//
//    int updateByPrimaryKey(OrderPackage record);
//}