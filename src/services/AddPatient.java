package services;

import enums.PersonType;
import model.Patient;
import model.Person;
import repository.PatientRepositoryImpl;
import view.HomeMenu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AddPatient {

    public static void addPatient() {
        Patient patient = new Patient();
        String  emergencyContact,
                allergyList,
                specialCares,
                healthInsurance,
                healthInsuranceNumber;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;
        Date healthInsuranceExpirationDate;
        int medicalCareStatusOtion;

        Person.addPerson(patient, dateFormat, PersonType.patient);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um contato de emergência (obrigatório): ");
        emergencyContact = scanner.nextLine();
        patient.setEmergencyContact(emergencyContact);

        System.out.print("Informe as alergias (a cada uma, pressione Enter ou pressione Enter para pular): ");
        allergyList = scanner.nextLine();
        patient.setAllergyList(allergyList);

        System.out.print("Informe os cuidados específicos (a cada uma, pressione Enter ou pressione Enter para pular): ");
        specialCares = scanner.nextLine();
        patient.setSpecialCares(specialCares);

        System.out.print("Informe o convênio (Enter para pular): ");
        healthInsurance = scanner.nextLine();
        patient.setHealthInsurance(healthInsurance);

        System.out.print("Informe o número do convênio (Enter para pular): ");
        healthInsuranceNumber = scanner.nextLine();
        patient.setHealthInsuranceNumber(healthInsuranceNumber);

        System.out.print("Informe a validade do convênio (Enter para pular): ");
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
            System.out.print("4. Não atendido: ");

            medicalCareStatusOtion = scanner.nextInt();

            medicalCareStautusValidated = UpdateMedicalCareStatus
                    .isMedicalCareStautusValidated(
                            patient,
                            medicalCareStautusValidated,
                            medicalCareStatusOtion);
        }

        PatientRepositoryImpl patientRepository = new PatientRepositoryImpl();
        patientRepository.addPatient(patient);

        System.out.println("Paciente cadastrado com sucesso.");
        System.out.println();

        HomeMenu.renderHomeMenu();

    }
}