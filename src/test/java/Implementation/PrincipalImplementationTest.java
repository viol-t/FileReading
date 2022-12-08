package Implementation;

import org.example.Services.Implementation.PrincipalImplementation;
import org.example.entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalImplementationTest {

    Students students;

    Students students1;
    Courses courseName;
    School school;
    School school1;
    Principal principal;
    Teachers teachers;
    Classes classes;
    Applicants applicants;
    Applicants applicants1;

    @BeforeEach
    void setUp() {
        courseName = new Courses();
        courseName.setCourseName("home economics");

        students = new Students();
        students.setFirstName("Ada");
        students.setLastName("mazi");
        students.setAge(12);
        students.setCourses(courseName.getCourseName());
        students.setType("bad");



        applicants = new Applicants();
        applicants.setFirstName("james");
        applicants.setLastName("obi");
        applicants.setAge(13);

        applicants1 = new Applicants();
        applicants1.setFirstName("james");
        applicants1.setLastName("obi");
        applicants1.setAge(20);


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
        school1 = new School("Brilliant schools", teachers, students1, classes, courseName.getCourseName(), principal, applicants1);
    }

    @Test
    void principalAdmits() {
        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        String expected = applicants.getFirstName() + " " + applicants.getLastName() + " " + " was admitted";
        String actual = principalImplementation.principalAdmits(school);
        assertEquals(expected,actual);
    }
    @Test
    void principalcannotAdmits() {
        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        String expected = applicants1.getFirstName() + " " + applicants1.getLastName() + " " + " was not admitted";
        String actual = principalImplementation.principalAdmits(school1);
        assertEquals(expected,actual);

    }


    @Test
    void principalExpels() {
        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        String expected = students.getFirstName() + " " + students.getLastName() + " has been expelled";
        String actual = principalImplementation.principalExpels(students.getType(), school, students);
        assertEquals(expected,actual);
    }

    @Test

    void principalCannotExpels() {
        students.setType("good");
        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        String expected = students.getFirstName() + " " + students.getLastName() + " was not expelled";
        String actual = principalImplementation.principalExpels(students.getType(), school, students);
        assertEquals(expected,actual);
    }
}