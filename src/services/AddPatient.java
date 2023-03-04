package services;

import enums.MedicalCareStatus;
import model.Gender;
import model.Patient;
import repository.PatientRepositoryImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AddPatient {
    public static void addPatient() {
        Patient patient = new Patient();
        String  name,
                gender,
                phone,
                emergencyContact,
                allergyList,
                specialCares,
                healthInsurance,
                cpf,
                healthInsuranceNumber;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;
        Date    healthInsuranceExpirationDate,
                birthdate;
        int medicalCareStatusOtion;

        Scanner scanner = new Scanner(System.in);
        System.out.println("CADASTRO DE PACIENTE");
        System.out.println();

        System.out.println("Informe o nome completo do paciente: ");
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

        System.out.println("Informe a data de nascimento do paciente: ");
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

        System.out.println("Informe um contato de emergência (obrigatório): ");
        emergencyContact = scanner.nextLine();
        patient.setEmergencyContact(emergencyContact);

        System.out.println("Informe as alergias (a cada uma, pressione Enter ou pressione Enter para pular): ");
        allergyList = scanner.nextLine();
        patient.setAllergyList(allergyList);

        System.out.println("Informe os cuidados específicos (a cada uma, pressione Enter ou pressione Enter para pular): ");
        specialCares = scanner.nextLine();
        patient.setSpecialCares(specialCares);

        System.out.println("Informe o convênio (Enter para pular): ");
        healthInsurance = scanner.nextLine();
        patient.setHealthInsurance(healthInsurance);

        System.out.println("Informe o número do convênio (Enter para pular): ");
        healthInsuranceNumber = scanner.nextLine();
        patient.setHealthInsuranceNumber(healthInsuranceNumber);

        System.out.println("Informe a validade do convênio (Enter para pular): ");
        try {
            healthInsuranceExpirationDate = dateFormat.parse(scanner.nextLine());
            patient.setHealthInsuranceExpirationDate(healthInsuranceExpirationDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        boolean medicalCareStautusValidated = false;

        while (!medicalCareStautusValidated) {
            System.out.println("Selecione uma das opções abaixo para o status do atendimento:");
            System.out.println("1. Aguardando atendimento");
            System.out.println("2. Em atendimento");
            System.out.println("3. Atendido");
            System.out.println("4. Não atendido");

            medicalCareStatusOtion = scanner.nextInt();

            switch (medicalCareStatusOtion) {
                case 1 -> {
                    patient.setMedicalCareStatus(MedicalCareStatus.waiting);
                    medicalCareStautusValidated = true;
                }
                case 2 -> {
                    patient.setMedicalCareStatus(MedicalCareStatus.inMedicalCare);
                    medicalCareStautusValidated = true;
                }
                case 3 -> {
                    patient.setMedicalCareStatus(MedicalCareStatus.medicalCareFinalized);
                    medicalCareStautusValidated = true;
                }
                case 4 -> {
                    patient.setMedicalCareStatus(MedicalCareStatus.notAttended);
                    medicalCareStautusValidated = true;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

        PatientRepositoryImpl patientRepository = new PatientRepositoryImpl();
        patientRepository.addPatient(patient);

        System.out.println("Paciente cadastrado com sucesso.");

        System.out.println();

    }
}