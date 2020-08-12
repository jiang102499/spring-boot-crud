package com.atguigu.springboot.entities;

import com.atguigu.springboot.entities.Department;

import java.util.Date;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author ht
 * @Date 2020/8/6 15:53
 * @Version 1.0
 **/
public class Employee {

  private  Integer id;

  private String lastName;

  private String email;

  //1 male  ,0 female
  private  Integer gender;

  private Integer department_id;

  private Date birth;

  public Employee(Integer id, String lastName, String email, Integer gender, Integer department_id) {
    this.id = id;
    this.lastName = lastName;
    this.email = email;
    this.gender = gender;
    this.department_id = department_id;
    this.birth = new Date();
  }

  public Employee() {
  }

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

  public Integer getDepartment_id() {
    return department_id;
  }

  public void setDepartment_id(Integer department_id) {
    this.department_id = department_id;
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
      ", department_id=" + department_id +
      ", birth=" + birth +
      '}';
  }
}
