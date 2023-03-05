package services;

import static services.ListOfOptions.*;
import static services.ReadOptionSelected.readOption;

public class Reports {
    static void getReports() {
        System.out.println("RELATÓRIOS");
        System.out.println("Escolha qual relatório deseja:");
        showReportsOptions();

        int typeOfReportSelected = readOption(typeOfReportsLength());

        switch (typeOfReportSelected) {
            case 1 -> {
                System.out.print("Escolha qual categoria de pessoa deseja listar:");
                showTypeOfPersonOptions();
                System.out.println("Todos: ");
                int typeOfPersonRerport = readOption(typeOfPersonLength() + 1);
                switch (typeOfPersonRerport) {
                    case 1 -> {}
                    case 2 -> {}
                    case 3 -> {}
                    case 4 -> {}
                }

            }
            case 2 -> {
                System.out.println("Escolha qual status deseja listar:");
                showMedicalCareStatusOptions();
                System.out.print("Todos: ");
                int typeOfStatusReport = readOption(typeOfMedicalCareStatusLength() + 1);
                switch (typeOfStatusReport) {
                    case 1 -> {}
                    case 2 -> {}
                    case 3 -> {}
                    case 4 -> {}
                    case 5 -> {}
                }
            }
            case 3 -> {
                System.out.print("Escolha qual a especialidade médica deseja listar: ");
                showMedicalSpecializationOptions();
                int typeOfMedicalSpealization = readOption(typeOfMedicalSpecializationLenth() + 1);
                switch (typeOfMedicalSpealization) {
                    case 1 -> {}
                    case 2 -> {}
                    case 3 -> {}
                    case 4 -> {}
                    case 5 -> {}
                    case 6 -> {}
                    case 7 -> {}
                    case 8 -> {}
                    case 9 -> {}
                }
            }
        }
    }
}
