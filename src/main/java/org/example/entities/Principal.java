package org.example.entities;

public class Principal extends Staffs{

    private Students students;
    private Applicants applicants;

    public Principal(String firstName, String lastName, int age, boolean ispresent, Students students, Applicants applicants) {
        super(firstName, lastName, age, ispresent);
        this.students = students;
        this.applicants = applicants;
    }

    public Principal() {

    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Applicants getApplicants() {
        return applicants;
    }

    public void setApplicants(Applicants applicants) {
        this.applicants = applicants;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "students=" + students +
                ", applicants=" + applicants +
                '}';
    }
}
