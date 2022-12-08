package org.example.Services;

import org.example.entities.School;
import org.example.entities.Students;

public interface PrincipalServices {

    String principalAdmits(School school) ;
    String principalExpels(String type, School school, Students students);
}
