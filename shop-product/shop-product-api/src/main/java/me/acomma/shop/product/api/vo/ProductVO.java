package me.acomma.shop.product.api.vo;

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
public class ProductVO implements Serializable {
    @Serial
    private static final long serialVersionUID = -5457813329859632009L;

    private Long id;

    private String name;

    private Integer inventory;
}
