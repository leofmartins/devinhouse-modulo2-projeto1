package services;

public class IdGenerator {
    private static int id = 1;

    public static int getId() {
        return id++;
    }
}
