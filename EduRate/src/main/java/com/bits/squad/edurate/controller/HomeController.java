package com.bits.squad.edurate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView homeStartMethod(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
}
