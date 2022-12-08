package org.example.entities;

public class Teachers extends Staffs{

    private String courses;

    public Teachers(String firstName, String lastName, int age, boolean ispresent, String courses) {
        super(firstName, lastName, age, ispresent);
        this.courses = courses;
    }

    public Teachers() {

    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "courses='" + courses + '\'' +
                '}';
    }
}
