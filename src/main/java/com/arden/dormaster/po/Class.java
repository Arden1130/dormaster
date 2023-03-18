package com.arden.dormaster.po;

import java.util.List;

public class Class {
    private String c_id;
    private String c_classname;
    private String c_counsellor;
    private List<Student> students;

    public Class(){}
    public Class(String c_id, String c_classname, String c_counsellor, List<Student> students) {
        this.c_id = c_id;
        this.c_classname = c_classname;
        this.c_counsellor = c_counsellor;
        this.students = students;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_classname() {
        return c_classname;
    }

    public void setC_classname(String c_classname) {
        this.c_classname = c_classname;
    }

    public String getC_counsellor() {
        return c_counsellor;
    }

    public void setC_counsellor(String c_counsellor) {
        this.c_counsellor = c_counsellor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
