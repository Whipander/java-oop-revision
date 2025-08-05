package org.musicalschool;

import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString

public class Student extends Person {
    private String id;
    private List<Course> followedCourses;

    public Student(String nom, String prenom, String email) {
        super(nom, prenom, email);
    }

    @Override
    public String showInfos() {
        return super.showInfos() + ", ID:'" + id + "'" +
                ", Followed Courses:\n" + followedCourses;
    }
}