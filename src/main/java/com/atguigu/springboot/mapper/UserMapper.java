package com.atguigu.springboot.mapper;

import com.atguigu.springboot.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

  public User login(User user);
}
