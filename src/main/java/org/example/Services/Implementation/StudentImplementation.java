package org.example.Services.Implementation;

import org.example.Services.StudentService;
import org.example.entities.School;
import org.example.entities.Students;

public class StudentImplementation implements StudentService {

    public String takeCourse(String courseName, School school, Students students) {

            if (students.getCourses().equalsIgnoreCase(courseName)) {
                return students.getFirstName() + " " + students.getLastName() + " can take " + courseName;
            }

        return students.getFirstName() + " " + students.getLastName() + " can not take " + courseName;
    }

}
