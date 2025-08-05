package org.musicalschool.entity;

import lombok.*;
import org.musicalschool.courseRelated.Course;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString

public class Student extends Person {
    private String id;
    private List<Course> followedCourses;

    public Student(String lastName, String firstName, String email, String id, List<Course> followedCourses) {
        super(lastName, firstName, email);
        this.id = id;
        this.followedCourses = followedCourses;
    }

    @Override
    public void showInfos() {
        System.out.println("Student: " + getFirstName() + " " + getLastName() + ", Email: " + getEmail());
    }
}