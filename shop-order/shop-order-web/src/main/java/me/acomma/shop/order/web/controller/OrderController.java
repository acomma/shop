package me.acomma.shop.order.web.controller;

import lombok.RequiredArgsConstructor;
import me.acomma.shop.order.api.dto.AddOrderDTO;
import me.acomma.shop.order.api.vo.AddOrderVO;
import me.acomma.shop.order.core.service.OrderService;
import me.acomma.shop.order.data.po.OrderPO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public AddOrderVO addOrder(@RequestBody AddOrderDTO dto) {
        OrderPO po = new OrderPO();
        BeanUtils.copyProperties(dto, po);

        orderService.save(po);

        AddOrderVO vo = new AddOrderVO();
        vo.setOrderId(po.getOrderId());

        return vo;
    }
}
