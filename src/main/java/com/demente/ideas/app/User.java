package com.demente.ideas.app;

import java.time.LocalDate;
import java.util.List;

public class User {

    private String name;
    private String lastname;
    private String phone;
    private String profession;
    private LocalDate birthday;
    private String address;
    private List<String> objetos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<String> objetos) {
        this.objetos = objetos;
    }
}
