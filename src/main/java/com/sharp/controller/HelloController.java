package com.sharp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 584003 on 2017/2/28.
 */
@Controller
@RequestMapping("/world")
public class HelloController {
    @RequestMapping("/hello")
    private String hello(){
        return "index";
    }
}
