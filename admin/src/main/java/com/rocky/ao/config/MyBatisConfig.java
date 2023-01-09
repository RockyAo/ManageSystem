package com.rocky.ao.config;

import javax.sql.DataSource;
import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * @author yun.ao
 * @date 2023/1/9 10:29
 * @description
 */
@Configuration
@MapperScan("com.rocky.ao.mapper")
@AllArgsConstructor
public class MyBatisConfig {
    private final DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setTypeAliasesPackage("com.rocky.ao.**.model");

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        sessionFactory.setMapperLocations(resolver.getResource("classpath*:**/sqlmap/*.xml"));

        return sessionFactory.getObject();
    }
}
