package com.atguigu.springboot.serviceImpl;

import com.atguigu.springboot.entities.User;
import com.atguigu.springboot.mapper.UserMapper;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceimpl
 * @Description TODO
 * @Author ht
 * @Date 2020/8/11 13:49
 * @Version 1.0
 **/
@Service
public class UserServiceimpl implements UserService {

  @Autowired
  UserMapper userMapper;

  @Override
  public User login(User user) {
    System.out.println(user);
    return  userMapper.login(user);
  }
}
