package com.bits.squad.edurate.model;

import java.util.HashMap;
import java.util.Map;

public class Subject {

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }

    private String name;

    private int semester;

    private HashMap<Integer, Integer> marks;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }

    public HashMap<Integer, Integer> getMarks() {
        return marks;
    }
    public void setMarks(HashMap<Integer, Integer> marks) {
        this.marks = marks;
    }
}
