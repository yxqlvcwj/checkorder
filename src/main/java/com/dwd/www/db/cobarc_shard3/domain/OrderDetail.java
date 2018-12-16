package com.dwd.www.db.cobarc_shard3.domain;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDetail {
    private Long id;

    private Integer cityId;

    private Long orderId;

    private String name;

    private Byte type;

    private BigDecimal cost;

    private Integer shardx;

    private Integer shardy;

    private Integer shardz;

    private String feature;

    private Date createTm;

    private Date updateTm;

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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
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

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public Date getCreateTm() {
        return createTm;
    }

    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }

    public Date getUpdateTm() {
        return updateTm;
    }

    public void setUpdateTm(Date updateTm) {
        this.updateTm = updateTm;
    }
}