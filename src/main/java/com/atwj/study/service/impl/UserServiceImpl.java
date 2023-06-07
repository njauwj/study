package com.atwj.study.service.impl;

import com.atwj.study.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atwj.study.pojo.User;
import com.atwj.study.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author WinX PRO
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2023-06-04 22:37:20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

}




