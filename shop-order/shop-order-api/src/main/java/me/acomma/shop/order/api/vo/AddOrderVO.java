package me.acomma.shop.order.api.vo;

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
public class AddOrderVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 8302121312904850799L;

    private Long orderId;
}
