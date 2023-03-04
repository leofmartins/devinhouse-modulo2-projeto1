package model;

import java.util.Date;

public class Nurse extends Patient {
    private String educationalInstitution;
    private String cofenRegistrationNumber;
    public Nurse() {};

    public void setEducationalInstitution(String educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
    }

    public void setCofenRegistrationNumber(String cofenRegistrationNumber) {
        this.cofenRegistrationNumber = cofenRegistrationNumber;
    }
}