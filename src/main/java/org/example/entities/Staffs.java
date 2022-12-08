package org.example.entities;

public class Staffs extends Users{

    private boolean ispresent;

    public Staffs(String firstName, String lastName, int age, boolean ispresent) {
        super(firstName, lastName, age);
        this.ispresent = ispresent;
    }


    public Staffs() {
    }

    public boolean isIspresent() {
        return ispresent;
    }

    public void setIspresent(boolean ispresent) {
        this.ispresent = ispresent;
    }

    @Override
    public String toString() {
        return "Staffs{" +
                "ispresent=" + ispresent +
                '}';
    }
}
