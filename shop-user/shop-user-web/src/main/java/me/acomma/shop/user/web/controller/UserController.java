package me.acomma.shop.user.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.acomma.shop.user.api.vo.UserVO;
import me.acomma.shop.user.core.service.UserService;
import me.acomma.shop.user.data.po.UserPO;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public UserVO getUser(@PathVariable("userId") Long userId) {
        UserPO po = userService.getById(userId);

        UserVO vo = new UserVO();
        BeanUtils.copyProperties(po, vo);

        log.info("获取用户信息：{}", vo);

        return vo;
    }
}
