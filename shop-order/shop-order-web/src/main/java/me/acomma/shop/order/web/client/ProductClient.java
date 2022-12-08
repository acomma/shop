package me.acomma.shop.order.web.client;

import me.acomma.shop.product.api.vo.ProductVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("shop-product")
public interface ProductClient {
    @GetMapping("/products/{productId}")
    ProductVO getProduct(@PathVariable("productId") Long productId);
}
