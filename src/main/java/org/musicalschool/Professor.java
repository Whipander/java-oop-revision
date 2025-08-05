package org.musicalschool;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Professor extends Person {
    private List<String> taughtInstruments;
    private List<Course> courses;

    public Professor(String nom, String prenom, String email, List<String> taughtInstruments) {
        super(nom, prenom, email);
        this.taughtInstruments = taughtInstruments;
    }

    public void teachCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("Course already taken");
        } else {
            courses.add(course);
            System.out.println("Course added to the list");
        }

    }
}
