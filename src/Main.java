import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("Bem vindo ao sistema LABMEDICAL");
                System.out.println("Selecione uma das opções abaixo");
                System.out.println("1. Cadastro do Paciente");
                System.out.println("2. Cadastro de Enfermeiro");
                System.out.println("3. Cadastro de Médico");
                System.out.println("4. Realização de Atendimento Médico");
                System.out.println("5. Atualização do Status de Atendimento do Paciente");
                System.out.println("6. Relatórios");
                System.out.println();
                System.out.println("Número selecionado: ");
                option = scanner.nextInt();
            } while (option == 0);
        } catch (InputMismatchException e) {
            System.out.println("Opção inválida. Digite uma opção de 1 a 6.");
            scanner.nextLine();
            option = scanner.nextInt();
        }
        System.out.println(option);
    }
}
