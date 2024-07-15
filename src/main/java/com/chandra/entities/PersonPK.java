package com.chandra.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPK {
    private Long aadhar;
    private String passport;

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Long getAadhar() {
        return aadhar;
    }

    public void setAadhar(Long aadhar) {
        this.aadhar = aadhar;
    }
}
