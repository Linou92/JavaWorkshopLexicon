package se.lexicon;

import java.util.Scanner;

public class PasswordGenerator {
    public static void printPasswordGenerator() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter password length: ");
        int length = scanner.nextInt();

        String characters = "abcdefghijklmnopqrstuvwxyz"
                + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            password.append(characters.charAt(index));
        }

        IO.println("Generated password: " + password);
    }
}
