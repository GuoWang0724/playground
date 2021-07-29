package com.ymj.domain;

import java.util.Date;

public class PgUser {
    private Integer id;

    private String name;

    private String phone;

    private String password;

    private String idcard;

    private Date registertime;

    private String registertimeString;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getRegistertimeString() {
        return registertimeString;
    }

    public void setRegistertimeString(String registertimeString) {
        this.registertimeString = registertimeString == null ? null : registertimeString.trim();
    }
}