package org.musicalschool;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CourseDAO {
    public Set<String> getAllInstruments(List<Course> courses) {
        return courses.stream()
                .map(Course::getInstrument)
                .collect(Collectors.toSet());
    }

    public long getTotalRegisteredStudents(List<Course> courses) {
        return courses.stream()
                .flatMap(course -> course.getRegisteredStudents().stream())
                .distinct()
                .count();
    }

    public Map<String, Long> getRegisteredStudentsPerInstruments(List<Course> courses) {
        return courses.stream()
                .collect(Collectors.groupingBy(
                        Course::getInstrument,
                        Collectors.flatMapping(
                                course -> course.getRegisteredStudents()
                                        .stream().
                                        distinct(),
                                Collectors.counting())));
    }

    public List<Student> getStudentsFollowing2OrMoreCourses(List<Course> courses) {
        return courses.stream()
                .flatMap(course -> course.getRegisteredStudents().stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
