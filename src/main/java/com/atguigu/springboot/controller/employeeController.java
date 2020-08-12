package com.atguigu.springboot.controller;

import com.atguigu.springboot.entities.Department;
import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.service.DepartmentService;
import com.atguigu.springboot.service.EmploteeService;
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


  @GetMapping("/allemp")
  public String allemp(Model model){
    List<Employee> list =service.allemp();
    if (list!=null){
      model.addAttribute("emps",list);
      System.out.println(list);
      return "list";
    }else
      return "查询失败";
  }

  @GetMapping("/deleteemp/{id}")
  public String delete(@PathVariable("id")Integer id){
        service.delete(id);
        System.out.println(id);

        System.out.println("删除成功");
      return "redirect:/allemp";

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
  public String save(Employee employee){
      service.save(employee);
      System.out.println("添加成功");
      return  "redirect:/allemp";
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
  public  String update(Employee employee){

    service.update(employee);
    System.out.println("修改成功");
    return "redirect:/allemp";

  }

}
