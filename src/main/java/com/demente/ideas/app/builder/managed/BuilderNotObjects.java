package com.demente.ideas.app.builder.managed;

import com.demente.ideas.app.User;

public class BuilderNotObjects extends BuilderDirected {

    public BuilderNotObjects(User user) {
        this.user = new User();
        this.user = user;
    }

    public User build() {
        return this.user;
    }
}