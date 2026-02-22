package com.hmdp.config;

import org.aspectj.weaver.ast.Var;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kieran_Chase
 * @project hm-dianPing
 * @date 2026/2/21
 */
@Configuration
public class RedissonConfig {
    @Bean
    public RedissonClient redissonClient(){
        //配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        //创建RedissonClient对象
        return Redisson.create(config);
    }
}
