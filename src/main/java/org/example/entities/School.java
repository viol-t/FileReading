package org.example.entities;

public class School {

    private String schoolName;
    private Teachers teachers;
    private Students students;
    private Classes classes;
    private String Courses;
    private Staffs principal;
    private Applicants applicants;


    public School(String schoolName, Teachers teachers, Students students, Classes classes, String courses, Staffs principal, Applicants applicants) {
        this.schoolName = schoolName;
        this.teachers = teachers;
        this.students = students;
        this.classes = classes;
        Courses = courses;
        this.principal = principal;
        this.applicants = applicants;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public String getCourses() {
        return Courses;
    }

    public void setCourses(String courses) {
        Courses = courses;
    }

    public Staffs getPrincipal() {
        return principal;
    }

    public void setPrincipal(Staffs principal) {
        this.principal = principal;
    }

    public Applicants getApplicants() {
        return applicants;
    }

    public void setApplicants(Applicants applicants) {
        this.applicants = applicants;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
                ", classes=" + classes +
                ", Courses='" + Courses + '\'' +
                ", principal=" + principal +
                ", applicants=" + applicants +
                '}';
    }
}
