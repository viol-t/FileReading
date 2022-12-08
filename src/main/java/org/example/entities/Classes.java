package org.example.entities;

public class Classes {

    private  String className;
    private String courses;
    private Students students;
    private Teachers teachers;


    public Classes(String className, String courses, Students students, Teachers teachers) {
        this.className = className;
        this.courses = courses;
        this.students = students;
        this.teachers = teachers;
    }

    public Classes() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "className='" + className + '\'' +
                ", courses='" + courses + '\'' +
                ", students=" + students +
                ", teachers=" + teachers +
                '}';
    }
}
