package com.demente.ideas.app.builder.managed;

import com.demente.ideas.app.User;

public class BuilderPhone extends BuilderDirected {

    public BuilderPhone(User user) {
        this.user = new User();
        this.user = user;
    }

    public BuilderBirthday phone(String phone) {
        this.user.setPhone(phone);
        return new BuilderBirthday(user);
    }
}