package com.atguigu.springboot.entities.dto;

import com.atguigu.springboot.entities.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName EmployeeDto
 * @Description TODO
 * @Author ht
 * @Date 2020/8/20 8:57
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {


  private  Integer id;

  private String lastName;

  private String email;

  //1 male  ,0 female
  private  Integer gender;

  private Integer department_id;

  private Date birth;

}
