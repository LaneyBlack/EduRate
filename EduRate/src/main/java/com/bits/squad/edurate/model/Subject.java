package com.bits.squad.edurate.model;

import java.util.ArrayList;
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

    private HashMap<Integer, ArrayList<Integer>> marks;

    private Integer averageMark;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Integer, ArrayList<Integer>> getMarks() {
        return marks;
    }
    public void setMarks(HashMap<Integer, ArrayList<Integer>> marks) {
        this.marks = marks;
    }

    public Integer getAverageMark(Integer quarter) {
        for (Integer i:
                marks.get(quarter)) {
            averageMark += i;
        }
        return averageMark;
    }
    public void setAverageMark(Integer averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
