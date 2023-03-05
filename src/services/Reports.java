package services;

import enums.MedicalCareStatus;
import enums.MedicalSpeciality;
import model.Doctor;
import model.Nurse;
import model.Patient;
import repository.DoctorRepositoryImpl;
import repository.NurseRepositoryImpl;
import repository.PatientRepositoryImpl;
import view.HomeMenu;

import java.util.List;


import static services.ListOfOptions.*;
import static services.ReadOptionSelected.readOption;

public class Reports {
    public static void getReports() {
        System.out.println("RELATÓRIOS");
        System.out.println("Escolha qual relatório deseja:");
        showReportsOptions();
        int typeOfReportSelected = readOption(typeOfReportsLength());

        switch (typeOfReportSelected) {
            case 1 -> {
                System.out.println("Escolha qual categoria de pessoa deseja listar:");
                showTypeOfPersonOptions();
                System.out.print((typeOfPersonLength() + 1) + ". Todos: ");
                int typeOfPersonRerport = readOption(typeOfPersonLength() + 1);
                switch (typeOfPersonRerport) {
                    case 1 -> showPatientList();
                    case 2 -> showNurseList();
                    case 3 -> showDoctorList();
                    case 4 -> {
                        showPatientList();
                        showNurseList();
                        showDoctorList();
                    }
                }
            }
            case 2 -> {
                System.out.println("Escolha qual status deseja listar:");
                showMedicalCareStatusOptions();
                System.out.print((typeOfMedicalCareStatusLength() + 1) + ". Todos");
                int typeOfStatusReport = readOption(typeOfMedicalCareStatusLength() + 1);
                System.out.println("Código\tNome\tConvênio\tTotal de Atendimentos");
                switch (typeOfStatusReport) {
                    case 1 -> showPatientListFiltered(MedicalCareStatus.waiting);
                    case 2 -> showPatientListFiltered(MedicalCareStatus.inMedicalCare);
                    case 3 -> showPatientListFiltered(MedicalCareStatus.medicalCareFinalized);
                    case 4 -> showPatientListFiltered(MedicalCareStatus.notAttended);
                    case 5 -> showPatientListFiltered();
                }
            }
            case 3 -> {
                System.out.println("Escolha qual a especialidade médica deseja listar: ");
                showMedicalSpecializationOptions();
                System.out.print((typeOfMedicalSpecializationLenth() + 1) + ". Todos");
                int typeOfMedicalSpealization = readOption(typeOfMedicalSpecializationLenth() + 1);
                System.out.println("Código\tNome\tInstituição de Ensino\tCRM\tEspecialização");
                switch (typeOfMedicalSpealization) {
                    case 1 -> showDoctorListFiltered(MedicalSpeciality.generalPractitioner);
                    case 2 -> showDoctorListFiltered(MedicalSpeciality.anesthetist);
                    case 3 -> showDoctorListFiltered(MedicalSpeciality.dermatologist);
                    case 4 -> showDoctorListFiltered(MedicalSpeciality.gynecologist);
                    case 5 -> showDoctorListFiltered(MedicalSpeciality.neurologist);
                    case 6 -> showDoctorListFiltered(MedicalSpeciality.pediatrician);
                    case 7 -> showDoctorListFiltered(MedicalSpeciality.psychiatrist);
                    case 8 -> showDoctorListFiltered(MedicalSpeciality.orthopedist);
                    case 9 -> showDoctorListFiltered();
                }
            }
        }
        System.out.println();
        HomeMenu.renderHomeMenu();
    }

    private static void showPatientList() {
        System.out.println("Lista de pessoas:");
        System.out.println("Código\tNome\tCPF");
        List<Patient> patientList = PatientRepositoryImpl.getPatientList();
        for (Patient patient :
                patientList) {
            System.out.println(
                    patient.getId() +
                            "\t" +
                            patient.getName() +
                            "\t" +
                            patient.getCpf());
        }
        System.out.println();
    }

    private static void showNurseList() {
        System.out.println("Lista de enfermeiros(as):");
        System.out.println("Código\tNome\tCPF");
        List<Nurse> nurseList = NurseRepositoryImpl.getNurseList();
        for (Nurse nurse :
                nurseList) {
            System.out.println(
                    nurse.getId() +
                            "\t" +
                            nurse.getName() +
                            "\t" +
                            nurse.getCpf()
            );
        }
        System.out.println();
    }

    private static void showDoctorList() {
        System.out.println("Lista de médicos(as):");
        System.out.println("Código\tNome\tCPF");
        List<Doctor> doctorList = DoctorRepositoryImpl.getDoctorList();
        for (Doctor doctor :
                doctorList) {
            System.out.println(
                    doctor.getId() +
                            "\t" +
                            doctor.getName() +
                            "\t" +
                            doctor.getCpf()
            );
        }
        System.out.println();
    }

    private static void showPatientListFiltered(MedicalCareStatus medicalCareStatus) {
        System.out.println("Lista de pessoas:");
        System.out.println("Código\tNome\tCPF");
        List<Patient> patientList = PatientRepositoryImpl
                .getPatientList()
                .stream()
                .filter(patient -> patient.getMedicalCareStatus() == medicalCareStatus)
                .toList();
        for (Patient patient :
                patientList) {
            System.out.println(
                            patient.getId() +
                            "\t" +
                            patient.getName() +
                            "\t" +
                            patient.getHealthInsurance() +
                            "\t" +
                            patient.getTotalMedicalCare()
                    );
        }
        System.out.println();
    }

    private static void showPatientListFiltered() {
        List<Patient> patientList = PatientRepositoryImpl.getPatientList();
        for (Patient patient :
                patientList) {
            System.out.println(
                    patient.getId() +
                            "\t" +
                            patient.getName() +
                            "\t" +
                            patient.getHealthInsurance() +
                            "\t" +
                            patient.getTotalMedicalCare()
            );
        }
    }

    private static void showDoctorListFiltered (MedicalSpeciality medicalSpeciality) {
        System.out.println("Lista de pessoas:");
        System.out.println("Código\tNome\tCPF");
        List<Doctor> doctorList = DoctorRepositoryImpl
                .getDoctorList()
                .stream()
                .filter(doctor -> doctor.getMedicalSpeciality() == medicalSpeciality)
                .toList();
        for (Doctor doctor :
                doctorList) {
            System.out.println(
                    doctor.getId() +
                            "\t" +
                            doctor.getName() +
                            "\t" +
                            doctor.getHealthInsurance() +
                            "\t" +
                            doctor.getTotalMedicalCare()
            );
        }
        System.out.println();
    }

    private static void showDoctorListFiltered() {
        List<Doctor> doctorList = DoctorRepositoryImpl.getDoctorList();
        for (Doctor doctor :
                doctorList) {
            System.out.println(
                    doctor.getId() +
                            "\t" +
                            doctor.getName() +
                            "\t" +
                            doctor.getHealthInsurance() +
                            "\t" +
                            doctor.getTotalMedicalCare()
            );
        }
        System.out.println();
    }
}
