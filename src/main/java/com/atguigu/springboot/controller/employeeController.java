package com.atguigu.springboot.controller;

import com.atguigu.springboot.entities.Department;
import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.entities.dto.EmployeeDto;
import com.atguigu.springboot.service.DepartmentService;
import com.atguigu.springboot.service.EmploteeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName employeeController
 * @Description TODO
 * @Author ht
 * @Date 2020/8/11 15:25
 * @Version 1.0
 **/
@Controller
public class employeeController {
  @Autowired
  EmploteeService service;

  @Autowired
  DepartmentService departmentService;


  @GetMapping("/allemp/{page}")
  public String allemp(Model model,@PathVariable("page") int page,Integer size){
    PageInfo<Employee> list =service.allemp(page, 5);
    model.addAttribute("emps",list);
    System.out.println(list);
    return "list";

  }


  @GetMapping("/deleteemp/{id}")
  public String delete(@PathVariable("id")Integer id){
        service.delete(id);
        System.out.println(id);
        System.out.println("删除成功");
      return "redirect:/allemp/1";

  }

  //跳转到添加页面
  @GetMapping("/toaddpage")
  public  String toAddPage(Model model){
    List<Department> departments=departmentService.getDepartments();
    System.out.println(departments);
    model.addAttribute("depms",departments);
    return "add";
  }



  //添加保存按钮
  @PostMapping("/save")
  public String save(EmployeeDto employeedto){
      service.save(employeedto);
      System.out.println("添加成功");
      return  "redirect:/allemp/1";
  }



  //跳转到修改界面
  @GetMapping("/toupdatepage/{id}")
  public String toupdatepage(@PathVariable("id") Integer id,Model model){
       Employee employee =service.selectById(id);
       List<Department> departments=departmentService.getDepartments();
       System.out.println(employee);
       System.out.println(departments);
       model.addAttribute("depms",departments);
       model.addAttribute("emp", employee);
       return "update";
  }


  @PutMapping("/empup")
  public  String update(EmployeeDto employeedto){
    service.update(employeedto);
    System.out.println("修改成功");
    return "redirect:/allemp/1";

  }


}
