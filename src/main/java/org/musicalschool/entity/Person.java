package org.musicalschool.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Person implements Showable {
    private String lastName;
    private String firstName;
    private String email;

    @Override
    public void showInfos() {
        System.out.println("Person: " + getFirstName() + " " + getLastName() + ", Email: " + getEmail());
    }
}
