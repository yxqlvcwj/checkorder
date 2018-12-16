package com.dwd.www.db.cobarb_shard4.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BalanceLog {
    private Long id;

    private Integer cityId;

    private Integer riderId;

    private Byte type;

    private Byte blocked;

    private String account;

    private Byte paid;

    private String name;

    private BigDecimal cost;

    private BigDecimal factorage;

    private Date insTm;

    private Date verifyTm;

    private Date finishTm;

    private String reason;

    private String tradeNo;

    private Byte tradeWay;

    private Byte riskChecked;

    private Byte currentServiceType;

    private Byte bankName;

    private String bankCard;

    private Byte bankCardType;

    private Byte payType;

    private Long batchRecordId;

    private String batchNo;

    private Integer shardx;

    private Date withdrawTm;

    private Date modifyTime;

    private BigDecimal effectiveBalance;

    private BigDecimal auditingMoney;

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

    public Integer getRiderId() {
        return riderId;
    }

    public void setRiderId(Integer riderId) {
        this.riderId = riderId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getBlocked() {
        return blocked;
    }

    public void setBlocked(Byte blocked) {
        this.blocked = blocked;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Byte getPaid() {
        return paid;
    }

    public void setPaid(Byte paid) {
        this.paid = paid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getFactorage() {
        return factorage;
    }

    public void setFactorage(BigDecimal factorage) {
        this.factorage = factorage;
    }

    public Date getInsTm() {
        return insTm;
    }

    public void setInsTm(Date insTm) {
        this.insTm = insTm;
    }

    public Date getVerifyTm() {
        return verifyTm;
    }

    public void setVerifyTm(Date verifyTm) {
        this.verifyTm = verifyTm;
    }

    public Date getFinishTm() {
        return finishTm;
    }

    public void setFinishTm(Date finishTm) {
        this.finishTm = finishTm;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Byte getTradeWay() {
        return tradeWay;
    }

    public void setTradeWay(Byte tradeWay) {
        this.tradeWay = tradeWay;
    }

    public Byte getRiskChecked() {
        return riskChecked;
    }

    public void setRiskChecked(Byte riskChecked) {
        this.riskChecked = riskChecked;
    }

    public Byte getCurrentServiceType() {
        return currentServiceType;
    }

    public void setCurrentServiceType(Byte currentServiceType) {
        this.currentServiceType = currentServiceType;
    }

    public Byte getBankName() {
        return bankName;
    }

    public void setBankName(Byte bankName) {
        this.bankName = bankName;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    public Byte getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(Byte bankCardType) {
        this.bankCardType = bankCardType;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Long getBatchRecordId() {
        return batchRecordId;
    }

    public void setBatchRecordId(Long batchRecordId) {
        this.batchRecordId = batchRecordId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public Integer getShardx() {
        return shardx;
    }

    public void setShardx(Integer shardx) {
        this.shardx = shardx;
    }

    public Date getWithdrawTm() {
        return withdrawTm;
    }

    public void setWithdrawTm(Date withdrawTm) {
        this.withdrawTm = withdrawTm;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public BigDecimal getEffectiveBalance() {
        return effectiveBalance;
    }

    public void setEffectiveBalance(BigDecimal effectiveBalance) {
        this.effectiveBalance = effectiveBalance;
    }

    public BigDecimal getAuditingMoney() {
        return auditingMoney;
    }

    public void setAuditingMoney(BigDecimal auditingMoney) {
        this.auditingMoney = auditingMoney;
    }
}