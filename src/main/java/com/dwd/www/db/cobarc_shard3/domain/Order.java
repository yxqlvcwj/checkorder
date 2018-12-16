package com.dwd.www.db.cobarc_shard3.domain;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.Date;

public class Order {
    private Long id;

    private Integer cityId;

    private String code;

    private Integer shopId;

    private String shopTitle;

    private Integer platformShopid;

    private Integer riderId;

    private Byte status;

    private String fromAddr;

    private Integer fromLng;

    private Integer fromLat;

    private String fromTel;

    private String toAddr;

    private Integer toLng;

    private Integer toLat;

    private String toTel;

    private String toName;

    private Integer distance;

    private Date placeTm;

    private Date recordTm;

    private Date dispatchTm;

    private Date arriveTm;

    private Date acceptTm;

    private Date leaveTm;

    private Date finishTm;

    private Date requireTm;

    private Date arriveableTm;

    private Date leaveableTm;

    private Date dispatchableTm;

    private Integer takeDur;

    private String why;

    private Byte paid;

    private Byte requireRiderType;

    private Byte realRiderType;

    private Byte payWay;

    private Integer cancelReason;

    private Byte source;

    private String channelId;

    private String serialId;

    private String tradeId;

    private Integer tradingAreaId;

    private Integer shopRegionId;

    private Integer riderRegionId;

    private Byte orderType;

    private String remarks;

    private Byte switchTimes;

    private Byte overTime;

    private Byte modified;

    private Byte dispatchMode;

    private String feature;

    private Integer shardx;

    private Integer shardy;

    private Integer shardz;

    private Integer groupId;

    private Byte contractType;

    private String goodsType;

    private Integer weight;

    private String requireTag;

    private String requireLevel;

    private String outterGroup;

    private Integer recruitTaskId;

    private String waybillNo;

    private String waybillNoSuffix;

    private Integer platformRegionId;

    private Long companyId;

    private Integer standard;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopTitle() {
        return shopTitle;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle == null ? null : shopTitle.trim();
    }

    public Integer getPlatformShopid() {
        return platformShopid;
    }

    public void setPlatformShopid(Integer platformShopid) {
        this.platformShopid = platformShopid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getRiderId() {
        return riderId;
    }

    public void setRiderId(Integer riderId) {
        this.riderId = riderId;
    }



    public String getFromAddr() {
        return fromAddr;
    }

    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr == null ? null : fromAddr.trim();
    }

    public Integer getFromLng() {
        return fromLng;
    }

    public void setFromLng(Integer fromLng) {
        this.fromLng = fromLng;
    }

    public Integer getFromLat() {
        return fromLat;
    }

    public void setFromLat(Integer fromLat) {
        this.fromLat = fromLat;
    }

    public String getFromTel() {
        return fromTel;
    }

    public void setFromTel(String fromTel) {
        this.fromTel = fromTel == null ? null : fromTel.trim();
    }

    public String getToAddr() {
        return toAddr;
    }

    public void setToAddr(String toAddr) {
        this.toAddr = toAddr == null ? null : toAddr.trim();
    }

    public Integer getToLng() {
        return toLng;
    }

    public void setToLng(Integer toLng) {
        this.toLng = toLng;
    }

    public Integer getToLat() {
        return toLat;
    }

    public void setToLat(Integer toLat) {
        this.toLat = toLat;
    }

    public String getToTel() {
        return toTel;
    }

