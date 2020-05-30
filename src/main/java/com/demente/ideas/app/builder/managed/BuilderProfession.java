package com.demente.ideas.app.builder.managed;

import com.demente.ideas.app.User;

public class BuilderProfession extends BuilderDirected {

    public BuilderProfession(User user) {
        this.user = new User();
        this.user = user;
    }

    public BuilderFork profession(String profession) {
        this.user.setProfession(profession);
        return new BuilderFork(user);
    }
}