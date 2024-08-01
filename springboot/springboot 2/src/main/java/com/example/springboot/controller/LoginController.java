package com.example.springboot.controller;

import com.example.springboot.database.dao.UserDAO;
import com.example.springboot.database.entity.User;
import com.example.springboot.form.CreateAccountFormBean;
import com.example.springboot.security.AuthenticatedUserUtilities;
import com.example.springboot.service.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


@Slf4j
@Controller
@RequestMapping("/account")
public class LoginController {


    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticatedUserUtilities authenticatedUserUtilities;


    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView response = new ModelAndView("auth/login");

        return response;
    }

    @GetMapping("create-account")
    public ModelAndView createAccount() {
        ModelAndView response = new ModelAndView("auth/create-account");
        return response;
    }

    @PostMapping("/create-account")
    public ModelAndView createAccountSubmit(@Valid CreateAccountFormBean form, BindingResult bindingResult, HttpSession session) {
        ModelAndView response = new ModelAndView("auth/create-account");

        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.debug("Validation error : " + ((FieldError) error).getField() + " = " + error.getDefaultMessage());
            }

            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);
        } else {
            userService.createUser(form);
            authenticatedUserUtilities.manualAuthentication(session,form.getEmail(),form.getPassword());
        }

        return response;
    }

}
