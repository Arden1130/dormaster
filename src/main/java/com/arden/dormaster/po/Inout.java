package com.arden.dormaster.po;

public class Inout {
    private Integer d_inout_id;
    private Integer s_id;
    private String s_name;
    private Integer d_building_id;
    private Integer d_dormitory_id;
    private Integer bed_id;
    private String d_inorout;
    private String d_inouttime;

    public Inout() {
    }
    public Inout(Integer d_inout_id, Integer s_id, String s_name, Integer d_building_id, Integer d_dormitory_id, Integer bed_id, String d_inorout, String d_inouttime) {
        this.d_inout_id = d_inout_id;
        this.s_id = s_id;
        this.s_name = s_name;
        this.d_building_id = d_building_id;
        this.d_dormitory_id = d_dormitory_id;
        this.bed_id = bed_id;
        this.d_inorout = d_inorout;
        this.d_inouttime = d_inouttime;
    }

    public Integer getD_inout_id() {
        return d_inout_id;
    }

    public void setD_inout_id(Integer d_inout_id) {
        this.d_inout_id = d_inout_id;
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

    public String getD_inorout() {
        return d_inorout;
    }

    public void setD_inorout(String d_inorout) {
        this.d_inorout = d_inorout;
    }

    public String getD_inouttime() {
        return d_inouttime;
    }

    public void setD_inouttime(String d_inouttime) {
        this.d_inouttime = d_inouttime;
    }
}
