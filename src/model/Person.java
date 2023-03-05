package model;

import enums.PersonType;
import services.IdGenerator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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

    public static void addPerson(Person person, SimpleDateFormat dateFormat, PersonType personType) {
        String name;
        String gender;
        Date birthdate;
        String cpf;
        String phone;
        String typeOfPerson = personType.getDescription();
        Scanner scanner = new Scanner(System.in);
        person.setId(IdGenerator.getId());

        System.out.printf("CADASTRO DE %s", typeOfPerson.toUpperCase());
        System.out.println();

        System.out.printf("Informe o nome completo do(a) %s: ", typeOfPerson);
        name = scanner.nextLine();
        person.setName(name);

        boolean genderValidated = false;

        while (!genderValidated) {

            System.out.printf("Informe o gênero do(a) %s (feminino, masculino ou outro): ", typeOfPerson);
            gender = scanner.nextLine().toLowerCase();

            switch (gender) {
                case "feminino" -> {
                    person.setGender(Gender.female);
                    genderValidated = true;
                }
                case "masculino" -> {
                    person.setGender(Gender.male);
                    genderValidated = true;
                }
                case "outro" -> {
                    person.setGender(Gender.other);
                    genderValidated = true;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }

        System.out.printf("Informe a data de nascimento do(a) %s: ", typeOfPerson);
        try {
            birthdate = dateFormat.parse(scanner.nextLine());
            person.setBirthdate(birthdate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Informe o CPF do(a) %s: ", typeOfPerson);
        cpf = scanner.nextLine();
        person.setCpf(cpf);

        System.out.printf("Informe o telefone do(a) %s: ", typeOfPerson);
        phone = scanner.nextLine();
        person.setPhone(phone);
    }

    public void setId(int id) {
        this.id = id;
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