//package com.dwd.www.db.cobarb_shard4.mapper;
//
//import com.dwd.www.db.cobarb_shard4.domain.BalanceLog;
//import com.dwd.www.db.cobarb_shard4.domain.BalanceLogExample;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//
//public interface BalanceLogMapper {
//    int countByExample(BalanceLogExample example);
//
//    int deleteByExample(BalanceLogExample example);
//
//    int deleteByPrimaryKey(Long id);
//
//    int insert(BalanceLog record);
//
//    int insertSelective(BalanceLog record);
//
//    List<BalanceLog> selectByExample(BalanceLogExample example);
//
//    BalanceLog selectByPrimaryKey(Long id);
//
//    int updateByExampleSelective(@Param("record") BalanceLog record, @Param("example") BalanceLogExample example);
//
//    int updateByExample(@Param("record") BalanceLog record, @Param("example") BalanceLogExample example);
//
//    int updateByPrimaryKeySelective(BalanceLog record);
//
//    int updateByPrimaryKey(BalanceLog record);
//}