package com.sharp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 584003 on 2017/3/1.
 */
@RestController
public class WorldController {
    @GetMapping("/world")
    private String baby(){
        return "sharp is so beautiful !";
    }
}
