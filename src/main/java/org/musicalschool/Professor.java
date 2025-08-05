package org.musicalschool;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class Professor extends Person {
    private List<String> taughtInstruments;

    public Professor(String nom, String prenom, String email, List<String> taughtInstruments) {
        super(nom, prenom, email);
        this.taughtInstruments = taughtInstruments;
    }
}
