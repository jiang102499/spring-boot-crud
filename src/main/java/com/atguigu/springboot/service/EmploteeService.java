package com.atguigu.springboot.service;


import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.entities.dto.EmployeeDto;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmploteeService {


  //分页查询
  PageInfo<Employee> allemp(int page, int size);


  //保存
  public  int  save(EmployeeDto employeedto);

  //删除数据
  public int delete(Integer id);

  //修改数据
  public  int update(EmployeeDto employeedto);

  //获取id
  public Employee selectById(Integer id);

}
