package me.acomma.shop.user.data.po;

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
@TableName(value = "`user`")
public class UserPO implements Serializable {
    @Serial
    private static final long serialVersionUID = 821950682101349236L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;
}
