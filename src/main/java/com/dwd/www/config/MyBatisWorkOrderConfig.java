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
 * 第二个数据库扫描mapper的配置
 * Created by Chen WenJie on 2018/12/6.
 */
@Configuration
@MapperScan(basePackages = {"com.dwd.www.db.workorderdb.mapper"},sqlSessionFactoryRef = "sqlSessionFactoryWorkorder")
public class MyBatisWorkOrderConfig {

    @Autowired
    @Qualifier("workorder")
    private DataSource dataSourceWorkorder;
    @Bean
    public SqlSessionFactory sqlSessionFactoryWorkorder() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSourceWorkorder); // 使用workorder数据源, 连接workorder库
        factoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);//将数据库表字段中的下划线命名为驼峰格式
        return factoryBean.getObject();

    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateWorkorder() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryWorkorder()); // 使用上面配置的Factory
        return template;
    }
    
}
