package com.demente.ideas.app.builder.managed;

import com.demente.ideas.app.User;

public class BuilderName extends BuilderDirected {

    public BuilderName() {
        this.user = new User();
    }

    public BuilderLastname name(String name) {
        this.user.setName(name);
        return new BuilderLastname(user);
    }
}
