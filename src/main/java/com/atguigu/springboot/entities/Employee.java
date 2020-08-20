package com.atguigu.springboot.entities;

import com.atguigu.springboot.entities.Department;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author ht
 * @Date 2020/8/6 15:53
 * @Version 1.0
 **/
public class Employee{

  private  Integer id;

  private String lastName;

  private String email;

  //1 male  ,0 female
  private  Integer gender;

  private Department department;

  private Date birth;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Date getBirth() {
    return birth;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "id=" + id +
      ", lastName='" + lastName + '\'' +
      ", email='" + email + '\'' +
      ", gender=" + gender +
      ", department=" + department +
      ", birth=" + birth +
      '}';
  }
}
