package com.dwd.www.db.workorderdb.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.math.BigDecimal;
import java.util.Date;

public class Workorder {
    private Long primarykey;

    private String id;

    private Integer cityId;

    private Byte source;

    private Integer sourceId;

    private String sourceMobile;

    private String sourceName;

    private Integer classify;

    private Integer subclassify;

    private String itemCode;

    private Byte target;

    private Integer targetId;

    private String targetName;

    private String targetMobile;

    private Integer targetRegionId;

    private String serviceId;

    private String channelWorkId;

    private String receiveRole;

    private String receiver;

    private String accepter;

    private Byte status;

    private Byte priority;

    private String attachment;

    private String wdata;

    private Byte result;

    private String resultContent;

    private Byte createSource;

    private Date createTime;

    private Date acceptTime;

    private Date requireTime;

    private Date resolvedTime;

    private Byte actionType;

    private BigDecimal actionValue;

    private Byte actionResult;

    private Date actionTime;

    private String refundAccount;

    private String refundAccountName;

    private Integer platformShopId;

    private String extra1;

    private String creatorNo;

    private String creatorName;

    private Integer urgeCount;

    private String relevance;

    private Byte canAppeal;

    private String thirdId;

    private Byte relateSource;

    private Byte pendingVisible;

    private String relatedBatchNo;

    private Byte appraise;

    private String wdesc;

    public Long getPrimarykey() {
        return primarykey;
    }

    public void setPrimarykey(Long primarykey) {
        this.primarykey = primarykey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceMobile() {
        return sourceMobile;
    }

    public void setSourceMobile(String sourceMobile) {
        this.sourceMobile = sourceMobile == null ? null : sourceMobile.trim();
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    public Integer getSubclassify() {
        return subclassify;
    }

    public void setSubclassify(Integer subclassify) {
        this.subclassify = subclassify;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public Byte getTarget() {
        return target;
    }

    public void setTarget(Byte target) {
        this.target = target;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName == null ? null : targetName.trim();
    }

    public String getTargetMobile() {
        return targetMobile;
    }

    public void setTargetMobile(String targetMobile) {
        this.targetMobile = targetMobile == null ? null : targetMobile.trim();
    }

    public Integer getTargetRegionId() {
        return targetRegionId;
    }

    public void setTargetRegionId(Integer targetRegionId) {
        this.targetRegionId = targetRegionId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getChannelWorkId() {
        return channelWorkId;
    }

    public void setChannelWorkId(String channelWorkId) {
        this.channelWorkId = channelWorkId == null ? null : channelWorkId.trim();
    }

    public String getReceiveRole() {
        return receiveRole;
    }

    public void setReceiveRole(String receiveRole) {
        this.receiveRole = receiveRole == null ? null : receiveRole.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getAccepter() {
        return accepter;
    }

    public void setAccepter(String accepter) {
        this.accepter = accepter == null ? null : accepter.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }

    public String getWdata() {
        return wdata;
    }

    public void setWdata(String wdata) {
        this.wdata = wdata == null ? null : wdata.trim();
    }

    public Byte getResult() {
        return result;
    }

    public void setResult(Byte result) {
        this.result = result;
    }

    public String getResultContent() {
        return resultContent;
    }

    public void setResultContent(String resultContent) {
        this.resultContent = resultContent == null ? null : resultContent.trim();
    }

    public Byte getCreateSource() {
        return createSource;
    }

    public void setCreateSource(Byte createSource) {
        this.createSource = createSource;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Date getRequireTime() {
        return requireTime;
    }

    public void setRequireTime(Date requireTime) {
        this.requireTime = requireTime;
    }

    public Date getResolvedTime() {
        return resolvedTime;
    }

    public void setResolvedTime(Date resolvedTime) {
        this.resolvedTime = resolvedTime;
    }

    public Byte getActionType() {
        return actionType;
    }

    public void setActionType(Byte actionType) {
        this.actionType = actionType;
    }

    public BigDecimal getActionValue() {
        return actionValue;
    }

    public void setActionValue(BigDecimal actionValue) {
        this.actionValue = actionValue;
    }

    public Byte getActionResult() {
        return actionResult;
    }

    public void setActionResult(Byte actionResult) {
        this.actionResult = actionResult;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public String getRefundAccount() {
        return refundAccount;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount == null ? null : refundAccount.trim();
    }

    public String getRefundAccountName() {
        return refundAccountName;
    }

    public void setRefundAccountName(String refundAccountName) {
        this.refundAccountName = refundAccountName == null ? null : refundAccountName.trim();
    }

    public Integer getPlatformShopId() {
        return platformShopId;
    }

    public void setPlatformShopId(Integer platformShopId) {
        this.platformShopId = platformShopId;
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1 == null ? null : extra1.trim();
    }

    public String getCreatorNo() {
        return creatorNo;
    }

    public void setCreatorNo(String creatorNo) {
        this.creatorNo = creatorNo == null ? null : creatorNo.trim();
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Integer getUrgeCount() {
        return urgeCount;
    }

    public void setUrgeCount(Integer urgeCount) {
        this.urgeCount = urgeCount;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance == null ? null : relevance.trim();
    }

    public Byte getCanAppeal() {
        return canAppeal;
    }

    public void setCanAppeal(Byte canAppeal) {
        this.canAppeal = canAppeal;
    }

    public String getThirdId() {
        return thirdId;
    }

    public void setThirdId(String thirdId) {
        this.thirdId = thirdId == null ? null : thirdId.trim();
    }

    public Byte getRelateSource() {
        return relateSource;
    }

    public void setRelateSource(Byte relateSource) {
        this.relateSource = relateSource;
    }

    public Byte getPendingVisible() {
        return pendingVisible;
    }

    public void setPendingVisible(Byte pendingVisible) {
        this.pendingVisible = pendingVisible;
    }

    public String getRelatedBatchNo() {
        return relatedBatchNo;
    }

    public void setRelatedBatchNo(String relatedBatchNo) {
        this.relatedBatchNo = relatedBatchNo == null ? null : relatedBatchNo.trim();
    }

    public Byte getAppraise() {
        return appraise;
    }

    public void setAppraise(Byte appraise) {
        this.appraise = appraise;
    }

    public String getWdesc() {
        return wdesc;
    }

    public void setWdesc(String wdesc) {
        this.wdesc = wdesc == null ? null : wdesc.trim();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this, SerializerFeature.PrettyFormat);
    }
}