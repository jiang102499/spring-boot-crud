package com.atguigu.springboot.mapper;

import com.atguigu.springboot.entities.Employee;
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

  List<Employee> allemp();


  public int delete(Integer id);

  //保存
  public  int  save(Employee employee);


  public List<Employee> querylist();

  public  int update(Employee employee);

  //获取id
  public Employee selectById(Integer id);





}



