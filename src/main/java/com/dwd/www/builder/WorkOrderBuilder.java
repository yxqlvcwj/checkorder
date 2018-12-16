package com.dwd.www.builder;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.cobarc_shard3.domain.OrderFoulRecord;
import com.dwd.www.db.workorderdb.domain.Workorder;
import com.dwd.www.db.workorderdb.mapper.WorkorderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 根据订单相关信息查询工单数据
 * Created by Chen WenJie on 2018/12/7.
 */
@Component
public class WorkOrderBuilder {

    @Autowired
    private WorkorderMapper workorderMapper;

    //已到店状态订单查询工单
    public List<Workorder> findWorkorderByOrderInfo(Order order){

        if(order==null ){

            return null;

        }else {
            List<Workorder> workOrderlist = workorderMapper.getWorkorderByServiceIdAndItemCodeAndSourceId(order);

            return workOrderlist;

        }
    }
}
