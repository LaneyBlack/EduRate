package com.bits.squad.edurate.controller;

import com.bits.squad.edurate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserTopController {

    @Autowired
    UserService userService;

    @RequestMapping(value ="userTop", method = RequestMethod.GET)
    public String getUserTop(Model model) {
        model.addAttribute("userList",this.userService.userList());
        return "userTop";
    }
}
