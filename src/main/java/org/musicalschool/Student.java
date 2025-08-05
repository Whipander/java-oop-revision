package org.musicalschool;

import java.util.List;

public class Student extends Person {
    private String id;
    private List<Course> flowedCourses;

    public Student(String nom, String prenom, String email) {
        super(nom, prenom, email);
    }
}