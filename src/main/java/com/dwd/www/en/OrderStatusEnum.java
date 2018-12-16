package com.dwd.www.en;

/**
 * Created by Chen WenJie on 2018/12/12.
 */
public enum OrderStatusEnum {
    PLACED("0","已下单"),
    ROBED("5","已抢单"),
    ARRIVED("10","已到店"),
    LEAVED("15","已离店"),
    FINISHED("100","已完成"),
    CANCELED("98","已取消"),
    ABNORMALED("99","异常完成");
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    OrderStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
