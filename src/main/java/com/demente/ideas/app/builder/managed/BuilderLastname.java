package com.demente.ideas.app.builder.managed;

import com.demente.ideas.app.User;

public class BuilderLastname extends BuilderDirected {

    public BuilderLastname(User user) {
        this.user = new User();
        this.user = user;
    }

    public BuilderAddress lastname(String lastname) {
        this.user.setLastname(lastname);
        return new BuilderAddress(user);
    }
}