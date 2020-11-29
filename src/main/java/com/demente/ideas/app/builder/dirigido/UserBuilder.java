package com.demente.ideas.app.builder.dirigido;

import com.demente.ideas.app.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserBuilder {

    public static UserBuilders.Name builder() {
        return new Builder();
    }

    public static class Builder implements UserBuilders.Name, UserBuilders.Lastname, UserBuilders.Phone, UserBuilders.Optionals {

        private User user;

        public Builder() {
            this.user = new User();
        }

        @Override
        public UserBuilders.Lastname name(String name) {
            this.user.setName(name);
            return this;
        }

        @Override
        public UserBuilders.Phone lastname(String lastname) {
            this.user.setLastname(lastname);
            return this;
        }

        @Override
        public UserBuilders.Optionals phone(String phone) {
            this.user.setPhone(phone);
            return this;
        }

        @Override
        public UserBuilders.Optionals profession(String profession) {
            this.user.setProfession(profession);
            return this;
        }

        @Override
        public UserBuilders.Optionals birthday(LocalDate birthday) {
            this.user.setBirthday(birthday);
            return this;
        }

        @Override
        public UserBuilders.Optionals address(String address) {
            this.user.setAddress(address);
            return this;
        }

        @Override
        public UserBuilders.Optionals object(String object) {
            if(this.user.getObjects() == null) {
                this.user.setObjects(new ArrayList<>());
            }
            this.user.getObjects().add(object);
            return this;
        }

        @Override
        public User build() {
            return user;
        }
    }
}
