package com.bits.squad.edurate.controller;

import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.service.UserService;
import com.bits.squad.edurate.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void registerUser(String username, String password) {
        User user = new User(username, password);
        userServiceImpl.saveUser(user);
    }
}
