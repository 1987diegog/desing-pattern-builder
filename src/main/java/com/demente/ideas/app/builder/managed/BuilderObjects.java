package com.demente.ideas.app.builder.managed;

import com.demente.ideas.app.User;

import java.util.ArrayList;

public class BuilderObjects extends BuilderDirected {

    public BuilderObjects(User user) {
        this.user = new User();
        this.user = user;
    }

    public BuilderObjects objeto(String objeto) {
        if (this.user.getObjetos() == null) {
            this.user.setObjetos(new ArrayList<>());
        }
        this.user.getObjetos().add(objeto);
        return this;
    }

    public User build() {
        return this.user;
    }
}