    public void setToTel(String toTel) {
        this.toTel = toTel == null ? null : toTel.trim();
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName == null ? null : toName.trim();
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Date getPlaceTm() {
        return placeTm;
    }

    public void setPlaceTm(Date placeTm) {
        this.placeTm = placeTm;
    }

    public Date getRecordTm() {
        return recordTm;
    }

    public void setRecordTm(Date recordTm) {
        this.recordTm = recordTm;
    }

    public Date getDispatchTm() {
        return dispatchTm;
    }

    public void setDispatchTm(Date dispatchTm) {
        this.dispatchTm = dispatchTm;
    }

    public Date getArriveTm() {
        return arriveTm;
    }

    public void setArriveTm(Date arriveTm) {
        this.arriveTm = arriveTm;
    }

    public Date getAcceptTm() {
        return acceptTm;
    }

    public void setAcceptTm(Date acceptTm) {
        this.acceptTm = acceptTm;
    }

    public Date getLeaveTm() {
        return leaveTm;
    }

    public void setLeaveTm(Date leaveTm) {
        this.leaveTm = leaveTm;
    }

    public Date getFinishTm() {
        return finishTm;
    }

    public void setFinishTm(Date finishTm) {
        this.finishTm = finishTm;
    }

    public Date getRequireTm() {
        return requireTm;
    }

    public void setRequireTm(Date requireTm) {
        this.requireTm = requireTm;
    }

    public Date getArriveableTm() {
        return arriveableTm;
    }

    public void setArriveableTm(Date arriveableTm) {
        this.arriveableTm = arriveableTm;
    }

    public Date getLeaveableTm() {
        return leaveableTm;
    }

    public void setLeaveableTm(Date leaveableTm) {
        this.leaveableTm = leaveableTm;
    }

    public Date getDispatchableTm() {
        return dispatchableTm;
    }

    public void setDispatchableTm(Date dispatchableTm) {
        this.dispatchableTm = dispatchableTm;
    }

    public Integer getTakeDur() {
        return takeDur;
    }

    public void setTakeDur(Integer takeDur) {
        this.takeDur = takeDur;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why == null ? null : why.trim();
    }

    public Byte getPaid() {
        return paid;
    }

    public void setPaid(Byte paid) {
        this.paid = paid;
    }

    public Byte getRequireRiderType() {
        return requireRiderType;
    }

    public void setRequireRiderType(Byte requireRiderType) {
        this.requireRiderType = requireRiderType;
    }

    public Byte getRealRiderType() {
        return realRiderType;
    }

    public void setRealRiderType(Byte realRiderType) {
        this.realRiderType = realRiderType;
    }

    public Byte getPayWay() {
        return payWay;
    }

    public void setPayWay(Byte payWay) {
        this.payWay = payWay;
    }

    public Integer getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(Integer cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId == null ? null : serialId.trim();
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId == null ? null : tradeId.trim();
    }

    public Integer getTradingAreaId() {
        return tradingAreaId;
    }

    public void setTradingAreaId(Integer tradingAreaId) {
        this.tradingAreaId = tradingAreaId;
    }

    public Integer getShopRegionId() {
        return shopRegionId;
    }

    public void setShopRegionId(Integer shopRegionId) {
        this.shopRegionId = shopRegionId;
    }

    public Integer getRiderRegionId() {
        return riderRegionId;
    }

    public void setRiderRegionId(Integer riderRegionId) {
        this.riderRegionId = riderRegionId;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Byte getSwitchTimes() {
        return switchTimes;
    }

    public void setSwitchTimes(Byte switchTimes) {
        this.switchTimes = switchTimes;
    }

    public Byte getOverTime() {
        return overTime;
    }

    public void setOverTime(Byte overTime) {
        this.overTime = overTime;
    }

    public Byte getModified() {
        return modified;
    }

    public void setModified(Byte modified) {
        this.modified = modified;
    }

    public Byte getDispatchMode() {
        return dispatchMode;
    }

    public void setDispatchMode(Byte dispatchMode) {
        this.dispatchMode = dispatchMode;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
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

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Byte getContractType() {
        return contractType;
    }

    public void setContractType(Byte contractType) {
        this.contractType = contractType;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getRequireTag() {
        return requireTag;
    }

    public void setRequireTag(String requireTag) {
        this.requireTag = requireTag == null ? null : requireTag.trim();
    }

    public String getRequireLevel() {
        return requireLevel;
    }

    public void setRequireLevel(String requireLevel) {
        this.requireLevel = requireLevel == null ? null : requireLevel.trim();
    }

    public String getOutterGroup() {
        return outterGroup;
    }

    public void setOutterGroup(String outterGroup) {
        this.outterGroup = outterGroup == null ? null : outterGroup.trim();
    }

    public Integer getRecruitTaskId() {
        return recruitTaskId;
    }

    public void setRecruitTaskId(Integer recruitTaskId) {
        this.recruitTaskId = recruitTaskId;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo == null ? null : waybillNo.trim();
    }

    public String getWaybillNoSuffix() {
        return waybillNoSuffix;
    }

    public void setWaybillNoSuffix(String waybillNoSuffix) {
        this.waybillNoSuffix = waybillNoSuffix == null ? null : waybillNoSuffix.trim();
    }

    public Integer getPlatformRegionId() {
        return platformRegionId;
    }

    public void setPlatformRegionId(Integer platformRegionId) {
        this.platformRegionId = platformRegionId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
       return JSON.toJSONString(this, SerializerFeature.PrettyFormat);
    }
}