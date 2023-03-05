package services;

import enums.PersonType;
import model.Patient;
import model.Person;
import repository.PatientRepositoryImpl;
import view.HomeMenu;

import java.util.Scanner;

import static services.ListOfOptions.*;
import static services.ReadOptionSelected.readOption;

public class AddPatient {

    public static void addPatient() {
        Patient patient = new Patient();
        String  emergencyContact,
                allergyList,
                specialCares,
                healthInsurance,
                healthInsuranceNumber;
        int medicalCareStatusOtion;

        Person.addPerson(patient, PersonType.patient);

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Informe um contato de emergência (obrigatório): ");
            emergencyContact = scanner.nextLine();
        } while (emergencyContact.isEmpty());

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
        patient.setHealthInsuranceExpirationDate(ReadDate.readDate());

        boolean medicalCareStautusValidated = false;

        while (!medicalCareStautusValidated) {
            System.out.println("Selecione uma das opções abaixo para o status do atendimento:");
            showMedicalCareStatusOptions();
            medicalCareStatusOtion = readOption(typeOfMedicalCareStatusLength());

            medicalCareStautusValidated = UpdateMedicalCareStatus
                    .isMedicalCareStautusValidated(
                            patient,
                            medicalCareStatusOtion);
        }

        PatientRepositoryImpl patientRepository = new PatientRepositoryImpl();
        patientRepository.addPatient(patient);

        System.out.println("Paciente cadastrado com sucesso.");
        System.out.println();

        HomeMenu.renderHomeMenu();
    }
}