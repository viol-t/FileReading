package org.example.entities;

public class Students extends Users{

    private String type;
    private String Courses;

    public Students(String firstName, String lastName, int age, String type, String courses) {
        super(firstName, lastName, age);
        this.type = type;
        Courses = courses;
    }

    public Students() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCourses() {
        return Courses;
    }

    public void setCourses(String courses) {
        Courses = courses;
    }

    @Override
    public String toString() {
        return "Students{" +
                "type='" + type + '\'' +
                ", Courses='" + Courses + '\'' +
                '}';
    }
}
