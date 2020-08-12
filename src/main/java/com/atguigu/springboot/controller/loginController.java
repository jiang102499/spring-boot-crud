package com.atguigu.springboot.controller;

import com.atguigu.springboot.entities.User;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @ClassName loginController
 * @Description TODO
 * @Author ht
 * @Date 2020/8/7 11:56
 * @Version 1.0
 **/
@Controller
public class loginController {

  @Autowired
  UserService service;

  //http://localhost:8080/assets/css/signin.css

  @PostMapping(value = "/login")
  public String login(User user, Map<String, Object> map
    , HttpSession session) {

    User loginuser = service.login(user);

    if (loginuser != null) {
      session.setAttribute("loginUser", loginuser);
      return "redirect:/main.html";
    } else {
      map.put("msg", "用户名密码错误");
      return "index";

    }
  }
}
