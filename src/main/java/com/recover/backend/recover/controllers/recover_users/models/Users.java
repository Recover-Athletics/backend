package com.recover.backend.recover.controllers.recover_users.models;

import java.util.Date;
import java.util.List;

import com.recover.backend.recover.controllers.recover_users.models.submodels.Injuries;
import com.recover.backend.recover.controllers.recover_users.models.submodels.Insightdata;

public class Users {
    private String firstname;
    private String lastname;
    private String email;
    private String state;
    private String phonenumber;
    private String gender;
    private Date dateadded;
    private List<Injuries> injuries;
    private List<Insightdata> insightdata;
    private String stravaid;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateadded() {
        return dateadded;
    }

    public void setDateadded(Date dateadded) {
        this.dateadded = dateadded;
    }

    public List<Injuries> getInjuries() {
        return injuries;
    }

    public void setInjuries(List<Injuries> injuries) {
        this.injuries = injuries;
    }

    public List<Insightdata> getInsightdata() {
        return insightdata;
    }

    public void setInsightdata(List<Insightdata> insightdata) {
        this.insightdata = insightdata;
    }

    public String getStravaid() {
        return stravaid;
    }

    public void setStravaid(String stravaid) {
        this.stravaid = stravaid;
    }


}