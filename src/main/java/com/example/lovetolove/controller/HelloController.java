package com.example.lovetolove.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/loveto")
public class HelloController {

    @RequestMapping("/love")
    @ResponseBody
    public String hello(){
        return "holle";
    }

    @RequestMapping("/www")
    public ModelAndView www(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/home")
    public String ww(){
        return "home";
    }
}
