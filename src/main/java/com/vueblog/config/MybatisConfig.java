package com.vueblog.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.vueblog.mapper"})
public class MybatisConfig {
}
