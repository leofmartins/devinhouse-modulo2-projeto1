package services;

import enums.MedicalCareStatus;
import model.Patient;
import repository.PatientRepositoryImpl;

import java.util.Scanner;

public class UpdateMedicalCareStatus {
    public static void updateMedicalCareStatus() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ATUALIZAÇÃO DE STATUS DE ATENDIMENTO");
        System.out.print("Informo o id do paciente: ");
        int patientId = scanner.nextInt();
        PatientRepositoryImpl patientStatusUpdating = new PatientRepositoryImpl();
        Patient patient = patientStatusUpdating.getPatientList(patientId);
        String medicalCareStatusBeforeUpdate = patient.getMedicalCareStatus().getDescription();

        boolean medicalCareStautusValidated = false;

        while (!medicalCareStautusValidated) {
            System.out.println("Selecione uma das opções abaixo para o status do atendimento:");
            System.out.println("1. Aguardando atendimento");
            System.out.println("2. Em atendimento");
            System.out.println("3. Atendido");
            System.out.print("4. Não atendido: ");

            int medicalCareStatusOtion = scanner.nextInt();

            medicalCareStautusValidated = isMedicalCareStautusValidated(
                    patient,
                    false,
                    medicalCareStatusOtion);
        }

        System.out.printf("Status do paciente %s atualizado com sucesso.", patient.getName());
        System.out.println();
        System.out.println("Status anterior: " + medicalCareStatusBeforeUpdate);
        System.out.println("Status atual: " + patient.getMedicalCareStatus().getDescription());
    }

    static boolean isMedicalCareStautusValidated(
            Patient patient,
            boolean medicalCareStautusValidated,
            int medicalCareStatusOtion) {
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
            default -> System.out.print("Opção inválida. Tente novamente: ");
        }
        return medicalCareStautusValidated;
    }
}