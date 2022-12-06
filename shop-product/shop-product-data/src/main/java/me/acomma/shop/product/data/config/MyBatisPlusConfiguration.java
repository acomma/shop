package me.acomma.shop.product.data.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("me.acomma.shop.product.data.mapper")
public class MyBatisPlusConfiguration {
}
