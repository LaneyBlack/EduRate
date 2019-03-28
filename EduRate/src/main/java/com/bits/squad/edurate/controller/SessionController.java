package com.bits.squad.edurate.controller;

import com.bits.squad.edurate.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
@SessionAttributes("user_session")
public class SessionController {

    @ModelAttribute("user_session")
    public User populateUser(){
        return  new User();
    }

    @RequestMapping(value = "/homeAttr", method = RequestMethod.GET)
    public String sessionAttributes (@ModelAttribute User user) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject(user);
        return "redirect:/home";
    }
}
