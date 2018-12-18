package com.dwd.www.untils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Chen WenJie on 2018/12/18.
 */
@Configuration
@PropertySource({"classpath:application.properties"})
/*@ConfigurationProperties(prefix="test")
 * 加上prefix这个下面就不用加value了，但是需要名称和属性对应
 * 如果不加，属性名字和键名字不一致，那属性还是需要加value的
 */
@ConfigurationProperties
@Data
/**
 * 服务设置类，获取请求链接地址和骑手网关版本
 */
public class ServerSettings {

    @Value(value = "${rider.service}")
    public String riderService;
    @Value(value = "${rider.version}")
    public String riderVersion;

}