package com.demente.ideas.app.builder;

import com.demente.ideas.app.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserBuilder {

        private User user;

        private UserBuilder() {
            this.user = new User();
        }

        public UserBuilder name(String name) {
            this.user.setName(name);
            return this;
        }

        public UserBuilder lastname(String lastname) {
            this.user.setLastname(lastname);
            return this;
        }

        public UserBuilder phone(String phone) {
            this.user.setPhone(phone);
            return this;
        }

        public UserBuilder profession(String profession) {
            this.user.setProfession(profession);
            return this;
        }

        public UserBuilder birthday(LocalDate birthday) {
            this.user.setBirthday(birthday);
            return this;
        }

        public UserBuilder address(String address) {
            this.user.setAddress(address);
            return this;
        }

        public UserBuilder objeto(String objeto) {
            if(this.user.getObjects() == null) {
                this.user.setObjects(new ArrayList<>());
            }
            this.user.getObjects().add(objeto);
            return this;
        }

        public User build() {
            return this.user;
        }
}
