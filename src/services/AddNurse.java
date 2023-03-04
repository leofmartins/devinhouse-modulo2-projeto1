package services;

import model.Gender;
import model.Nurse;
import model.Patient;
import repository.NurseRepositoryImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AddNurse {
    public static void addNurse() {
        Nurse nurse = new Nurse();
        String  name,
                gender,
                cpf,
                phone,
                educationalInstitution,
                cofenRegistrationNumber;
        Date birthdate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("CADASTRO DE ENFERMEIRO(A)");
        System.out.println();

        System.out.println("Informe o nome completo do enfermeiro(a): ");
        name = scanner.nextLine();
        nurse.setName(name);

        boolean genderValidated = false;

        while (!genderValidated) {

            System.out.println("Informe o gênero (feminino, masculino ou outro): ");
            gender = scanner.nextLine().toLowerCase();

            switch (gender) {
                case "feminino" -> {
                    nurse.setGender(Gender.female);
                    genderValidated = true;
                }
                case "masculino" -> {
                    nurse.setGender(Gender.male);
                    genderValidated = true;
                }
                case "outro" -> {
                    nurse.setGender(Gender.other);
                    genderValidated = true;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }

        System.out.println("Informe a data de nascimento do enfermeiro(a): ");
        try {
            birthdate = dateFormat.parse(scanner.nextLine());
            nurse.setBirthdate(birthdate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Informe o CPF: ");
        cpf = scanner.nextLine();
        nurse.setCpf(cpf);

        System.out.println("Informe o telefone: ");
        phone = scanner.nextLine();
        nurse.setPhone(phone);

        System.out.println("Informe a Insituição de Ensino de Formação (obrigatório):");
        educationalInstitution = scanner.nextLine();
        nurse.setEducationalInstitution(educationalInstitution);

        System.out.println("Informe o cadastro do COFEN/UF:");
        cofenRegistrationNumber = scanner.nextLine();
        nurse.setCofenRegistrationNumber(cofenRegistrationNumber);

        NurseRepositoryImpl nurseRepository = new NurseRepositoryImpl();
        nurseRepository.addNurse(nurse);

        System.out.println("Enfermeiro(a) cadastrado com sucesso.");
    }
}
