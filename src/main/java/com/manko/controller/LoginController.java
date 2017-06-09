package com.manko.controller;

import com.manko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

public class LoginController {


    @Autowired
    private UserService userService;

    public ModelAndView login(){

    }


}
