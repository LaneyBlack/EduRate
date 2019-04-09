package com.bits.squad.edurate.controller;

import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.service.UserService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getFormUsers(Model model) {
        model.addAttribute("registration", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String addUser(User user, User userSession) {
        try {
            userService.addUser(user);
        } catch (ConstraintViolationException e){
            return "alreadyExists";
        }
        return "home";

    }
}
