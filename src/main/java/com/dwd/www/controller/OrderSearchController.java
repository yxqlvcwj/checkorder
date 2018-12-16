package com.dwd.www.controller;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.cobarc_shard3.domain.OrderFoulRecord;
import com.dwd.www.db.cobarc_shard3.mapper.OrderMapper;
import com.dwd.www.db.workorderdb.domain.Workorder;
import com.dwd.www.db.workorderdb.mapper.WorkorderMapper;
import com.dwd.www.service.OrderFoulRecordSearch;
import com.dwd.www.service.OrderSearch;
import com.dwd.www.service.WorkorderSearch;
import com.dwd.www.untils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chen WenJie on 2018/12/6.
 */

@Controller
public class OrderSearchController {

    @Autowired
    private   OrderMapper orderMapper;

    @Autowired
    private WorkorderMapper workorderMapper;

    @Resource
    private OrderSearch orderSearch;

    @Autowired
    private WorkorderSearch workorderSearch;

    @Autowired
    private OrderFoulRecordSearch orderFoulRecordSearch;

    @GetMapping("/order")
    public String orderSearch(String id,ModelMap modelMap){
        JsonData jsonData = null;
        List<Order> list = new ArrayList();
        Map<String ,List> map = new HashMap<>();
        Order order = orderSearch.orderSearch(id);
        if(ObjectUtils.isEmpty(order)){
             jsonData = new JsonData(-1,"订单不存在，请检查订单号是否正确");
             modelMap.addAttribute("jsonData",jsonData);
             return "/fm/error";
        }
        //将订单对象放入list中
        list.add(order);
        //将订单对象装入到map中
        map.put("orderInfo",list);
        //判断订单状态是否等于0，等于0为未接单状态，只返回订单信息
        if (order.getStatus()==0){
            jsonData = new JsonData(1,map,null);
        }
        //订单状态不为0的时候，查询这个订单对应的超距信息
        List<OrderFoulRecord> orderFoulRecordList = orderFoulRecordSearch.getOrderFoulRecordByriderIdAndOrderId(order);
        if(orderFoulRecordList.size() >0){
            map.put("orderFoulRecordList",orderFoulRecordList);
        }
        //订单状态不为0，查询工单信息并且返回
            List<Workorder> workOrderList = workorderSearch.getWorkorderByServiceIdAndItemCodeAndSourceId(order);
        //查询到工单，则装进map中
        if(workOrderList.size()>0) {
            map.put("workOrderList", workOrderList);
        }
        jsonData = new JsonData(1,map,null);
        modelMap.addAttribute("jsonData",jsonData);
        return "/fm/order";  //不用加后缀，在配置文件里面已经指定了后缀  根目录也不用加了
    }
}
