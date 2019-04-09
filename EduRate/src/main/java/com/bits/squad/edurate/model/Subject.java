package com.bits.squad.edurate.model;

import java.util.HashMap;

public class Subject {

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }

    public Subject(String name, HashMap marks) {
        this.name = name;
    }

    private String name;

    private HashMap<Integer, String> marks;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Integer, String> getMarks() {
        return marks;
    }
    public void setMarks(HashMap<Integer, String> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
