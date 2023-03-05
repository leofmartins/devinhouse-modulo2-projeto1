package model;

import enums.PersonType;
import services.IdGenerator;
import services.ReadDate;

import java.util.Date;
import java.util.Scanner;

public class Person {

    private int id;
    private String name;
    private String cpf;
    private int totalMedicalCare;

    public Person() {

    }

    public static void addPerson(Person person, PersonType personType) {
        String name;
        String gender;
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
        person.setBirthdate(ReadDate.readDate());

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

    public void setGender(Gender gender) {
    }

    public void setBirthdate(Date birthdate) {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPhone(String phone) {
    }

    public void incrTotalMedicalCare() {
        this.totalMedicalCare += 1;
    }

    public int getId() {
        return id;
    }
}