package se.lexicon;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator {
    public static void printAgeCalculator() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter birth year : ");
        int year = scanner.nextInt();
        IO.println("Enter birth month : ");
        int month = scanner.nextInt();
        IO.println("Enter birth day : ");
        int day = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        LocalDate nextBirthday = LocalDate.of(
                today.getYear(),
                month,
                day
        );

        // If birthday has already happened this year, use next year
        if (!nextBirthday.isAfter(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

        IO.println("Your age : " + age.getYears() + " years\n" + "Days until birthday : " + daysUntilBirthday);
    }
}
