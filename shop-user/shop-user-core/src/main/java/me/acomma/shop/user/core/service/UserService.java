package me.acomma.shop.user.core.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import me.acomma.shop.user.data.mapper.UserMapper;
import me.acomma.shop.user.data.po.UserPO;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, UserPO> {
}
