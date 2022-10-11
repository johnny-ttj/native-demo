package com.johnny.nativedemonew.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedList;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }

}
