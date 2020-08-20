package com.atguigu.springboot.entities;

import java.io.Serializable;

/**
 * @ClassName Department
 * @Description TODO
 * @Author ht
 * @Date 2020/8/6 15:53
 * @Version 1.0
 **/
public class Department{

  private  Integer id;

  private  String departmentName;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  @Override
  public String toString() {
    return "Department{" +
      "id=" + id +
      ", departmentName='" + departmentName + '\'' +
      '}';
  }

}
