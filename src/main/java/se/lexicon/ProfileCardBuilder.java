package se.lexicon;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ProfileCardBuilder {
    public static void printProfileCardBuilder(){
        Scanner scanner = new Scanner(System.in);

        IO.println("Enter name      : ");
        String name = scanner.nextLine();

        IO.println("Enter birth date: ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());

        IO.println("Enter city      : ");
        String city = scanner.nextLine();

        IO.println("Enter email     : ");
        String email = scanner.nextLine();

        LocalDate today = LocalDate.now();
        int age = Period.between(birthDate, today).getYears();

        StringBuilder profile = new StringBuilder();

        profile.append("╔══════════════════════════════╗\n" +
                       "║         Profile Card         ║\n" +
                       "╠══════════════════════════════╣\n" +
         String.format("║ Name  : %-20s ║%n", name) +
         String.format("║ Age   : %-20d ║%n", age) +
         String.format("║ City  : %-20s ║%n", city) +
         String.format("║ Email : %-20s ║%n", email) +
                       "╚══════════════════════════════╝");

        IO.println();
        IO.println(profile);
    }
}
