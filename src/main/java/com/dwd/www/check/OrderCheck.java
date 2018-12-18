package com.dwd.www.check;

import com.dwd.www.db.cobarc_shard3.domain.Order;
import com.dwd.www.en.OrderStatusEnum;
import com.dwd.www.model.OrderCheckModel;
import org.apache.commons.lang.time.DateFormatUtils;

/**
 * Created by Chen WenJie on 2018/12/14.
 */
public class OrderCheck {

    //已下单状态订单order表校验
    public OrderCheckModel placedOrderCheck(String riderId, String orderId, Order order, OrderCheckModel orderCheckModel){
        String riderIdCheck = "".equals(String.valueOf(order.getRiderId()))?"riderId对比通过":"riderId对比不通过，应当为空,实际为"+order.getRiderId();
        String orderIdCheck = orderId.equals(String.valueOf(order.getId()))?"orderId对比通过":"orderId对比不通过，应当为："+orderId+",实际为"+order.getId();
        String statusCheck = OrderStatusEnum.PLACED.getCode().equals(String.valueOf(order.getStatus()))?"status对比通过":"status对比不通过，应当为："+OrderStatusEnum.PLACED.getCode()+",实际为"+order.getStatus();
        String dispatchTmCheck = null != order.getDispatchTm()?"dispatchTm对比通过":"dispatchTm对比不通过，应当为："+(order.getDispatchTm()!=null?DateFormatUtils.format(order.getDispatchTm(),"yyyy-MM-dd HH:mm:ss"):null)+",实际为空";
        orderCheckModel.setId(orderId);
        orderCheckModel.setRiderIdCheck(riderIdCheck);
        orderCheckModel.setOrderIdCheck(orderIdCheck);
        orderCheckModel.setStatusCheck(statusCheck);
        orderCheckModel.setDispatchTmCheck(dispatchTmCheck);
        return orderCheckModel;
    }

    //抢单状态订单order表校验
    public OrderCheckModel orderRobedCheck(String riderId,String orderId,Order order,OrderCheckModel orderCheckModel){
        String riderIdCheck = riderId.equals(String.valueOf(order.getRiderId()))?"riderId对比通过":"riderId对比不通过，应当为："+riderId+",实际为"+order.getRiderId();
        String orderIdCheck = orderId.equals(String.valueOf(order.getId()))?"orderId对比通过":"orderId对比不通过，应当为："+orderId+",实际为"+order.getId();
        String statusCheck = OrderStatusEnum.ROBED.getCode().equals(String.valueOf(order.getStatus()))?"status对比通过":"status对比不通过，应当为："+OrderStatusEnum.ROBED.getCode()+",实际为"+order.getStatus();
        String dispatchTmCheck = null != order.getDispatchTm()?"dispatchTm对比通过":"dispatchTm对比不通过，应当为："+(order.getDispatchTm()!=null?DateFormatUtils.format(order.getDispatchTm(),"yyyy-MM-dd HH:mm:ss"):null)+",实际为空";
        orderCheckModel.setId(orderId);
        orderCheckModel.setRiderIdCheck(riderIdCheck);
        orderCheckModel.setOrderIdCheck(orderIdCheck);
        orderCheckModel.setStatusCheck(statusCheck);
        orderCheckModel.setDispatchTmCheck(dispatchTmCheck);
        return orderCheckModel;
    }

