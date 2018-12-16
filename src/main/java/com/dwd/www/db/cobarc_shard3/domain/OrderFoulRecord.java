package com.dwd.www.db.cobarc_shard3.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.Date;

public class OrderFoulRecord {
    private Long id;

    private Integer riderId;

    private Integer cityId;

    private Long orderId;

    private Byte orderPhase;

    private Byte foulReason;

    private String remark;

    private Integer riderLng;

    private Integer riderLat;

    private Byte dealType;

    private Date insTm;

    private Date updTm;

    private Integer shardx;

    private Integer shardy;

    private Integer shardz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRiderId() {
        return riderId;
    }

    public void setRiderId(Integer riderId) {
        this.riderId = riderId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Byte getOrderPhase() {
        return orderPhase;
    }

    public void setOrderPhase(Byte orderPhase) {
        this.orderPhase = orderPhase;
    }

    public Byte getFoulReason() {
        return foulReason;
    }

    public void setFoulReason(Byte foulReason) {
        this.foulReason = foulReason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getRiderLng() {
        return riderLng;
    }

    public void setRiderLng(Integer riderLng) {
        this.riderLng = riderLng;
    }

    public Integer getRiderLat() {
        return riderLat;
    }

    public void setRiderLat(Integer riderLat) {
        this.riderLat = riderLat;
    }

    public Byte getDealType() {
        return dealType;
    }

    public void setDealType(Byte dealType) {
        this.dealType = dealType;
    }

    public Date getInsTm() {
        return insTm;
    }

    public void setInsTm(Date insTm) {
        this.insTm = insTm;
    }

    public Date getUpdTm() {
        return updTm;
    }

    public void setUpdTm(Date updTm) {
        this.updTm = updTm;
    }

    public Integer getShardx() {
        return shardx;
    }

    public void setShardx(Integer shardx) {
        this.shardx = shardx;
    }

    public Integer getShardy() {
        return shardy;
    }

    public void setShardy(Integer shardy) {
        this.shardy = shardy;
    }

    public Integer getShardz() {
        return shardz;
    }

    public void setShardz(Integer shardz) {
        this.shardz = shardz;
    }

    /**
     * SerializerFeature.WriteDateUseDateFormat：中国人习惯的标准时间格式
     * @return
     */
    @Override
    public String toString() {
        return JSON.toJSONString(this, SerializerFeature.PrettyFormat,SerializerFeature.WriteDateUseDateFormat);
    }
}