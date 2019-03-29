package com.bootcamp.thymeleaf.controller;

import com.bootcamp.thymeleaf.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/")
@Controller
public class HomeController {

    List<Employee> list = new ArrayList<>();

    @GetMapping("sayHello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("registration")
    public ModelAndView registration(Employee employee){
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.addObject("employees", employee);
        return modelAndView;
    }

    @RequestMapping("register")
//    @ResponseBody
    public ModelAndView register(Employee employee){
        list.add(employee);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ModelAndView("register").addObject("employeeList", list);
    }

    @GetMapping("showTime")
    @ResponseBody
    public String showTime(){
        return new Date().toString();
    }

    @GetMapping("time")
    public String time(){
        return "showTime";
    }
}

