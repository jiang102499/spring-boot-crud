package com.atguigu.springboot.mapper;

import com.atguigu.springboot.entities.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description TODO
 * @Author ht
 * @Date 2020/8/6 15:56
 * @Version 1.0
 **/
@Mapper
@Repository
public interface DepartmentMapper {


  public List<Department> getDepartments();


  public  Department getDepartment(Integer id);

}
