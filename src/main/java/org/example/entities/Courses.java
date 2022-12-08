package org.example.entities;

public class Courses {

    private String courseName;

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public Courses() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
