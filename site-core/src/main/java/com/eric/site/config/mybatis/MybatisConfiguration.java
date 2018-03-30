package com.eric.site.config.mybatis;

import com.eric.site.config.druid.DruidConfiguration;
import com.eric.site.config.mybatis.interceptors.PrepareInterceptor;
import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.Properties;

/**
 * mybatis的配置:<br/>
 * <p>在配置plugin时,定义的越靠后则越先执行.<p/>
 *
 * @Author: Eric
 */
@Configuration
@MapperScan("com.eric.site.web.dao")
@AutoConfigureAfter(DruidConfiguration.class)
public class MybatisConfiguration {

    private final Environment environment;

    @Autowired
    public MybatisConfiguration(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

    @Bean
    public PrepareInterceptor idInterceptor() {
        PrepareInterceptor idInterceptor = new PrepareInterceptor();
        Properties properties = new Properties();
        properties.setProperty("dialect", environment.getProperty("mybatis.dialect"));
        idInterceptor.setProperties(properties);
        return idInterceptor;
    }


}