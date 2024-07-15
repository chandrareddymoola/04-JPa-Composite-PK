package com.chandra.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Person {

    private String Name;
    private String Email;
    @EmbeddedId
    private PersonPK personPK;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public PersonPK getPersonPK() {
        return personPK;
    }

    public void setPersonPK(PersonPK personPK) {
        this.personPK = personPK;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", personPK=" + personPK +
                '}';
    }
}
