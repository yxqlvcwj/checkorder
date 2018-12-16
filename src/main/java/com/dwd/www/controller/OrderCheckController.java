package com.dwd.www.controller;

import com.dwd.www.check.OrderCheck;
import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.cobarc_shard3.domain.OrderFoulRecord;
import com.dwd.www.model.OrderCheckModel;
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
public class OrderCheckController {

    @Resource
    private OrderSearch orderSearch;

    @Autowired
    private WorkorderSearch workorderSearch;

    @Autowired
    private OrderFoulRecordSearch orderFoulRecordSearch;

    private OrderCheck orderCheck = new OrderCheck();
    @GetMapping("/order/check")
    public String OrderCheck(String id,String riderId,String status,boolean checkDistance,boolean checkWorkorder,ModelMap modelMap){
        Map<String,List> map = new HashMap<>();
        List<OrderCheckModel> orderList = new ArrayList<>();
        List<OrderFoulRecord> orderFoulRecordList = new ArrayList<>();
        OrderCheckModel orderCheckModel = new OrderCheckModel();
        JsonData jsonData = null;
        OrderFoulRecord orderFoulRecord = null;
        //查询订单信息
        Order order = orderSearch.orderSearch(id);
        if(ObjectUtils.isEmpty(order)){
            jsonData = new JsonData(-1,"订单不存在，请检查订单号是否正确");
            modelMap.addAttribute("jsonData",jsonData);
            return "/fm/error";
        }
        if ("0".equals(status)){
            orderCheckModel = orderCheck.placedOrderCheck(riderId,id,order,orderCheckModel);
        }
        if ("5".equals(status)){
            orderCheckModel = orderCheck.orderRobedCheck(riderId,id,order,orderCheckModel);

        }
        if ("10".equals(status)){
            orderCheckModel = orderCheck.orderArriveCheck(riderId,id,order,orderCheckModel);
        }
        if ("15".equals(status)){
            orderCheckModel = orderCheck.orderObtainCheck(riderId,id,order,orderCheckModel);
        }
        if ("100".equals(status)){
            orderCheckModel = orderCheck.orderFinishCheck(riderId,id,order,orderCheckModel);
        }
        if ("98".equals(status)){
            orderCheckModel = orderCheck.orderAbnormalCheck(riderId,id,order,orderCheckModel);
        }
        if ("99".equals(status)){
            orderCheckModel = orderCheck.orderCanceledCheck(riderId,id,order,orderCheckModel);
        }
        orderList.add(orderCheckModel);
        map.put("orderCheck",orderList);
        if (checkDistance==true) {
            orderFoulRecord = orderFoulRecordSearch.getOrderFoulRecordByriderIdAndOrderIdAndOrderPahse(order, status);
            orderFoulRecordList.add(orderFoulRecord);
            map.put("orderFoulRecordList",orderFoulRecordList);
        }

        jsonData = new JsonData(0,map,"");
        modelMap.addAttribute("jsonData",jsonData);
        return "/fm/statusCheck";
    }
}
