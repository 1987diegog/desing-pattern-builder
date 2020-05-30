package com.demente.ideas.app.builder.inside;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserBuilderInside {

    private String name;
    private String lastname;
    private String phone;
    private String profession;
    private LocalDate birthday;
    private String address;
    private List<String> objetos;

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder inside class without being directed
     */
    public static class Builder {

        private UserBuilderInside user;

        private Builder() {
            this.user = new UserBuilderInside();
        }

        public Builder name(String name) {
            this.user.name = name;
            return this;
        }

        public Builder lastname(String lastname) {
            this.user.lastname = lastname;
            return this;
        }

        public Builder phone(String phone) {
            this.user.phone = phone;
            return this;
        }

        public Builder profession(String profession) {
            this.user.profession = profession;
            return this;
        }

        public Builder birthday(LocalDate birthday) {
            this.user.birthday = birthday;
            return this;
        }

        public Builder address(String address) {
            this.user.address = address;
            return this;
        }

        public Builder objeto(String objeto) {
            if(this.user.objetos == null) {
                this.user.setObjetos(new ArrayList<>());
            }
            this.user.getObjetos().add(objeto);
            return this;
        }

        public UserBuilderInside build() {
            return this.user;
        }
    }

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
