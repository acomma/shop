package me.acomma.shop.product.data.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "`product`")
public class ProductPO implements Serializable {
    @Serial
    private static final long serialVersionUID = -396510113249552548L;

    @TableId(value = "product_id", type = IdType.AUTO)
    private Long productId;

    private String name;

    private Integer inventory;
}
