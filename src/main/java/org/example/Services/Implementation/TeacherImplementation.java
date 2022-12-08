package org.example.Services.Implementation;

import org.example.Services.TeacherService;
import org.example.entities.School;
import org.example.entities.Students;
import org.example.entities.Teachers;

public class TeacherImplementation implements TeacherService {
   public String teachCourse(String courseName, School school){
       Students students = school.getStudents();
       String courses = school.getCourses();
       Teachers teachers = school.getTeachers();

           if(teachers.getCourses().equalsIgnoreCase(courseName)){
               return teachers.getFirstName() + " " + teachers.getLastName() + " can teach " + courseName;
           }

       return teachers.getFirstName() + " " + teachers.getLastName() + " can not teach " + courseName;
    }
}
