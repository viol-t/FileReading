package org.example.Services;

import org.example.entities.School;
import org.example.entities.Students;

public interface StudentService {

    String takeCourse(String courseName, School school, Students students);

}
