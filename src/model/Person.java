package model;

import java.util.Date;

class Person {
    private String name;
    private Gender gender;
    private Date birthdate;
    private String cpf;
    private String phone;

    public Person(String name,
                  Gender gender,
                  Date birthdate,
                  String cpf,
                  String phone) {
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.cpf = cpf;
        this.phone = phone;
    }

    public Person() {

    }
}