package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping()
@RestController
public class MainController {

    @GetMapping()
    public ModelAndView main (){
        return new ModelAndView("/index");
    }

}
