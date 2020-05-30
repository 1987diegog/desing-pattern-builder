package com.demente.ideas.app.builder;

import com.demente.ideas.app.User;
import com.demente.ideas.app.builder.managed.UserBuilderDirected;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserBuilderDirectedTest {

    @Test
    void builderWhitObjects_should() {

        User user = UserBuilderDirected.builder()
                .name("Diego")
                .lastname("Gonzalez")
                .address("España")
                .phone("4568")
                .birthday(LocalDate.of(1987, 04, 20))
                .profession("Backend Developer")
                .hasObjects()
                .objeto("Una cosa")
                .objeto("Otra cosa")
                .objeto("una ultima cosa")
                .build();

        assertEquals(user.getName(), "Diego");
        assertEquals(user.getLastname(), "Gonzalez");
        assertEquals(user.getProfession(), "Backend Developer");
        assertEquals(user.getObjetos().size(), 3);
    }

    @Test
    void builderWhitoutObjects_should() {

        User user = UserBuilderDirected.builder()
                .name("Diego")
                .lastname("Gonzalez")
                .address("España")
                .phone("4568")
                .birthday(LocalDate.of(1987, 04, 20))
                .profession("Backend Developer")
                .hasNotObjects()
                .build();

        assertEquals(user.getName(), "Diego");
        assertEquals(user.getLastname(), "Gonzalez");
        assertEquals(user.getProfession(), "Backend Developer");
        assertEquals(user.getObjetos(), null);
    }
}