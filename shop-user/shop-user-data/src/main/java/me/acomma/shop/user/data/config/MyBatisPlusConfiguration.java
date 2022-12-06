package me.acomma.shop.user.data.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("me.acomma.shop.user.data.mapper")
public class MyBatisPlusConfiguration {
}
