package com.techlabs.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting (Map<String , Object> Model) {
        Model.put("message" , "Hello Venura");
        return "greeting";
    }

    @GetMapping("thyme")
    public String thyme (Map<String , Object> Model) {
        Model.put("message" , "Hello thyme");
        return "thyme";
    }



}
