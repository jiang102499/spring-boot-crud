package com.atguigu.springboot.mapper;

import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.entities.dto.EmployeeDto;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName EmployeDao
 * @Description TODO
 * @Author ht
 * @Date 2020/8/6 15:55
 * @Version 1.0
 **/

@Mapper
@Repository
public interface EmployeeMapper {

  //分页查询
  List<Employee> allemp(Employee employee);


  public int delete(Integer id);

  //保存
  public  int  save(EmployeeDto employeedto);


  public  int update(EmployeeDto employeedto);

  //获取id
  public Employee selectById(Integer id);





}



