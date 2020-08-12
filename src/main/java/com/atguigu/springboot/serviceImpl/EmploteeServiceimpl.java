package com.atguigu.springboot.serviceImpl;

import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.mapper.EmployeeMapper;
import com.atguigu.springboot.service.EmploteeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName EmploteeServiceimpl
 * @Description TODO
 * @Author ht
 * @Date 2020/8/11 13:49
 * @Version 1.0
 **/
@Service
public class EmploteeServiceimpl implements EmploteeService {

  @Autowired
  EmployeeMapper mapper;
  @Override
  public List<Employee> allemp() {
    return mapper.allemp();
  }

  @Override
  public int save(Employee employee) {

    return mapper.save(employee);

  }

  @Override
  public List<Employee> querylist() {
    return null;
  }

  @Override
  public int delete(Integer id) {
    return mapper.delete(id);
  }

  @Override
  public int update(Employee employee) {
    return mapper.update(employee);
  }

  @Override
  public Employee selectById(Integer id) {
    return mapper.selectById(id);
  }


}
