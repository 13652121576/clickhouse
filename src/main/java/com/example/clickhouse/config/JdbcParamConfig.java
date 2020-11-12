package com.example.clickhouse.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * clickhouse连接信息配置
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource.click")
public class JdbcParamConfig {

    private String driverClassName;

    private String url ;

    private String username ;

    private String password ;

    private Integer initialSize ;

    private Integer maxActive ;

    private Integer minIdle ;

    private Integer maxWait ;
}


