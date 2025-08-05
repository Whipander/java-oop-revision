package org.musicalschool;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
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
    public String showInfos() {
        return ("Person: " +
                "Last Name:'" + lastName + "'" +
                ", First Name:'" + firstName + "'" +
                ", Email:'" + email + "'");
    }
}
