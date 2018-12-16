package com.dwd.www.service.impl;

import com.dwd.www.builder.WorkOrderBuilder;
import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.workorderdb.domain.Workorder;
import com.dwd.www.db.workorderdb.mapper.WorkorderMapper;
import com.dwd.www.service.WorkorderSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chen WenJie on 2018/12/7.
 */
@Service
public class WorkrderSearchImpl implements WorkorderSearch{

    @Autowired
    private WorkOrderBuilder workOrderBuilder;

    @Override
    public List<Workorder> getWorkorderByServiceIdAndItemCodeAndSourceId(Order order) {
        if (order==null){
            return  null;
        }else {
            return  workOrderBuilder.findWorkorderByOrderInfo(order);
        }
    }
}
