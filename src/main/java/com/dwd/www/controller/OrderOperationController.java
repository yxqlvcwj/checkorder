//package com.dwd.www.controller;
//
//import com.alibaba.fastjson.JSONPath;
//import com.dwd.www.check.OrderCheck;
//import com.dwd.www.db.cobarc_shard3.domain.Order;
//import com.dwd.www.db.cobarc_shard3.domain.OrderFoulRecord;
//import com.dwd.www.db.workorderdb.mapper.WorkorderMapper;
//import com.dwd.www.model.OrderCheckModel;
//import com.dwd.www.model.RiderDTO;
//import com.dwd.www.service.*;
//import com.dwd.www.untils.JsonData;
//import com.dwd.www.untils.JsonUtil;
//import io.restassured.response.Response;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.util.ObjectUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import static java.lang.Thread.sleep;
//
///**
// * 订单操作
// * Created by Chen WenJie on 2018/12/18.
// */
//@Controller
//public class OrderOperationController {
//    @Autowired
//    private RiderLoginAndComToWork riderLogin;
//
//    @Autowired
//    private OrderSearch orderSearch;
//
//    @Autowired
//    private RobOrder robOrder;
//
//    @Autowired
//    private ArriveShop arriveShop;
//
//    @Autowired
//    private ObtainGood obtainGood;
//
//    @Autowired
//    private FinishOrder finishOrder;
//
//    @Autowired
//    private SetOrderAbnormal setOrderAbnormal;
//
//    @Autowired
//    private WorkorderSearch workorderSearch;
//
//    @Autowired
//    private OrderFoulRecordSearch orderFoulRecordSearch;
//
//    @Autowired
//    private WorkorderMapper workorderMapper;
//
//    private OrderCheck orderCheck = new OrderCheck();
//
//    @GetMapping("/order/operation")
//    public JsonData login(String id, String startStatus, String status, boolean checkOrder, boolean checkDistance, boolean checkWorkorder, String mobile, ModelMap modelMap) throws InterruptedException {
//        JsonUtil jsonUtil = new JsonUtil();
//        Map<String,List> map = new HashMap<>();
//        List<OrderCheckModel> orderList = new ArrayList<>();
//        List<OrderFoulRecord> orderFoulRecordList = new ArrayList<>();
//        OrderCheckModel orderCheckModel = new OrderCheckModel();
//        JsonData jsonData ;
//        Order order = orderSearch.orderSearch(id);
//        RiderDTO riderDTO = riderLogin.login(order,mobile);
//        if (order!=null&&order.getRiderId()!=null){
//            riderDTO.setRiderId(String.valueOf(order.getRiderId()));
//        }
//        if(ObjectUtils.isEmpty(order)){
//            return new JsonData(-1,"订单不存在，请检查订单号是否正确");
//        }
//        if(Integer.parseInt(startStatus)>=Integer.parseInt(status)){
//            return new JsonData(-1,"目标状态需要是当前状态之后的状态");
//        }
//        switch (startStatus){
//            case "0":
//                if ("5".equals(status)){
//                    //抢单操作
//                    Response response = robOrder.RobOrderOperation(order,riderDTO);
//                    //工具类，进行response的处理，方便取值
//                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
//                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
//                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
//                    }
//                    //获取订单状态为5时的关键字段校验结果
//                    orderCheckModel = orderCheck.orderRobedCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
//                    return  new JsonData(1,"抢单成功");
//                }
//                if ("10".equals(status)){
//                    //抢单操作
//                    Response response = robOrder.RobOrderOperation(order,riderDTO);
//                    //工具类，进行response的处理，方便取值
//                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
//                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
//                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
//                    }
//                    //到店操作
//                    arriveShop.ArriveShopOperation(order,riderDTO);
//                    //获取订单状态为10时的关键字段校验结果
//                    orderCheckModel = orderCheck.orderArriveCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
//                    return  new JsonData(1,"到店成功");
//                }
//
//                if ("15".equals(status)){
//                    //抢单操作
//                    Response response = robOrder.RobOrderOperation(order,riderDTO);
//                    //工具类，进行response的处理，方便取值
//                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
//                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
//                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
//                    }
//                    //到店操作
//                    arriveShop.ArriveShopOperation(order,riderDTO);
//                    //离店操作
//                    obtainGood.ObtainGoodOperation(order,riderDTO);
//                    //获取订单状态为15时的关键字段校验结果
//                    orderCheckModel = orderCheck.orderObtainCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
//                    return  new JsonData(1,"离店成功");
//                }
//                if ("100".equals(status)||"98".equals(status)){
//                    //抢单操作
//                    Response response = robOrder.RobOrderOperation(order,riderDTO);
//                    //工具类，进行response的处理，方便取值
//                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
//                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
//                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
//                    }
//                    //到店操作
//                    arriveShop.ArriveShopOperation(order,riderDTO);
//                    //离店操作
//                    obtainGood.ObtainGoodOperation(order,riderDTO);
//                    sleep(65000);
//                    if("100".equals(status)){
//                        //送达操作
//                        finishOrder.FinishOrderOperation(order,riderDTO);
//                        //获取订单状态为100时的关键字段校验结果
//                        orderCheckModel = orderCheck.orderFinishCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
//                        return  new JsonData(1,"送达成功");
//                    }
//                    if("98".equals(status)){
//                        //设置异常单操作
//                        setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO);
//                        //获取订单状态为98时的关键字段校验结果
//                        orderCheckModel = orderCheck.orderAbnormalCheck(riderDTO.getRiderId(),id,order,orderCheckModel);
//                        return  new JsonData(1,"设置异常单成功");
//                    }
//                }
//            case "5":
//                if ("10".equals(status)){
//                    //抢单操作
//                    Response response = robOrder.RobOrderOperation(order,riderDTO);
//                    //工具类，进行response的处理，方便取值
//                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
//                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
//                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
//                    }
//                    //到店操作
//                    arriveShop.ArriveShopOperation(order,riderDTO);
//                    return  new JsonData(1,"到店成功");
//                }
//                if ("15".equals(status)){
//                    //抢单操作
//                    Response response = robOrder.RobOrderOperation(order,riderDTO);
//                    //工具类，进行response的处理，方便取值
//                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
//                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
//                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
//                    }
//                    //到店操作
//                    arriveShop.ArriveShopOperation(order,riderDTO);
//                    //离店操作
//                    obtainGood.ObtainGoodOperation(order,riderDTO);
//                    return  new JsonData(1,"离店成功");
//                }
//                if ("100".equals(status)||"98".equals(status)){
//                    //抢单操作
//                    Response response = robOrder.RobOrderOperation(order,riderDTO);
//                    //工具类，进行response的处理，方便取值
//                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
//                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
//                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
//                    }
//                    //到店操作
//                    arriveShop.ArriveShopOperation(order,riderDTO);
//                    //离店操作
//                    obtainGood.ObtainGoodOperation(order,riderDTO);
//                    sleep(65000);
//                    if("100".equals(status)){
//                        //送达操作
//                        finishOrder.FinishOrderOperation(order,riderDTO);
//                        return  new JsonData(1,"送达成功");
//                    }
//                    if("98".equals(status)){
//                        //设置异常单操作
//                        setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO);
//                        return  new JsonData(1,"设置异常单成功");
//                    }
//                }
//            case "10":
//                if ("15".equals(status)){
//                    //抢单操作
//                    Response response = robOrder.RobOrderOperation(order,riderDTO);
//                    //工具类，进行response的处理，方便取值
//                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
//                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
//                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
//                    }
//                    //到店操作
//                    arriveShop.ArriveShopOperation(order,riderDTO);
//                    //离店操作
//                    obtainGood.ObtainGoodOperation(order,riderDTO);
//                    return  new JsonData(1,"离店成功");
//                }
//                if ("100".equals(status)||"98".equals(status)){
//                    //抢单操作
//                    Response response = robOrder.RobOrderOperation(order,riderDTO);
//                    //工具类，进行response的处理，方便取值
//                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
//                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
//                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
//                    }
//                    //到店操作
//                    arriveShop.ArriveShopOperation(order,riderDTO);
//                    //离店操作
//                    obtainGood.ObtainGoodOperation(order,riderDTO);
//                    sleep(65000);
//                    if("100".equals(status)){
//                        //送达操作
//                        finishOrder.FinishOrderOperation(order,riderDTO);
//                        return  new JsonData(1,"送达成功");
//                    }
//                    if("98".equals(status)){
//                        //设置异常单操作
//                        setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO);
//                        return  new JsonData(1,"设置异常单成功");
//                    }
//                }
//            case "15":
//                if ("100".equals(status)||"98".equals(status)){
//                    //抢单操作
//                    Response response = robOrder.RobOrderOperation(order,riderDTO);
//                    //工具类，进行response的处理，方便取值
//                    jsonUtil.setJsonBody(jsonUtil.stringToJson(response.asString()));
//                    if(JSONPath.eval(jsonUtil.getJsonBody(), "$.data.successText")==null){
//                        return  new JsonData(-1,String.valueOf(JSONPath.eval(jsonUtil.getJsonBody(), "$.msg")));
//                    }
//                    //到店操作
//                    arriveShop.ArriveShopOperation(order,riderDTO);
//                    //离店操作
//                    obtainGood.ObtainGoodOperation(order,riderDTO);
//                    sleep(65000);
//                    if("100".equals(status)){
//                        //送达操作
//                        finishOrder.FinishOrderOperation(order,riderDTO);
//                        return  new JsonData(1,"送达成功");
//                    }
//                    if("98".equals(status)){
//                        //设置异常单操作
//                        setOrderAbnormal.SetOrderAbnormalOperation(order,riderDTO);
//                        return  new JsonData(1,"设置异常单成功");
//                    }
//                }
//        }
//        return  new JsonData(1,"不存在选择的节点，请检查选择是否正确");
//    }
//}
