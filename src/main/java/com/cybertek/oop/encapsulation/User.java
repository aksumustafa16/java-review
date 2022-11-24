package com.cybertek.oop.encapsulation;

import com.cybertek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    private String firstName;
    private String lastName;
    private Role role;
    private Gender gender;

    public User(int i, LocalDateTime now, int i1, LocalDateTime plusHours, int i2, String delisa, String norre, Role managerRole, Gender female) {

    }
}
