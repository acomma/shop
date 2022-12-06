package me.acomma.shop.product.core.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import me.acomma.shop.product.data.mapper.ProductMapper;
import me.acomma.shop.product.data.po.ProductPO;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends ServiceImpl<ProductMapper, ProductPO> {
}
