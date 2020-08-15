package com.myspringmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Controller
//public class FirstController {
//
//    @RequestMapping("/first")
//    public String first() {
//        return "first";
//    }
//}

public class FirstController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("msg","hello springmvc!");
        modelAndView.setViewName("/WEB-INF/jsp/first.jsp");
        return modelAndView;


    }
}
