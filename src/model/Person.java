package model;

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

    public static void addPerson(Patient patient, SimpleDateFormat dateFormat) {
        String name;
        String gender;
        Date birthdate;
        String cpf;
        String phone;
        Scanner scanner = new Scanner(System.in);
        System.out.println("CADASTRO");
        System.out.println();

        System.out.println("Informe o nome completo: ");
        name = scanner.nextLine();
        patient.setName(name);

        boolean genderValidated = false;

        while (!genderValidated) {

            System.out.println("Informe o gênero (feminino, masculino ou outro): ");
            gender = scanner.nextLine().toLowerCase();

            switch (gender) {
                case "feminino" -> {
                    patient.setGender(Gender.female);
                    genderValidated = true;
                }
                case "masculino" -> {
                    patient.setGender(Gender.male);
                    genderValidated = true;
                }
                case "outro" -> {
                    patient.setGender(Gender.other);
                    genderValidated = true;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }

        System.out.println("Informe a data de nascimento: ");
        try {
            birthdate = dateFormat.parse(scanner.nextLine());
            patient.setBirthdate(birthdate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Informe o CPF: ");
        cpf = scanner.nextLine();
        patient.setCpf(cpf);

        System.out.println("Informe o telefone: ");
        phone = scanner.nextLine();
        patient.setPhone(phone);
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