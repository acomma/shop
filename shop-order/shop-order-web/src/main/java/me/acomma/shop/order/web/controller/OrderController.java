package me.acomma.shop.order.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.acomma.shop.order.api.dto.AddOrderDTO;
import me.acomma.shop.order.api.vo.AddOrderVO;
import me.acomma.shop.order.core.service.OrderService;
import me.acomma.shop.order.data.po.OrderPO;
import me.acomma.shop.product.api.vo.ProductVO;
import me.acomma.shop.user.api.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final OrderService orderService;
    private final RestTemplate restTemplate;

    @PostMapping
    public AddOrderVO addOrder(@RequestBody AddOrderDTO dto) {
        UserVO user = restTemplate.getForObject("http://shop-user/users/" + dto.getUserId(), UserVO.class);
        if (Objects.isNull(user)) {
            throw new RuntimeException("用户不存在");
        }

        ProductVO product = restTemplate.getForObject("http://shop-product/products/" + dto.getProductId(), ProductVO.class);
        if (Objects.isNull(product)) {
            throw new RuntimeException("商品不存在");
        }

        OrderPO po = new OrderPO();
        BeanUtils.copyProperties(dto, po);

        orderService.save(po);

        AddOrderVO vo = new AddOrderVO();
        vo.setOrderId(po.getOrderId());

        return vo;
    }
}
