package com.demente.ideas.app.builder.managed;

import com.demente.ideas.app.User;

public class BuilderAddress extends BuilderDirected {

    public BuilderAddress(User user) {
        this.user = new User();
        this.user = user;
    }

    public BuilderPhone address(String address) {
        this.user.setAddress(address);
        return new BuilderPhone(user);
    }
}
