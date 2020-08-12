package com.atguigu.springboot.service;

import com.atguigu.springboot.entities.Department;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description TODO
 * @Author ht
 * @Date 2020/8/11 13:47
 * @Version 1.0
 **/

public interface DepartmentService {

//查询所有部门
  public List<Department> getDepartments();

//根据id查询部门
  public  Department getDepartment(Integer id);
}
