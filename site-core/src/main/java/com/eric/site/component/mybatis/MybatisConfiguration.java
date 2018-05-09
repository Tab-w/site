package com.eric.site.component.mybatis;

import com.eric.site.component.druid.DruidConfiguration;
import com.eric.site.component.mybatis.interceptors.PrepareInterceptor;
import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

    /**
     * 分页插件
     */
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

    /**
     * 前置拦截器,主要功能是插入前设置ID和create_time,更新时设置modify_time
     */
    @Bean
    public PrepareInterceptor idInterceptor() {
        return new PrepareInterceptor();
    }
}