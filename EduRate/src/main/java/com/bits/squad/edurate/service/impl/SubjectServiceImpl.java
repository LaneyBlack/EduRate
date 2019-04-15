package com.bits.squad.edurate.service.impl;

import com.bits.squad.edurate.model.Subject;
import com.bits.squad.edurate.model.User;
import com.bits.squad.edurate.service.SubjectService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service("subjectServiceImpl")
public class SubjectServiceImpl implements SubjectService {

    private ArrayList<Subject> fromJson(User user) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList>() {
        }.getType();
        return gson.fromJson(user.getUserSubjects(), type);
    }

    @Override
    public void addSubject(Subject subject, User user) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList>() {
        }.getType();
        //from Json
        ArrayList<Subject> subjects = fromJson(user);
        subjects.add(subject);
        //to Json
        user.setUserSubjects(gson.toJson(subjects, type));
    }

    @Override
    public void updateSubject(Subject subject, User user) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList>() {
        }.getType();
        ArrayList<Subject> subjects = fromJson(user);
        for (Subject s:
             subjects) {
            if (s.getName().equals(subject.getName())) {
                subjects.remove(s);
                subjects.add(subject);
            }
        }
        user.setUserSubjects(gson.toJson(subjects, type));
    }

    @Override
    public void removeSubject(User user, String subjectName) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList>() {
        }.getType();
        ArrayList<Subject> subjects = fromJson(user);
        for (Subject s : subjects) {
            if (s.getName().equals(subjectName)) {
                subjects.remove(s);
            }
        }
        user.setUserSubjects(gson.toJson(subjects, type));
    }

    @Override
    public Subject getSubjectByName(User user, String subjectName) {
        ArrayList<Subject> subjects = fromJson(user);
        for (Subject s :
                subjects) {
            if (s.getName().equals(subjectName)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void removeAllSubjects(User user) {
        user.setUserSubjects(null);
    }

    @Override
    public List<Subject> listSubjects(User user) {
        return fromJson(user);
    }
}
