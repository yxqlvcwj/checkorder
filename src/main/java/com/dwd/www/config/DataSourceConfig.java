package com.dwd.www.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Chen WenJie on 2018/12/6.
 */
/**
 * 多数据源配置
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "cobarcShard3")
    @ConfigurationProperties(prefix = "spring.datasource.cobarc") // application.properteis中对应属性的前缀
    public DataSource dataSourceCobarcShard3() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "workorder")
    @ConfigurationProperties(prefix = "spring.datasource.workorder") // application.properteis中对应属性的前缀
    public DataSource dataSourceCobarbShard4() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "cobarbShard4")
    @ConfigurationProperties(prefix = "spring.datasource.cobarb") // application.properteis中对应属性的前缀
    public DataSource dataSourceWorkorder() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "cobarbShard2")
    @ConfigurationProperties(prefix = "spring.datasource.cobard") // application.properteis中对应属性的前缀
    public DataSource dataSourceCobarbShard2() {
        return DataSourceBuilder.create().build();
    }

}
