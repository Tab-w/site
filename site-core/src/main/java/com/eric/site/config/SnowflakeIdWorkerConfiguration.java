package com.eric.site.config;

import com.eric.site.core.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author Eric
 */
@Configuration
public class SnowflakeIdWorkerConfiguration {

    private final Environment environment;

    @Autowired
    public SnowflakeIdWorkerConfiguration(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public SnowflakeIdWorker pageHelper() {
        long workerId = environment.getProperty("snowflakeIdWorker.workerId", Long.class);
        long datacenterId = environment.getProperty("snowflakeIdWorker.datacenterId", Long.class);
        return new SnowflakeIdWorker(workerId, datacenterId);
    }
}