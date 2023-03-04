package model;

import java.util.Date;

public class Person {

    private int id;
    private String name;
    private Gender gender;
    private Date birthdate;
    private String cpf;
    private String phone;
    private int totalMedicalCare;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void incrTotalMedicalCare() {
        this.totalMedicalCare += 1;
    }

    public int getId() {
        return id;
    }
}