package model;

import enums.MedicalSpeciality;

import java.util.Date;

public class Doctor extends Patient {
    String educationalInstitution;
    String crmRegistrationNumber;
    MedicalSpeciality medicalSpeciality;
    Boolean status;
    int totalMedicalCare;

    public Doctor() {};

    public void incrTotalMedicalCare() {
        this.totalMedicalCare += 1;
    }
}
