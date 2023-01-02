package me.acomma.shop.user.api.vo;

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
public class UserVO implements Serializable {
    @Serial
    private static final long serialVersionUID = -3124545673883575870L;

    private Long id;

    private String name;
}
