package Implementation;

import org.example.Services.Implementation.StudentImplementation;
import org.example.entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentImplementationTest {
    Students students;
    Courses courseName;

    Courses courseName1;
    School school;
    Principal principal;
    Teachers teachers;
    Classes classes;
    Applicants applicants;
    @BeforeEach
    void setUp() {

        courseName = new Courses();
        courseName.setCourseName("home economics");

        courseName1 = new Courses();
        courseName1.setCourseName("mathematics");

         students = new Students();
         students.setFirstName("Ada");
         students.setLastName("mazi");
         students.setAge(12);
         students.setCourses(courseName.getCourseName());
         students.setType("good");

         applicants = new Applicants();
         applicants.setFirstName("james");
         applicants.setLastName("obi");
         applicants.setAge(13);

         principal = new Principal();
         principal.setFirstName("Barnabas");
         principal.setLastName("Okoro");
         principal.setStudents(students);
         principal.setAge(50);
         principal.setIspresent(true);
         principal.setApplicants(applicants);

          teachers = new Teachers();
         teachers.setFirstName("okafor");
         teachers.setLastName("okere");
         teachers.setAge(39);
         teachers.setCourses(courseName.getCourseName());
         teachers.setIspresent(true);

         classes =new Classes();
         classes.setClassName("JSS 1");
         classes.setStudents(students);
         classes.setCourses(courseName.getCourseName());
         classes.setTeachers(teachers);


        school = new School("Brilliant schools", teachers, students, classes, courseName.getCourseName(), principal, applicants);

    }
    @Test
    void takeCourse() {
        StudentImplementation studentImplementation = new StudentImplementation();
        String expected = students.getFirstName() + " " + students.getLastName() + " can take " + courseName.getCourseName();
        String actual = studentImplementation.takeCourse("home economics", school, students);
        assertEquals(expected,actual);
    }
    @Test
    void cannotTakeCourse() {
        StudentImplementation studentImplementation = new StudentImplementation();
        String expected = students.getFirstName() + " " + students.getLastName() + " can not take " + courseName1.getCourseName();
        String actual = studentImplementation.takeCourse("mathematics", school, students);
        assertEquals(expected,actual);
    }
}