package com.atguigu.springboot.service;

import com.atguigu.springboot.entities.User;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author ht
 * @Date 2020/8/11 13:47
 * @Version 1.0
 **/


public interface UserService {

  public User login(User user);
}
