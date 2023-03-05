package services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadOptionSelected {
    static int readOption(int maxOptionsAvailable) {
        Scanner scanner = new Scanner(System.in);
        int optionSelected = scanner.nextInt();
        try {
            while (optionSelected < 1 || optionSelected > maxOptionsAvailable) {
                System.out.print("Opção inválida. Tente novamente. ");
                optionSelected = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.print("Opção inválida. Tente novamente. ");
            readOption(maxOptionsAvailable);
        }
        return optionSelected;
    }
}
