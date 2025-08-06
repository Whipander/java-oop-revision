package org.musicalschool.courseRelated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.musicalschool.entity.Professor;
import org.musicalschool.entity.Student;

import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class MusicalSchool {
    private List<Professor> professors;
    private List<Student> students;
    private List<Course> courses;

    public void showPlanning() {
        courses.stream()
                .sorted(Comparator.comparing(Course::getDay))
                .forEach(course -> {
                    System.out.println("Day: " + course.getDay());
                    System.out.println("Name: " + course.getName() + " - " + course.getInstrument());
                    System.out.println("Professor: " + course.getProfessor());
                    System.out.println("Students: " + course.getRegisteredStudents().size());
                });
    }
}
