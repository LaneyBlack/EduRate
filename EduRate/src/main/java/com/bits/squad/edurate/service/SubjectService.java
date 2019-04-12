package com.bits.squad.edurate.service;

import com.bits.squad.edurate.model.Subject;
import com.bits.squad.edurate.model.User;

import java.util.HashMap;
import java.util.List;

public interface SubjectService {
    public void addSubject(Subject subject, User user);
    public void updateSubject(Subject subject, User user);
    public void removeSubject(User user, String subjectName);
    public Subject getSubjectByName(User user, String subjectName);
    public void removeAllSubjects(User user);
    public List<Subject> listSubjects(User user);
}
