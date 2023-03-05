package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReadDate {
    public static Date readDate() {
        Scanner scanner = new Scanner(System.in);
        String input;
        Date date;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        input = scanner.nextLine();

        if (!input.isEmpty()) {
            try {
                date = dateFormat.parse(input);
                return date;
            } catch (ParseException e) {
                System.out.print("Data inválida. Tente novamente. ");
                readDate();
            }
        }
        return null;
    }
}
