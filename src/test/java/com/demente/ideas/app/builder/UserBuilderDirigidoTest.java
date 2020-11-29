package com.demente.ideas.app.builder;

import com.demente.ideas.app.User;
import com.demente.ideas.app.builder.dirigido.UserBuilder;
import com.demente.ideas.app.builder.dirigido.UserBuilders;
import com.demente.ideas.app.builder.managed.UserBuilderDirected;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserBuilderDirigidoTest {

    @Test
    void builderWhitObjects_should() {

        User user = UserBuilder.builder()
                .name("Diego")
                .lastname("Gonzalez")
                .phone("4568")
                .birthday(LocalDate.of(1987, 04, 20))
                .address("España")
                .profession("Backend Developer")
                .object("Una cosa")
                .object("Otra cosa")
                .object("una ultima cosa")
                .build();

        assertEquals(user.getName(), "Diego");
        assertEquals(user.getLastname(), "Gonzalez");
        assertEquals(user.getProfession(), "Backend Developer");
        assertEquals(user.getObjects().size(), 3);
    }

    @Test
    void builderWhitoutObjects_should() {

        User user = UserBuilder.builder()
                .name("Diego")
                .lastname("Gonzalez")
                .phone("4568")
                .build();

        assertEquals(user.getName(), "Diego");
        assertEquals(user.getLastname(), "Gonzalez");
        assertEquals(user.getObjects(), null);
    }
}