package se.lexicon;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EventCountdown {
    public static void printEventCountdown() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter event name: ");
        String eventName = scanner.nextLine();
        IO.println("Enter event date (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine();

        LocalDate eventDate = LocalDate.parse(dateInput);
        LocalDate today = LocalDate.now();

        long days = ChronoUnit.DAYS.between(today, eventDate);

        if (days > 0) {
            IO.println(eventName + " is in " + days + " days!");
        } else if (days < 0) {
            IO.println(eventName + " was " + Math.abs(days) + " days ago.");
        } else {
            IO.println(eventName + " is today!");
        }
    }
}
