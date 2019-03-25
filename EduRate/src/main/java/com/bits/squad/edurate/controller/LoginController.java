package com.bits.squad.edurate.controller;

import com.bits.squad.edurate.model.Login;
import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("login", new Login());

        return modelAndView;
    }

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login) {
        ModelAndView modelAndView = null;

        User user = userService.validateUser(login);

        if (user != null) {
            modelAndView = new ModelAndView("welcome");
        } else {
            modelAndView = new ModelAndView("login");
            modelAndView.addObject("message", "User or Password is wrong!");
        }

        return modelAndView;
    }

}
