package com.bits.squad.edurate.service;

import com.bits.squad.edurate.model.Subject;
import com.bits.squad.edurate.model.User;

public interface SubjectService {
    public void addSubject(Subject subject, User user);
    public void updateSubject();
    public void deleteSubject();
    public Subject getSubjectByName();
}
