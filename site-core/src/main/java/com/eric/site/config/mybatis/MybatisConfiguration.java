package com.eric.site.config.mybatis;

import com.eric.site.config.druid.DruidConfiguration;
import com.github.pagehelper.PageHelper;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Author: WangXY
 * @Date: 2018-02-16
 */
@Configuration
@AutoConfigureAfter(DruidConfiguration.class)
public class MybatisConfiguration {
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
}