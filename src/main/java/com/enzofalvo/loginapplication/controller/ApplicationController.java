package com.enzofalvo.loginapplication.controller;

import com.enzofalvo.loginapplication.model.User;
import com.enzofalvo.loginapplication.service.UserService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ApplicationController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView getRegister() {
        return new ModelAndView("register");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String postRegister(@Valid User user, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors() || !user.getPassword().equals(user.getPassword2()) || userService.findByName(user.getName()) == true || user.getPassword().isBlank()) {
            return "redirect:/register";
        } else {
            userService.save(user);
            return "success";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLogin() {
        return new ModelAndView("login");
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String Login(@Valid User user, BindingResult result, RedirectAttributes attributes, String name, String password) {
        if (result.hasErrors() || !userService.findByNameAndPassword(name, password)) {
            return "redirect:/login";
        }
        else {
            return "mainPage";
        }
    }
}
