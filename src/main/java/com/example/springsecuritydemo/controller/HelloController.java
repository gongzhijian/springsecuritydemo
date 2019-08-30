package com.example.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author GEEX616
 * @create 2019-08-30 12:45
 * @desc
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello (ModelAndView view){
        return "hello";
    }
}
