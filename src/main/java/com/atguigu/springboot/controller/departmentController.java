package com.atguigu.springboot.controller;

import com.atguigu.springboot.entities.Department;
import com.atguigu.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName departmentController
 * @Description TODO
 * @Author ht
 * @Date 2020/8/12 14:14
 * @Version 1.0
 **/
@Controller
public class departmentController {

  @Autowired
  DepartmentService service;

  @GetMapping("/querylist")
  @ResponseBody
  public String querylist(Model model){

    List<Department> departments=service.getDepartments();
    System.out.println(departments);
    model.addAttribute("depms",departments);
    return "add";
  }
}
