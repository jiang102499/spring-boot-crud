package com.atguigu.springboot.component;

import org.apache.catalina.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName LoginHandlerinterceptor
 * @Description TODO
 * @Author ht
 * @Date 2020/8/7 15:31
 * @Version 1.0
 **/

//登录检查
public class LoginHandlerinterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    Object user = request.getSession().getAttribute("loginUser");
    if (user==null){
      //没有登录，需要重新登录
      request.setAttribute("msg", "没有权限");
      request.getRequestDispatcher("/index.html").forward(request, response);
      return false;
    }
    else {
      //通过，放行
      return true;
    }


  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

  }
}
