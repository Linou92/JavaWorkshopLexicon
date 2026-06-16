package se.lexicon;

import java.util.Scanner;

public class InitialsGenerator {
    public static void printInitialsGenerator(){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter full name: ");
        String fullName = scanner.nextLine().trim();
        String[] parts = fullName.split("\\s+");
        IO.println("Initials: ");
        for (String part : parts) {
            IO.print(Character.toUpperCase(part.charAt(0)) + ".");
        }
        IO.println();
    }
}
