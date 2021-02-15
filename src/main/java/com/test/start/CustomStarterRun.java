package com.test.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : CustomStarterRun
 * @Description :
 * @Author : caoxuecheng
 * @Date: 2021-02-14 20:59
 */
@Configuration
@ConditionalOnClass(CxcTemplate.class)
@EnableConfigurationProperties(RedisConfig.class)
public class CustomStarterRun {
    @Autowired
    private RedisConfig redisConfig;

    @Bean
    public CxcTemplate cxcTemplate() {
        CxcTemplate cxcTemplate = new CxcTemplate(redisConfig);
        return cxcTemplate;
    }
}
