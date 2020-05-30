package com.demente.ideas.app.builder.managed;

import com.demente.ideas.app.User;

import java.time.LocalDate;

public class BuilderBirthday extends BuilderDirected {

    public BuilderBirthday(User user) {
        this.user = new User();
        this.user = user;
    }

    public BuilderProfession birthday(LocalDate birthday) {
        this.user.setBirthday(birthday);
        return new BuilderProfession(user);
    }
}