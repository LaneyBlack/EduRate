package com.bits.squad.edurate.controller;

import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView getFormUsers(Model model){
        model.addAttribute("registration", new User());
        ModelAndView modelAndView = new ModelAndView("registration");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String addUser(User user, User userSession){
        userService.addUser(user);
        userSession=user;
        return "home";
    }


}
