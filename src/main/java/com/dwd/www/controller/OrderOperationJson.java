package com.dwd.www.controller;

import com.alibaba.fastjson.JSONPath;
import com.dwd.www.check.OrderCheck;
import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.db.cobarc_shard3.domain.OrderFoulRecord;
import com.dwd.www.db.workorderdb.domain.Workorder;
import com.dwd.www.db.workorderdb.mapper.WorkorderMapper;
import com.dwd.www.model.OrderCheckModel;
import com.dwd.www.model.RiderDTO;
import com.dwd.www.service.*;
import com.dwd.www.untils.JsonData;
import com.dwd.www.untils.JsonUtil;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.util.ObjectUtils;
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

    @Autowired
    private WorkorderSearch workorderSearch;

    @Autowired
    private OrderFoulRecordSearch orderFoulRecordSearch;

    @Autowired
    private WorkorderMapper workorderMapper;

    private OrderCheck orderCheck = new OrderCheck();

    @GetMapping("/order/operation/json")
    public JsonData login(String id,String startStatus,String status,String distanceReason,boolean checkOrder,boolean checkDistance, boolean checkWorkorder,String mobile, ModelMap modelMap) throws InterruptedException {
        JsonUtil jsonUtil = new JsonUtil();
        Map<String,List> map = new HashMap<>();
        List<OrderCheckModel> orderList = new ArrayList<>();
        List<OrderFoulRecord> orderFoulRecordList = new ArrayList<>();
        OrderCheckModel orderCheckModel = new OrderCheckModel();
        OrderFoulRecord orderFoulRecord = null;
        JsonData jsonData = null ;
        distanceReason = distanceReason==null?"0":distanceReason;
        Order order = orderSearch.orderSearch(id);
        RiderDTO riderDTO = riderLogin.login(order,mobile);
        if (order!=null&&order.getRiderId()!=null){
            riderDTO.setRiderId(String.valueOf(order.getRiderId()));
        }
        if(ObjectUtils.isEmpty(order)){
            return new JsonData(-1,"订单不存在，请检查订单号是否正确");
        }
        if(Integer.parseInt(startStatus)>=Integer.parseInt(status)){
            return new JsonData(-1,"目标状态需要是当前状态之后的状态");
        }
        switch (startStatus){
            case "0":
                if ("5".equals(status)){
                    //抢单操作
                    Response response = robOrder.RobOrderOperation(order,riderDTO,checkDistance);
                    //工具类，进行response的处理，方便取值
                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
                    }
                    //获取订单状态为5时的关键字段校验结果
                    order = orderSearch.orderSearch(id);
                    if (checkOrder==true){
                        orderCheckModel = orderCheck.orderRobedCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                    }
                }
                if ("10".equals(status)){
                    //抢单操作
                    Response responseRobOrder = robOrder.RobOrderOperation(order,riderDTO,checkDistance);
                    //工具类，进行response的处理，方便取值
                    jsonUtil.setJsonBody(jsonUtil.stringToJson(responseRobOrder.asString()));
                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
                    }
                    //到店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseArriveShop =arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseArriveShop.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    //获取订单状态为10时的关键字段校验结果
                    order = orderSearch.orderSearch(id);
                    if (checkOrder==true){
                        orderCheckModel = orderCheck.orderObtainCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                    }
                }

                if ("15".equals(status)){
                    //抢单操作
                    Response response = robOrder.RobOrderOperation(order,riderDTO,checkDistance);
                    //工具类，进行response的处理，方便取值
                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
                    }
                    //到店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseArriveShop =arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseArriveShop.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    //离店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseObtainGood =obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseObtainGood.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    //获取订单状态为15时的关键字段校验结果
                    order = orderSearch.orderSearch(id);
                    if (checkOrder==true){
                        orderCheckModel = orderCheck.orderObtainCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                    }
                }
                if ("100".equals(status)||"98".equals(status)){
                    //抢单操作
                    Response response = robOrder.RobOrderOperation(order,riderDTO,checkDistance);
                    //工具类，进行response的处理，方便取值
                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
                    }
                    //到店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseArriveShop =arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseArriveShop.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    //离店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseObtainGood =obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseObtainGood.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    sleep(70000);
                    if("100".equals(status)){
                        //送达操作
                        if (checkDistance==true&&distanceReason!=null){
                            Response responseFinishOrder =finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,"0");
                            jsonUtil.setJsonBody(jsonUtil.stringToJson(responseFinishOrder.asString()));
                            if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                                finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,distanceReason);
                            }
                        }else {
                            finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                        //获取订单状态为100时的关键字段校验结果
                        order = orderSearch.orderSearch(id);
                        if (checkOrder==true){ 
                        orderCheckModel = orderCheck.orderFinishCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                        }
                    }
                    if("98".equals(status)){
                        //设置异常单操作
                        if (checkDistance==true&&distanceReason!=null){
                            Response responseSetOrderAbnormal =setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,"0");
                            jsonUtil.setJsonBody(jsonUtil.stringToJson(responseSetOrderAbnormal.asString()));
                            if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                                setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,distanceReason);
                            }
                        }else {
                            setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                        //获取订单状态为98时的关键字段校验结果
                        order = orderSearch.orderSearch(id);
                        if (checkOrder==true){
                            orderCheckModel = orderCheck.orderAbnormalCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                        }
                    }
                }
                break;
            case "5":
                if ("10".equals(status)){
                    //到店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseArriveShop =arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseArriveShop.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    //获取订单状态为10时的关键字段校验结果
                    order = orderSearch.orderSearch(id);
                    if (checkOrder==true){
                        orderCheckModel = orderCheck.orderArriveCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                    }
                }
                if ("15".equals(status)){
                    //到店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseArriveShop =arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseArriveShop.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    //离店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseObtainGood =obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseObtainGood.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    //获取订单状态为15时的关键字段校验结果
                    order = orderSearch.orderSearch(id);
                    if (checkOrder==true){
                        orderCheckModel = orderCheck.orderObtainCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                    }
                }
                if ("100".equals(status)||"98".equals(status)){
                    //到店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseArriveShop =arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseArriveShop.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        arriveShop.ArriveShopOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    //离店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseObtainGood =obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseObtainGood.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    sleep(65000);
                    if("100".equals(status)){
                        //送达操作
                        if (checkDistance==true&&distanceReason!=null){
                            Response responseFinishOrder =finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,"0");
                            jsonUtil.setJsonBody(jsonUtil.stringToJson(responseFinishOrder.asString()));
                            if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                                finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,distanceReason);
                            }
                        }else {
                            finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                        //获取订单状态为100时的关键字段校验结果
                        order = orderSearch.orderSearch(id);
                        if (checkOrder==true){ 
                        orderCheckModel = orderCheck.orderFinishCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                    }
                    }
                    if("98".equals(status)){
                        //设置异常单操作
                        if (checkDistance==true&&distanceReason!=null){
                            Response responseSetOrderAbnormal =setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,"0");
                            jsonUtil.setJsonBody(jsonUtil.stringToJson(responseSetOrderAbnormal.asString()));
                            if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                                setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,distanceReason);
                            }
                        }else {
                            setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                        //获取订单状态为98时的关键字段校验结果
                        order = orderSearch.orderSearch(id);
                        if (checkOrder==true){
                            orderCheckModel = orderCheck.orderAbnormalCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                        }
                    }
                }
                break;
            case "10":
                if ("15".equals(status)){
                    //离店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseObtainGood =obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseObtainGood.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    //获取订单状态为15时的关键字段校验结果
                    order = orderSearch.orderSearch(id);
                    if (checkOrder==true){ 
                        orderCheckModel = orderCheck.orderObtainCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                    }
                }
                if ("100".equals(status)||"98".equals(status)){
                    //离店操作
                    if (checkDistance==true&&distanceReason!=null){
                        Response responseObtainGood =obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,"0");
                        jsonUtil.setJsonBody(jsonUtil.stringToJson(responseObtainGood.asString()));
                        if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                            obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                    }else {
                        obtainGood.ObtainGoodOperation(order,riderDTO,checkDistance,distanceReason);
                    }
                    sleep(65000);
                    if("100".equals(status)){
                        //送达操作
                        if (checkDistance==true&&distanceReason!=null){
                            Response responseFinishOrder =finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,"0");
                            jsonUtil.setJsonBody(jsonUtil.stringToJson(responseFinishOrder.asString()));
                            if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                                finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,distanceReason);
                            }
                        }else {
                            finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                        //获取订单状态为100时的关键字段校验结果
                        order = orderSearch.orderSearch(id);
                        if (checkOrder==true){ 
                        orderCheckModel = orderCheck.orderFinishCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                    }
                   }
                    if("98".equals(status)){
                        //设置异常单操作
                        if (checkDistance==true&&distanceReason!=null){
                            Response responseSetOrderAbnormal =setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,"0");
                            jsonUtil.setJsonBody(jsonUtil.stringToJson(responseSetOrderAbnormal.asString()));
                            if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                                setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,distanceReason);
                            }
                        }else {
                            setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                        //获取订单状态为98时的关键字段校验结果
                        order = orderSearch.orderSearch(id);
                        if (checkOrder==true){
                            orderCheckModel = orderCheck.orderAbnormalCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                        }
                    }
                }
                break;
            case "15":
                if ("100".equals(status)||"98".equals(status)){
                    sleep(65000);
                    if("100".equals(status)){
                        //送达操作
                        if (checkDistance==true&&distanceReason!=null){
                            Response responseFinishOrder =finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,"0");
                            jsonUtil.setJsonBody(jsonUtil.stringToJson(responseFinishOrder.asString()));
                            if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                                finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,distanceReason);
                            }
                        }else {
                            finishOrder.FinishOrderOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                        //获取订单状态为100时的关键字段校验结果
                        order = orderSearch.orderSearch(id);
                        if (checkOrder==true){ 
                        orderCheckModel = orderCheck.orderFinishCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                    }
                    }
                    if("98".equals(status)){
                        //设置异常单操作
                        if (checkDistance==true&&distanceReason!=null){
                            Response responseSetOrderAbnormal =setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,"0");
                            jsonUtil.setJsonBody(jsonUtil.stringToJson(responseSetOrderAbnormal.asString()));
                            if("订单超距".equals(String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")))){
                                setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,distanceReason);
                            }
                        }else {
                            setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO,checkDistance,distanceReason);
                        }
                        //获取订单状态为98时的关键字段校验结果
                        order = orderSearch.orderSearch(id);
                        if (checkOrder==true){
                            orderCheckModel = orderCheck.orderAbnormalCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
                        }
                    }
                }
        }
        orderList.add(orderCheckModel);
        map.put("orderCheck",orderList);
        if (checkDistance==true) {
            orderFoulRecord = orderFoulRecordSearch.getOrderFoulRecordByriderIdAndOrderIdAndOrderPahse(order, status);
            orderFoulRecordList.add(orderFoulRecord);
            map.put("orderFoulRecordList",orderFoulRecordList);
        }
        if (checkWorkorder == true){
            if ("10".equals(status)){
                sleep(3000);
                List<Workorder> workorderList = workorderMapper.getWorkorderByServiceIdAndItemCodeAndSourceIdByArrive(order);
                map.put("workorderList",workorderList);
            }
            if ("15".equals(status)){
                sleep(3000);
                List<Workorder> workorderList = workorderMapper.getWorkorderByServiceIdAndItemCodeAndSourceIdByObtain(order);
                map.put("workorderList",workorderList);
            }
            if ("100".equals(status)||"98".equals(status)){
                sleep(3000);
                List<Workorder> workorderList = workorderMapper.getWorkorderByServiceIdAndItemCodeAndSourceIdByFinish(order);
                map.put("workorderList",workorderList);
            }
        }
        switch(status){
            case "5":
                jsonData = new JsonData(0,map,"抢单成功");
                break;
            case "10":
                jsonData = new JsonData(0,map,"到店成功");
                break;
            case "15":
                jsonData = new JsonData(0,map,"离店成功");
                break;
            case "100":
                jsonData = new JsonData(0,map,"送达成功");
                break;
            case "98":
                jsonData = new JsonData(0,map,"异常完成成功");
                break;
        }
        return jsonData;
    }
}
