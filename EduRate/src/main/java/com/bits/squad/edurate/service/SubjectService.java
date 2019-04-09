package com.bits.squad.edurate.service;

import com.bits.squad.edurate.model.Subject;
import com.bits.squad.edurate.model.User;

import java.util.HashMap;

public interface SubjectService {
    public void addSubject(Subject subject, User user);
    public void updateSubject(String newSubjectName, HashMap newSubjectMarks, Subject subject, User user);
    public void removeSubject(User user, String subjectName);
    public Subject getSubjectByName(User user, String subjectName);
    public void removeAllSubjects(User user);
}
