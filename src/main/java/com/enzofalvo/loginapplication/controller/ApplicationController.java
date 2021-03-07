
package com.enzofalvo.loginapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView getRegister() {
        return new ModelAndView("register");
    }
}
