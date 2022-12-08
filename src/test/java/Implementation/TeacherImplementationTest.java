package Implementation;

import org.example.Services.Implementation.TeacherImplementation;
import org.example.entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherImplementationTest {

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
        courseName1.setCourseName("Mathematics");


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

        classes = new Classes();
        classes.setClassName("JSS 1");
        classes.setStudents(students);
        classes.setCourses(courseName.getCourseName());
        classes.setTeachers(teachers);


        school = new School("Brilliant schools", teachers, students, classes, courseName.getCourseName(), principal, applicants);
    }
   @Test
   void teachCourse() {
      TeacherImplementation teacherImplementation = new TeacherImplementation();
      String expected = teachers.getFirstName() + " " + teachers.getLastName() + " can teach " + courseName.getCourseName();
      String actual = teacherImplementation.teachCourse("home economics", school);
      assertEquals(expected,actual);
   }
   @Test
   void cannotTeachCourse() {
      TeacherImplementation teacherImplementation = new TeacherImplementation();
      String expected = teachers.getFirstName() + " " + teachers.getLastName() + " can not teach " + courseName1.getCourseName();
      String actual = teacherImplementation.teachCourse("Mathematics", school);
      assertEquals(expected,actual);
   }
}