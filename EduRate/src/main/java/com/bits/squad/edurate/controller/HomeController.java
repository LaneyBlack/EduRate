package com.bits.squad.edurate.controller;

import com.bits.squad.edurate.model.Subject;
import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class HomeController {

    @Autowired
    SubjectService subjectService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String listSubjects(Model model, @ModelAttribute("user_session") User user) {
        model.addAttribute("subject", new Subject());
        model.addAttribute("listSubjects", this.subjectService.listSubjects(user));
        return "home";
    }

    //For add and update person both
    @RequestMapping(value = "/home/add", method = RequestMethod.POST)
    public String addSubject(@ModelAttribute("user_session") User user, @ModelAttribute("subject.name") String subjectName,
                             @ModelAttribute("subject.marks") String subjectMarks, @ModelAttribute("quarter") String quarter) {
        //Quarter from String to Integer
        Integer finalQuarter = Integer.parseInt(quarter);
        //Marks from String to ArrayList
        ArrayList<Integer> marks = new ArrayList<>();
        String[] marksStr = subjectMarks.trim().split(",");
        for (String mrk:
                marksStr) {
            Integer mi =  Integer.parseInt(mrk.trim());
            marks.add(mi);
        }
        //Creating hashMap of marks
        HashMap<Integer,ArrayList> finalMarks = new HashMap<>();
        finalMarks.put(1,marks);

        Subject s = new Subject(subjectName,finalMarks);
        if (user.getUserSubjects().contains(subjectName)) {
            //new subject exists, then update it
            this.subjectService.updateSubject(s, user);
        } else {
            this.subjectService.addSubject(s, user);
        }
        return "redirect:/home";
    }

    @RequestMapping("/remove/{name}")
    public String removeSubject(@PathVariable("name") String name, @ModelAttribute("user_session") User user) {
        this.subjectService.removeSubject(user, name);
        return "redirect:/home";
    }

    @RequestMapping("/edit/{name}")
    public String editSubject(@PathVariable("name") String name, Model model, @ModelAttribute("user_session") User user) {
        model.addAttribute("subject", this.subjectService.getSubjectByName(user, name));
        model.addAttribute("listSubjects", this.subjectService.listSubjects(user));
        return "home";
    }

}
