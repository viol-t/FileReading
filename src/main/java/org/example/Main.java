package org.example;

import org.example.Services.Implementation.PrincipalImplementation;
import org.example.Services.Implementation.StudentImplementation;
import org.example.Services.Implementation.TeacherImplementation;
import org.example.entities.*;

public class Main {
    public static void main(String[] args) {

        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        StudentImplementation studentImplementation = new StudentImplementation();
        TeacherImplementation teacherImplementation = new TeacherImplementation();

        Courses courses = new Courses("home economics");

        Teachers teachers = new Teachers("Adanne", "Okafor", 35, true, "home economics" );

        Students student1 = new Students("Mary", "Okene", 12, "good", "home economics");
        //violet.readFromCsv(path);

        Classes classes = new Classes("JSS 1", "home economics", student1, teachers);

        Applicants applicants = new Applicants("Fabian", "James", 10);

        Principal principal = new Principal("Jumbo", "Adamu", 52, true, student1, applicants);

        School school = new School("Brilliant Schools", teachers, student1, classes, "home economics", principal, applicants);

        // to read and add a new course
        ReadAndWriteCoursesList CoursesList = new ReadAndWriteCoursesList();


        // to read and add a new staff
       ReadAndWriteStaffList Stafflist = new ReadAndWriteStaffList();


        // to read and add a new student
        ReadAndWriteStudentList studentlist = new ReadAndWriteStudentList();






    }
}