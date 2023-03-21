package com.arden.dormaster.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class DormRepair {
    private int r_id;
    private int d_dormitory_id;
    private int d_building_id;
    private String r_name;
    private String reason;
    private String state;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date create_time;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date update_time;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getD_dormitory_id() {
        return d_dormitory_id;
    }

    public void setD_dormitory_id(int d_dormitory_id) {
        this.d_dormitory_id = d_dormitory_id;
    }

    public int getD_building_id() {
        return d_building_id;
    }

    public void setD_building_id(int d_building_id) {
        this.d_building_id = d_building_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
