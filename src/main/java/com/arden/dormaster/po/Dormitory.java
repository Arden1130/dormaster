package com.arden.dormaster.po;

import java.util.List;

public class Dormitory {
    private static final long serialVersionUID=1L;
    private Integer d_dormitory_id;
    private Integer d_building_id;
    private Integer d_bedtotal;
    private Integer d_bed;
    private Integer d_charge_left;
    private List<Student> students;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getD_dormitory_id() {
        return d_dormitory_id;
    }

    public void setD_dormitory_id(Integer d_dormitory_id) {
        this.d_dormitory_id = d_dormitory_id;
    }

    public Integer getD_building_id() {
        return d_building_id;
    }

    public void setD_building_id(Integer d_building_id) {
        this.d_building_id = d_building_id;
    }

    public Integer getD_bedtotal() {
        return d_bedtotal;
    }

    public void setD_bedtotal(Integer d_bedtotal) {
        this.d_bedtotal = d_bedtotal;
    }

    public Integer getD_bed() {
        return d_bed;
    }

    public void setD_bed(Integer d_bed) {
        this.d_bed = d_bed;
    }

    public Integer getD_charge_left() {
        return d_charge_left;
    }

    public void setD_charge_left(Integer d_charge_left) {
        this.d_charge_left = d_charge_left;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
