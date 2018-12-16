package com.dwd.www.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * order表校验对象
 * Created by Chen WenJie on 2018/12/14.
 */
public class OrderCheckModel {
    private String id;
    private String riderIdCheck;
    private String orderIdCheck;
    private String statusCheck;
    private String dispatchTmCheck;
    private String arriveTmCheck;
    private String leaveTmCheck;
    private String finishTmCheck;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRiderIdCheck() {
        return riderIdCheck;
    }

    public void setRiderIdCheck(String riderIdCheck) {
        this.riderIdCheck = riderIdCheck;
    }

    public String getOrderIdCheck() {
        return orderIdCheck;
    }

    public void setOrderIdCheck(String orderIdCheck) {
        this.orderIdCheck = orderIdCheck;
    }

    public String getStatusCheck() {
        return statusCheck;
    }

    public void setStatusCheck(String statusCheck) {
        this.statusCheck = statusCheck;
    }

    public String getDispatchTmCheck() {
        return dispatchTmCheck;
    }

    public void setDispatchTmCheck(String dispatchTmCheck) {
        this.dispatchTmCheck = dispatchTmCheck;
    }

    public String getArriveTmCheck() {
        return arriveTmCheck;
    }

    public void setArriveTmCheck(String arriveTmCheck) {
        this.arriveTmCheck = arriveTmCheck;
    }

    public String getLeaveTmCheck() {
        return leaveTmCheck;
    }

    public void setLeaveTmCheck(String leaveTmCheck) {
        this.leaveTmCheck = leaveTmCheck;
    }

    public String getFinishTmCheck() {
        return finishTmCheck;
    }

    public void setFinishTmCheck(String finishTmCheck) {
        this.finishTmCheck = finishTmCheck;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this, SerializerFeature.PrettyFormat);
    }
}
