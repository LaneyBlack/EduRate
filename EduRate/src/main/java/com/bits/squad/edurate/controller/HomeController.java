package com.bits.squad.edurate.controller;

import com.bits.squad.edurate.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;

public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homeStartMethod() {

        return "home";
    }
}
