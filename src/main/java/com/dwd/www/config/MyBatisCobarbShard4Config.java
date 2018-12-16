package com.dwd.www.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 第三个数据库扫描mapper的配置
 * Created by Chen WenJie on 2018/12/6.
 */
@Configuration
@MapperScan(basePackages = {"com.dwd.www.db.cobarb_shard4.mapper"},sqlSessionFactoryRef = "sqlSessionFactoryCobarbShard4")
public class MyBatisCobarbShard4Config {

    @Autowired
    @Qualifier("cobarbShard4")
    private DataSource dataSourceCobarbShard4;
    @Bean
    public SqlSessionFactory sqlSessionFactoryCobarbShard4() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSourceCobarbShard4); // 使用cobarb_shard4数据源, 连接cobarb_shard4库
        factoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return factoryBean.getObject();

    }

    @Bean
    public SqlSessionTemplate sqlSessionCobarbShard4() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryCobarbShard4()); // 使用上面配置的Factory
        return template;
    }

}
