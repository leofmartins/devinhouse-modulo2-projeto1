package view;

import services.AddDoctor;
import services.AddNurse;
import services.AddPatient;
import services.UpdateMedicalCareStatus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeMenu {
    public static void renderHomeMenu() {
        int option;

        System.out.println("Selecione uma das opções abaixo");
        System.out.println("1. Cadastro do Paciente");
        System.out.println("2. Cadastro de Enfermeiro");
        System.out.println("3. Cadastro de Médico");
        System.out.println("4. Realização de Atendimento Médico");
        System.out.println("5. Atualização do Status de Atendimento do Paciente");
        System.out.println("6. Relatórios");
        System.out.println();
        System.out.println("Número selecionado: ");

        option = readOption();

        switch (option) {
            case 1 -> AddPatient.addPatient();
            case 2 -> AddNurse.addNurse();
            case 3 -> AddDoctor.addDoctor();
            case 5 -> UpdateMedicalCareStatus.updateMedicalCareStatus();
        }
    }

    private static int readOption() {
        int option;
        Scanner scanner = new Scanner(System.in);
        try {
            option = scanner.nextInt();
            while (option < 1 || option > 6) {
                System.out.println("Opção inválida. Tente novamente.");
                option = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Opção inválida. Tente novamente.");
            return readOption();
        }
        return option;
    }
}
