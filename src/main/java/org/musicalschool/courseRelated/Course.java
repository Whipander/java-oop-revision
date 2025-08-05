package org.musicalschool.courseRelated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.musicalschool.entity.Professor;
import org.musicalschool.entity.Student;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Course {
    private String name;
    private Professor professor;
    private String instrument;
    private List<Student> registeredStudents;
    private String day;

    public void addStudent(Student student) {
        if (registeredStudents.contains(student)) {
            System.out.println("Student already registered");
        }else {
            registeredStudents.add(student);
            System.out.println("Student registered");
        }
    }
}
