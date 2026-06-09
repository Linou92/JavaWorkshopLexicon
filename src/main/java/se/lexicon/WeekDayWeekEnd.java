package se.lexicon;

import java.util.Scanner;

public class WeekDayWeekEnd {
    public static void printWeekDayWeekEnd() {
        Scanner scanner = new Scanner(System.in);

        IO.print("Enter day: ");
        String day = scanner.nextLine();
        day = day.substring(0,1).toUpperCase() + day.substring(1).toLowerCase();
        switch (day) {
            case "Saturday", "Sunday" -> IO.println("Weekend");
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
                    -> IO.println("Weekday");
            default -> IO.println("Unknown day");
        }
    }
}
