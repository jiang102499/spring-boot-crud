package com.atguigu.springboot.config;

import com.atguigu.springboot.component.LoginHandlerinterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;


/**
 * @ClassName MymvcConfig
 * @Description TODO
 * @Author ht
 * @Date 2020/8/6 15:05
 * @Version 1.0
 **/
//使用WebMvcConfigurerAdapter可以用来扩展springmvc的功能
  //@Bean添加组件
@Configuration
public class MymvcConfig extends WebMvcConfigurerAdapter {
  @Override
  public void addViewControllers(ViewControllerRegistry registry) {

    //  super.addViewControllers(registry);
    // 浏览器发送请求，来到界面
   // registry.addViewController("/atguigu").setViewName("index");


    }


//    @Bean
//    //所有的WebMvcConfigurerAdapter都会一起起作用
//    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
//
//      WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
//        @Override
//        public void addViewControllers(ViewControllerRegistry registry) {
//
//          //  super.addViewControllers(registry);
//          // 浏览器发送请求，来到界面
//          registry.addViewController("/").setViewName("index");
//          registry.addViewController("/index.html").setViewName("index");
//          registry.addViewController("/main.html").setViewName("dashboard");
//          registry.addViewController("/tolist.html").setViewName("list");
//        }
//
//        //注册拦截器
//        @Override
//        public void addInterceptors(InterceptorRegistry registry) {
//          //super.addInterceptors(registry);
//          // addPathPatterns("/**")表示任意请求都要拦截     excludePathPatterns("")选择要放行的请求
//          registry.addInterceptor(new LoginHandlerinterceptor()).addPathPatterns("/**").
//            excludePathPatterns("/index.html","/login","/","webjars/**");
//        }
//
//
//      };
//      return adapter;
//
//    }

  @Bean
  //WebMvcConfigurerAdapter
  public  WebMvcConfigurerAdapter webMvcConfigurerAdapter(){

    WebMvcConfigurerAdapter adapter=new WebMvcConfigurerAdapter() {

      //注册拦截器
      @Override
      public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
        // addPathPatterns("/**")表示任意请求都要拦截     excludePathPatterns("")选择要放行的请求
        registry.addInterceptor(new LoginHandlerinterceptor()).addPathPatterns("/**").
          excludePathPatterns("/index.html","/login","/","webjars/**");
      }

      //映射url 直接跳转到classpath:/templates/下的页面
      @Override
      public void addViewControllers(ViewControllerRegistry registry) {
       // super.addViewControllers(registry);
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
        registry.addViewController("/tolist.html").setViewName("list");
        registry.addViewController("/index.html").setViewName("index");

      }
    };
    return adapter;


  }





}

