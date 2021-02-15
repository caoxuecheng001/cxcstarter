package com.test.start;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName : RedisConfig
 * @Description :
 * @Author : caoxuecheng
 * @Date: 2021-02-14 21:00
 */
@Data
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfig {

    private String host;

    private Integer port;
}


