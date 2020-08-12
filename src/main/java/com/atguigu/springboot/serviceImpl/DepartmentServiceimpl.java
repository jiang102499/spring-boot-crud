package com.atguigu.springboot.serviceImpl;

import com.atguigu.springboot.entities.Department;
import com.atguigu.springboot.mapper.DepartmentMapper;
import com.atguigu.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DepartmentServiceimpl
 * @Description TODO
 * @Author ht
 * @Date 2020/8/11 13:49
 * @Version 1.0
 **/
@Service
public class DepartmentServiceimpl implements DepartmentService {

  @Autowired
  DepartmentMapper mapper;
  @Override
  public List<Department> getDepartments() {
    return mapper.getDepartments();
  }

  @Override
  public Department getDepartment(Integer id) {
    return mapper.getDepartment(id);
  }
}
