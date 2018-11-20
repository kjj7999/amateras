package com.homefire.amateras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/**/{path:[^\\.]+}")
    public String forward() {
        return "forward:/";
    }
}
