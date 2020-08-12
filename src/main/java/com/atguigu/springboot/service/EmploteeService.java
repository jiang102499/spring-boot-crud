package com.atguigu.springboot.service;


import com.atguigu.springboot.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmploteeService {


  //显示所有的数据
  List<Employee> allemp();


  //保存
  public  int  save(Employee employee);

  //查询列表
  public List<Employee> querylist();

  //删除数据
  public int delete(Integer id);

  //修改数据
  public  int update(Employee employee);

  //获取id
  public Employee selectById(Integer id);

}