    //到店状态订单order表校验
    public OrderCheckModel orderArriveCheck(String riderId,String orderId,Order order,OrderCheckModel orderCheckModel){
        String riderIdCheck = riderId.equals(String.valueOf(order.getRiderId()))?"riderId对比通过":"riderId对比不通过，应当为："+riderId+",实际为"+order.getRiderId();
        String orderIdCheck = orderId.equals(String.valueOf(order.getId()))?"orderId对比通过":"orderId对比不通过，应当为："+orderId+",实际为"+order.getId();
        String statusCheck = OrderStatusEnum.ARRIVED.getCode().equals(String.valueOf(order.getStatus()))?"status对比通过":"status对比不通过，应当为："+OrderStatusEnum.ARRIVED.getCode()+",实际为"+order.getStatus();
        String dispatchTmCheck = null != order.getDispatchTm()?"dispatchTm对比通过":"dispatchTm对比不通过，应当为："+(order.getDispatchTm()!=null?DateFormatUtils.format(order.getDispatchTm(),"yyyy-MM-dd HH:mm:ss"):null)+",实际为空";
        String arriveTmCheck = null != order.getArriveTm()?"arriveTm对比通过":"arriveTm对比不通过，应当为:"+(order.getArriveTm()!=null?DateFormatUtils.format(order.getArriveTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        orderCheckModel.setId(orderId);
        orderCheckModel.setRiderIdCheck(riderIdCheck);
        orderCheckModel.setOrderIdCheck(orderIdCheck);
        orderCheckModel.setStatusCheck(statusCheck);
        orderCheckModel.setDispatchTmCheck(dispatchTmCheck);
        orderCheckModel.setArriveTmCheck(arriveTmCheck);
        return orderCheckModel;
    }

    //离店状态订单order表校验
    public OrderCheckModel orderObtainCheck(String riderId,String orderId,Order order,OrderCheckModel orderCheckModel){
        String riderIdCheck = riderId.equals(String.valueOf(order.getRiderId()))?"riderId对比通过":"riderId对比不通过，应当为："+riderId+",实际为"+order.getRiderId();
        String orderIdCheck = orderId.equals(String.valueOf(order.getId()))?"orderId对比通过":"orderId对比不通过，应当为："+orderId+",实际为"+order.getId();
        String statusCheck = OrderStatusEnum.LEAVED.getCode().equals(String.valueOf(order.getStatus()))?"status对比通过":"status对比不通过，应当为："+OrderStatusEnum.LEAVED.getCode()+",实际为"+order.getStatus();
        String dispatchTmCheck = null != order.getDispatchTm()?"dispatchTm对比通过":"dispatchTm对比不通过，应当为："+(order.getDispatchTm()!=null?DateFormatUtils.format(order.getDispatchTm(),"yyyy-MM-dd HH:mm:ss"):null)+",实际为空";
        String arriveTmCheck = null != order.getArriveTm()?"arriveTm对比通过":"arriveTm对比不通过，应当为:"+(order.getArriveTm()!=null?DateFormatUtils.format(order.getArriveTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        String leaveTmCheck = null != order.getLeaveTm()?"leaveTm对比通过":"leaveTm对比不通过，应当为:"+(order.getLeaveTm()!=null?DateFormatUtils.format(order.getLeaveTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        orderCheckModel.setId(orderId);
        orderCheckModel.setRiderIdCheck(riderIdCheck);
        orderCheckModel.setOrderIdCheck(orderIdCheck);
        orderCheckModel.setStatusCheck(statusCheck);
        orderCheckModel.setDispatchTmCheck(dispatchTmCheck);
        orderCheckModel.setArriveTmCheck(arriveTmCheck);
        orderCheckModel.setLeaveTmCheck(leaveTmCheck);
        return orderCheckModel;
    }

    //完成状态订单order表校验
    public OrderCheckModel orderFinishCheck(String riderId,String orderId,Order order,OrderCheckModel orderCheckModel){
        String riderIdCheck = riderId.equals(String.valueOf(order.getRiderId()))?"riderId对比通过":"riderId对比不通过，应当为："+riderId+",实际为"+order.getRiderId();
        String orderIdCheck = orderId.equals(String.valueOf(order.getId()))?"orderId对比通过":"orderId对比不通过，应当为："+orderId+",实际为"+order.getId();
        String statusCheck = OrderStatusEnum.FINISHED.getCode().equals(String.valueOf(order.getStatus()))?"status对比通过":"status对比不通过，应当为："+OrderStatusEnum.FINISHED.getCode()+",实际为"+order.getStatus();
        String dispatchTmCheck = null != order.getDispatchTm()?"dispatchTm对比通过":"dispatchTm对比不通过，应当为："+(order.getDispatchTm()!=null?DateFormatUtils.format(order.getDispatchTm(),"yyyy-MM-dd HH:mm:ss"):null)+",实际为空";
        String arriveTmCheck = null != order.getArriveTm()?"arriveTm对比通过":"arriveTm对比不通过，应当为:"+(order.getArriveTm()!=null?DateFormatUtils.format(order.getArriveTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        String leaveTmCheck = null != order.getLeaveTm()?"leaveTm对比通过":"leaveTm对比不通过，应当为:"+(order.getLeaveTm()!=null?DateFormatUtils.format(order.getLeaveTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        String finishTmCheck = null != order.getFinishTm()?"finishTm对比通过":"finishTm对比不通过，应当为:"+(order.getFinishTm()!=null?DateFormatUtils.format(order.getFinishTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        orderCheckModel.setId(orderId);
        orderCheckModel.setRiderIdCheck(riderIdCheck);
        orderCheckModel.setOrderIdCheck(orderIdCheck);
        orderCheckModel.setStatusCheck(statusCheck);
        orderCheckModel.setDispatchTmCheck(dispatchTmCheck);
        orderCheckModel.setArriveTmCheck(arriveTmCheck);
        orderCheckModel.setLeaveTmCheck(leaveTmCheck);
        orderCheckModel.setFinishTmCheck(finishTmCheck);
        return orderCheckModel;
    }

    //异常完成状态订单order表校验
    public OrderCheckModel orderAbnormalCheck(String riderId,String orderId,Order order,OrderCheckModel orderCheckModel){
        String riderIdCheck = riderId.equals(String.valueOf(order.getRiderId()))?"riderId对比通过":"riderId对比不通过，应当为："+riderId+",实际为"+order.getRiderId();
        String orderIdCheck = orderId.equals(String.valueOf(order.getId()))?"orderId对比通过":"orderId对比不通过，应当为："+orderId+",实际为"+order.getId();
        String statusCheck = OrderStatusEnum.ABNORMALED.getCode().equals(String.valueOf(order.getStatus()))?"status对比通过":"status对比不通过，应当为："+OrderStatusEnum.ABNORMALED.getCode()+",实际为"+order.getStatus();
        String dispatchTmCheck = null != order.getDispatchTm()?"dispatchTm对比通过":"dispatchTm对比不通过，应当为："+(order.getDispatchTm()!=null?DateFormatUtils.format(order.getDispatchTm(),"yyyy-MM-dd HH:mm:ss"):null)+",实际为空";
        String arriveTmCheck = null != order.getArriveTm()?"arriveTm对比通过":"arriveTm对比不通过，应当为:"+(order.getArriveTm()!=null?DateFormatUtils.format(order.getArriveTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        String leaveTmCheck = null != order.getLeaveTm()?"leaveTm对比通过":"leaveTm对比不通过，应当为:"+(order.getLeaveTm()!=null?DateFormatUtils.format(order.getLeaveTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        String finishTmCheck = null != order.getFinishTm()?"finishTm对比通过":"finishTm对比不通过，应当为:"+(order.getFinishTm()!=null?DateFormatUtils.format(order.getFinishTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        orderCheckModel.setId(orderId);
        orderCheckModel.setRiderIdCheck(riderIdCheck);
        orderCheckModel.setOrderIdCheck(orderIdCheck);
        orderCheckModel.setStatusCheck(statusCheck);
        orderCheckModel.setDispatchTmCheck(dispatchTmCheck);
        orderCheckModel.setArriveTmCheck(arriveTmCheck);
        orderCheckModel.setLeaveTmCheck(leaveTmCheck);
        orderCheckModel.setFinishTmCheck(finishTmCheck);
        return orderCheckModel;
    }

    //取消状态订单order表校验
    public OrderCheckModel orderCanceledCheck(String riderId,String orderId,Order order,OrderCheckModel orderCheckModel){
        String riderIdCheck = riderId.equals(String.valueOf(order.getRiderId()))||(String.valueOf(order.getRiderId())== null)?"riderId对比通过":"riderId对比不通过，应当为空或者为："+riderId+",实际为"+order.getRiderId();
        String orderIdCheck = orderId.equals(String.valueOf(order.getId()))?"orderId对比通过":"orderId对比不通过，应当为："+orderId+",实际为"+order.getId();
        String statusCheck = OrderStatusEnum.CANCELED.getCode().equals(String.valueOf(order.getStatus()))?"status对比通过":"status对比不通过，应当为："+OrderStatusEnum.ABNORMALED.getCode()+",实际为"+order.getStatus();
        String dispatchTmCheck = null != order.getDispatchTm()?"dispatchTm对比通过":"dispatchTm对比不通过，应当为："+(order.getDispatchTm()!=null?DateFormatUtils.format(order.getDispatchTm(),"yyyy-MM-dd HH:mm:ss"):null)+",实际为空";
        String arriveTmCheck = null != order.getArriveTm()?"arriveTm对比通过":"arriveTm对比不通过，应当为:"+(order.getArriveTm()!=null?DateFormatUtils.format(order.getArriveTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        String leaveTmCheck = null != order.getLeaveTm()?"leaveTm对比通过":"leaveTm对比不通过，应当为:"+(order.getLeaveTm()!=null?DateFormatUtils.format(order.getLeaveTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        String finishTmCheck = null != order.getFinishTm()?"finishTm对比通过":"finishTm对比不通过，应当为:"+(order.getFinishTm()!=null?DateFormatUtils.format(order.getFinishTm(),"yyyy-MM-dd HH:mm:ss"):null)+"实际为空";
        orderCheckModel.setId(orderId);
        orderCheckModel.setRiderIdCheck(riderIdCheck);
        orderCheckModel.setOrderIdCheck(orderIdCheck);
        orderCheckModel.setStatusCheck(statusCheck);
        orderCheckModel.setDispatchTmCheck(dispatchTmCheck);
        orderCheckModel.setArriveTmCheck(arriveTmCheck);
        orderCheckModel.setLeaveTmCheck(leaveTmCheck);
        orderCheckModel.setFinishTmCheck(finishTmCheck);
        return orderCheckModel;

    }



}
