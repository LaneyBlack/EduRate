package com.bits.squad.edurate.controller;

import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin(Model model) {
        model.addAttribute("login", new User());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(Model model, @ModelAttribute("user_session") User userSession,
                          @ModelAttribute("login") User userLog){
        User user = userService.getUserByName(userLog.getUserName());
        if(user != null){
            if(user.getPassword().equals(userLog.getPassword())){
                userSession=user;
                String str = userSession.getUserName();
                model.addAttribute("message", str);
                return "home";
            }
            else {
                model.addAttribute("message", "Login failed. Try again.");
                return "notFound";
            }
        }
        else {
            model.addAttribute("message", "Login failed. Try again.");
            return "notFound";
        }
    }

}
