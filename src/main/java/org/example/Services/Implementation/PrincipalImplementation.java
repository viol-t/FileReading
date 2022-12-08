package org.example.Services.Implementation;

import org.example.Services.PrincipalServices;
import org.example.entities.Applicants;
import org.example.entities.School;
import org.example.entities.Students;

public class PrincipalImplementation implements PrincipalServices {

    public String principalAdmits(School school) {
        Applicants applicants = school.getApplicants();
        if (applicants.getAge() < 10 || applicants.getAge() > 18) {
            return applicants.getFirstName() + " " + applicants.getLastName() + " " + " was not admitted";
        } else {
            return applicants.getFirstName() + " " + applicants.getLastName() + " " + " was admitted";
        }

    }

    public String principalExpels(String type, School school, Students students) {

            if (school.getStudents().getType().equals("bad")) {
                return students.getFirstName() + " " + students.getLastName() + " has been expelled";
            }

     else{   return students.getFirstName() + " " + students.getLastName() + " was not expelled";}
    }
}
