package com.eric.site;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: WangXY
 * @Date: 2018-02-16
 */
@SpringBootApplication
@MapperScan("com.eric.site.web.dao")
@EnableTransactionManagement
@ServletComponentScan
public class SiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(SiteApplication.class, args);
    }
}
