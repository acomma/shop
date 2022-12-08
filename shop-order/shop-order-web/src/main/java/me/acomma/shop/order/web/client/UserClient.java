package me.acomma.shop.order.web.client;

import me.acomma.shop.user.api.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("shop-user")
public interface UserClient {
    @GetMapping("/users/{userId}")
    UserVO getUser(@PathVariable("userId") Long userId);
}
