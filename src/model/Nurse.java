package model;

import java.util.Date;

class Nurse extends Person {
    private String educationalInstitution;
    private String cofenRegistrationNumber;

    public Nurse(String name,
                 Gender gender,
                 Date birthdate,
                 String cpf,
                 String phone,
                 String educationalInstitution,
                 String cofenRegistrationNumber) {
        super(name,
                gender,
                birthdate,
                cpf,
                phone);

        this.educationalInstitution = educationalInstitution;
        this.cofenRegistrationNumber = cofenRegistrationNumber;
    }
}