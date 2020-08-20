package com.atguigu.springboot.serviceImpl;

import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.entities.dto.EmployeeDto;
import com.atguigu.springboot.mapper.EmployeeMapper;
import com.atguigu.springboot.service.EmploteeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Size;
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
  public PageInfo<Employee> allemp(int page, int size) {
    PageHelper.startPage(page, size);
    List<Employee> list =mapper.allemp(null);
    PageInfo<Employee> info = new PageInfo<>(list);
    return info;
  }

  @Override
  public int save(EmployeeDto employeedto) {

    return mapper.save(employeedto);

  }




  @Override
  public int delete(Integer id) {
    return mapper.delete(id);
  }

  @Override
  public int update(EmployeeDto employeedto) {
    return mapper.update(employeedto);
  }

  @Override
  public Employee selectById(Integer id) {
    return mapper.selectById(id);
  }


}
