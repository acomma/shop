package me.acomma.shop.order.api.dto;

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
public class AddOrderDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 7752546826068987793L;

    private Long userId;

    private Long productId;

    private Integer quantity;
}
