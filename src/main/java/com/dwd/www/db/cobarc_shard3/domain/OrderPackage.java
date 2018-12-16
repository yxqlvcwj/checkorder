package com.dwd.www.db.cobarc_shard3.domain;

import java.math.BigDecimal;
import java.util.Date;

public class OrderPackage {
    private Long id;

    private String code;

    private Integer status;

    private String outterGroup;

    private Integer serialId;

    private Date insTm;

    private Date finishTm;

    private Date delieveredTm;

    private Date leaveShopTm;

    private Date arriveShopTm;

    private Date dispatchTm;

    private Integer orderCount;

    private Integer initOrderCount;

    private Integer abnormalOrderCount;

    private Integer fromLat;

    private Integer fromLng;

    private Integer toLat;

    private Integer toLng;

    private String fromAddr;

    private String toAddr;

    private Integer platformId;

    private Integer shopId;

    private Integer riderId;

    private String platformName;

    private Integer cityId;

    private Integer shardx;

    private String remark;

    private BigDecimal tip;

    private Integer version;

    private Integer distance;

    private String feature;

    private String shopTitle;

    private Integer reasonCode;

    private String why;

    private Integer orderType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOutterGroup() {
        return outterGroup;
    }

    public void setOutterGroup(String outterGroup) {
        this.outterGroup = outterGroup == null ? null : outterGroup.trim();
    }

    public Integer getSerialId() {
        return serialId;
    }

    public void setSerialId(Integer serialId) {
        this.serialId = serialId;
    }

    public Date getInsTm() {
        return insTm;
    }

    public void setInsTm(Date insTm) {
        this.insTm = insTm;
    }

    public Date getFinishTm() {
        return finishTm;
    }

    public void setFinishTm(Date finishTm) {
        this.finishTm = finishTm;
    }

    public Date getDelieveredTm() {
        return delieveredTm;
    }

    public void setDelieveredTm(Date delieveredTm) {
        this.delieveredTm = delieveredTm;
    }

    public Date getLeaveShopTm() {
        return leaveShopTm;
    }

    public void setLeaveShopTm(Date leaveShopTm) {
        this.leaveShopTm = leaveShopTm;
    }

    public Date getArriveShopTm() {
        return arriveShopTm;
    }

    public void setArriveShopTm(Date arriveShopTm) {
        this.arriveShopTm = arriveShopTm;
    }

    public Date getDispatchTm() {
        return dispatchTm;
    }

    public void setDispatchTm(Date dispatchTm) {
        this.dispatchTm = dispatchTm;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getInitOrderCount() {
        return initOrderCount;
    }

    public void setInitOrderCount(Integer initOrderCount) {
        this.initOrderCount = initOrderCount;
    }

    public Integer getAbnormalOrderCount() {
        return abnormalOrderCount;
    }

    public void setAbnormalOrderCount(Integer abnormalOrderCount) {
        this.abnormalOrderCount = abnormalOrderCount;
    }

    public Integer getFromLat() {
        return fromLat;
    }

    public void setFromLat(Integer fromLat) {
        this.fromLat = fromLat;
    }

    public Integer getFromLng() {
        return fromLng;
    }

    public void setFromLng(Integer fromLng) {
        this.fromLng = fromLng;
    }

    public Integer getToLat() {
        return toLat;
    }

    public void setToLat(Integer toLat) {
        this.toLat = toLat;
    }

    public Integer getToLng() {
        return toLng;
    }

    public void setToLng(Integer toLng) {
        this.toLng = toLng;
    }

    public String getFromAddr() {
        return fromAddr;
    }

    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr == null ? null : fromAddr.trim();
    }

    public String getToAddr() {
        return toAddr;
    }

    public void setToAddr(String toAddr) {
        this.toAddr = toAddr == null ? null : toAddr.trim();
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getRiderId() {
        return riderId;
    }

    public void setRiderId(Integer riderId) {
        this.riderId = riderId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getShardx() {
        return shardx;
    }

    public void setShardx(Integer shardx) {
        this.shardx = shardx;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getTip() {
        return tip;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public String getShopTitle() {
        return shopTitle;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle == null ? null : shopTitle.trim();
    }

    public Integer getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Integer reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why == null ? null : why.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
}