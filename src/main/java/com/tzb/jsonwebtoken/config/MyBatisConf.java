package com.tzb.jsonwebtoken.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create by zhatang on 2020/12/2.
 */
@Configuration
@MapperScan({"com.tzb.jsonwebtoken.mbg.mapper","com.tzb.jsonwebtoken.dao"})
public class MyBatisConf {
}
