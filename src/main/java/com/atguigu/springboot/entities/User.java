package com.atguigu.springboot.entities;

/**
 * @ClassName User
 * @Description TODO
 * @Author ht
 * @Date 2020/8/11 13:46
 * @Version 1.0
 **/
public class User {

  private int id;

  private  String name_abc;

  private  String password;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName_abc() {
    return name_abc;
  }

  public void setName_abc(String name_abc) {
    this.name_abc = name_abc;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", name_abc='" + name_abc + '\'' +
      ", password='" + password + '\'' +
      '}';
  }
}
