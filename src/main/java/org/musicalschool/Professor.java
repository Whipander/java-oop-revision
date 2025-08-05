package org.musicalschool;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Professor extends Person {
    private List<String> instruments;
    private List<Course> courses;

    public Professor(String nom, String prenom, String email, List<String> instruments) {
        super(nom, prenom, email);
        this.instruments = instruments;
    }

    public void teachCourse(Course course) {
        if (courses.contains(course)) {
            System.out.println("Course already taken");
        } else {
            courses.add(course);
            System.out.println("Course added to the list");
        }
    }

    @Override
    public String showInfos() {
        return super.showInfos() + "Taught Instruments: " + instruments +
                ", Courses: " + courses;
    }
}
