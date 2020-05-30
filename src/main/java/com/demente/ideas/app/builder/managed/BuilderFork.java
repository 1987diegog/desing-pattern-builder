package com.demente.ideas.app.builder.managed;

import com.demente.ideas.app.User;

public class BuilderFork extends BuilderDirected {

        public BuilderFork(User user) {
            this.user = new User();
            this.user = user;
        }

        public BuilderObjects hasObjects() {
            return new BuilderObjects(user);
        }

        public BuilderNotObjects hasNotObjects() {

            return new BuilderNotObjects(user);
        }
    }