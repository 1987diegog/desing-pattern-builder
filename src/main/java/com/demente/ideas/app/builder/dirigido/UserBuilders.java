package com.demente.ideas.app.builder.dirigido;

import com.demente.ideas.app.User;

import java.time.LocalDate;

public interface UserBuilders {

    interface Name {
        Lastname name(String name);
    }

    interface Lastname {
        Phone lastname(String lastname);
    }

    interface Phone {
        Optionals phone(String phone);
    }

    interface Optionals {
        Optionals profession(String profession);
        Optionals birthday(LocalDate birthday);
        Optionals address(String address);
        Optionals object(String object);
        User build();
    }

}
