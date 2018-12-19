package com.dwd.www.db.cobarb_shard2.mapper;

import com.dwd.www.db.cobarb_shard2.domain.BalanceLog;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BalanceLogMapper {

    @Insert("INSERT INTO `cobarb_shard2`.`balance_log`( `city_id`, `rider_id`, `type`, `blocked`, `account`, `paid`, `name`, `cost`, `factorage`, `ins_tm`, `verify_tm`, `finish_tm`, `reason`, `trade_no`, `trade_way`, `risk_checked`, `current_service_type`, `bank_name`, `bank_card`, `bank_card_type`, `pay_type`, `batch_record_id`, `batch_no`, `shardx`, `withdraw_tm`, `modify_time`, `effective_balance`, `auditing_money`) \n" +
            "  VALUES (1, 166, 110, 0, NULL, 10, '订单配送收入', 1.00, 0.00, '2018-12-19 14:39:00', '2018-12-19 14:39:00', '2018-12-19 14:39:00', NULL, '381201339851491328', 2, 0, 0, 0, NULL, 2, 2, NULL, NULL, 254, NULL, '2018-12-19 14:38:59', 403.20, 109.40)")
    int insertData();
}