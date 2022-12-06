package me.acomma.shop.order.core.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import me.acomma.shop.order.data.mapper.OrderMapper;
import me.acomma.shop.order.data.po.OrderPO;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends ServiceImpl<OrderMapper, OrderPO> {
}
