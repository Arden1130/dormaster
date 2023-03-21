package com.arden.dormaster.po;

public class Student {
    private static final long serialVersionUID=1L; //？
    private Integer s_id;
    private String s_name;
    private String s_sex;
    private Integer s_age;
    private String s_phone;
    private String s_identityid;
    private String s_home;
    private String c_id;
    private String c_classname;
    private Integer d_building_id;
    private Integer d_dormitory_id;
    private Integer bed_id;
    private String s_indorm;

    public static long getSerialVersionUID(){
        return serialVersionUID;
    }
    public Student(){}
    public Student(Integer s_id, String s_name, String s_sex, Integer s_age, String s_phone, String s_identityid, String s_home, String c_id, String c_classname, Integer d_building_id, Integer d_dormitory_id, Integer bed_id, String s_indorm) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_sex = s_sex;
        this.s_age = s_age;
        this.s_phone = s_phone;
        this.s_identityid = s_identityid;
        this.s_home = s_home;
        this.c_id = c_id;
        this.c_classname = c_classname;
        this.d_building_id = d_building_id;
        this.d_dormitory_id = d_dormitory_id;
        this.bed_id = bed_id;
        this.s_indorm = s_indorm;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public Integer getS_age() {
        return s_age;
    }

    public void setS_age(Integer s_age) {
        this.s_age = s_age;
    }

    public String getS_phone() {
        return s_phone;
    }

    public void setS_phone(String s_phone) {
        this.s_phone = s_phone;
    }

    public String getS_identityid() {
        return s_identityid;
    }

    public void setS_identityid(String s_identityid) {
        this.s_identityid = s_identityid;
    }

    public String getS_home() {
        return s_home;
    }

    public void setS_home(String s_home) {
        this.s_home = s_home;
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

    public Integer getD_building_id() {
        return d_building_id;
    }

    public void setD_building_id(Integer d_building_id) {
        this.d_building_id = d_building_id;
    }

    public Integer getD_dormitory_id() {
        return d_dormitory_id;
    }

    public void setD_dormitory_id(Integer d_dormitory_id) {
        this.d_dormitory_id = d_dormitory_id;
    }

    public Integer getBed_id() {
        return bed_id;
    }

    public void setBed_id(Integer bed_id) {
        this.bed_id = bed_id;
    }

    public String getS_indorm() {
        return s_indorm;
    }

    public void setS_indorm(String s_indorm) {
        this.s_indorm = s_indorm;
    }
}
