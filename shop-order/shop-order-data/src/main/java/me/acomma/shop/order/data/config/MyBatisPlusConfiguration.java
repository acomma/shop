package me.acomma.shop.order.data.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("me.acomma.shop.order.data.mapper")
public class MyBatisPlusConfiguration {
}
