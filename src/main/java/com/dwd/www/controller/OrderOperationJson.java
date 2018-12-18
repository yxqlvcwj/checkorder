package com.dwd.www.controller;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.model.RiderDTO;
import com.dwd.www.service.*;
import com.dwd.www.untils.JsonData;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

/**
 * 订单操作
 * Created by Chen WenJie on 2018/12/18.
 */
@RestController
public class OrderOperationJson {
    @Autowired
    private RiderLoginAndComToWork riderLogin;

    @Autowired
    private OrderSearch orderSearch;

    @Autowired
    private RobOrder robOrder;

    @Autowired
    private ArriveShop arriveShop;

    @Autowired
    private ObtainGood obtainGood;

    @Autowired
    private FinishOrder finishOrder;

    @Autowired
    private SetOrderAbnormal setOrderAbnormal;


    @GetMapping("/order/operation/json")
    public JsonData login(String id, String riderId, String status, boolean checkDistance, boolean checkWorkorder,String mobile, ModelMap modelMap) throws InterruptedException {
        Order order = orderSearch.orderSearch(id);
        RiderDTO riderDTO = riderLogin.login(order,mobile);
        if ("5".equals(status)){
            //抢单操作
            robOrder.RobOrderOperation(order,riderDTO);
            return  new JsonData(1,"抢单成功");
        }
       if ("10".equals(status)){
           //抢单操作
           robOrder.RobOrderOperation(order,riderDTO);
           //到店操作
           arriveShop.ArriveShopOperation(order,riderDTO);
           return  new JsonData(1,"到店成功");
       }

        if ("15".equals(status)){
            //抢单操作
            robOrder.RobOrderOperation(order,riderDTO);
            //到店操作
            arriveShop.ArriveShopOperation(order,riderDTO);
            //离店操作
            obtainGood.ObtainGoodOperation(order,riderDTO);
            return  new JsonData(1,"离店成功");
        }
        if ("100".equals(status)||"98".equals(status)){
            //抢单操作
            robOrder.RobOrderOperation(order,riderDTO);
            //到店操作
            arriveShop.ArriveShopOperation(order,riderDTO);
            //离店操作
            obtainGood.ObtainGoodOperation(order,riderDTO);
            sleep(65000);
            if("100".equals(status)){
                //送达操作
                finishOrder.FinishOrderOperation(order,riderDTO);
                return  new JsonData(1,"送达成功");
            }
            if("98".equals(status)){
                //设置异常单操作
                setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO);
                return  new JsonData(1,"设置异常单成功");
            }
        }
        return  new JsonData(1,"不存在选择节点，请检查选择是否正确");
    }

}
