package com.bits.squad.edurate.service.impl;

import com.bits.squad.edurate.model.Subject;
import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.service.SubjectService;
import com.mysql.cj.xdevapi.JsonString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectServiceImpl implements SubjectService {

    @Override
    public void addSubject(Subject subject, User user) {
        String jsonSubjects = user.getUserSubjects();
        //from {key = value, key = value} to key = value , key = value
        jsonSubjects.substring(1,jsonSubjects.length()-1);
        String[] keyValuePairs = jsonSubjects.split(",");
        Map<String, String> subjects = new HashMap<>();
        for(String pair:keyValuePairs) {
            String[] entry = pair.split("="); //split the pairs to get key and value
            subjects.put(entry[0].trim(), entry[1]);
        }
    }

    @Override
    public void updateSubject() {

    }

    @Override
    public void deleteSubject() {

    }

    @Override
    public Subject getSubjectByName() {
        return null;
    }
}
