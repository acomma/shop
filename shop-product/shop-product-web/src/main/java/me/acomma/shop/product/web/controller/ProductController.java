package me.acomma.shop.product.web.controller;

import lombok.RequiredArgsConstructor;
import me.acomma.shop.product.api.vo.ProductVO;
import me.acomma.shop.product.core.service.ProductService;
import me.acomma.shop.product.data.po.ProductPO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{productId}")
    public ProductVO getProduct(@PathVariable("productId") Long productId) {
        ProductPO po = productService.getById(productId);

        ProductVO vo = new ProductVO();
        BeanUtils.copyProperties(po, vo);

        return vo;
    }
}
