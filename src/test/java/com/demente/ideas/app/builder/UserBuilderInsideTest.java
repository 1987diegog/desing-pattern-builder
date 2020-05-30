package com.demente.ideas.app.builder;

import com.demente.ideas.app.builder.inside.UserBuilderInside;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserBuilderInsideTest {

    @Test
    void builder() {

        UserBuilderInside user = UserBuilderInside.builder()
                .name("Diego").lastname("Gonzalez")
                .phone("5457894562")
                .profession("Lic.Sistemas")
                .address("Uruguay")
                .birthday(LocalDate.of(1987, 04, 20))
                .objeto("Pelota de futbol").objeto("Raqueta").objeto("Gorro")
                .build();

        assertEquals(user.getName(), "Diego");
        assertEquals(user.getPhone(), "5457894562");
        assertEquals(user.getAddress(), "Uruguay");
        assertEquals(user.getObjetos().size(), 3);
    }
}