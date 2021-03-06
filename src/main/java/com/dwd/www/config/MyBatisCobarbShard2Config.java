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
 * 第一个数据库扫描mapper的配置
 * Created by Chen WenJie on 2018/12/6.
 */
@Configuration
@MapperScan(basePackages = {"com.dwd.www.db.cobarb_shard2.mapper"},sqlSessionFactoryRef = "sqlSessionFactoryCobarbShard2")
public class MyBatisCobarbShard2Config {

    @Autowired
    @Qualifier("cobarbShard2")
    private DataSource dataSourceCobarbShard2;
    @Bean
    public SqlSessionFactory sqlSessionFactoryCobarbShard2() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSourceCobarbShard2); // 使用cobarc_shard3数据源, 连接cobarc_shard3库
        factoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateCobarbShard2() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryCobarbShard2()); // 使用上面配置的Factory
        return template;
    }

}
