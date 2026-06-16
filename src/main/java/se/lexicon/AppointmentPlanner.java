package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AppointmentPlanner {
    String name;
    LocalDateTime dateTime;

    AppointmentPlanner(String name, LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public static void printAppointmentPlanner() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<AppointmentPlanner> appointments = new ArrayList<>();

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("eeee, dd MMMM yyyy 'at' HH:mm");

        for (int i = 1; i <= 3; i++) {
            IO.println("Enter appointment " + i + " name: ");
            String name = scanner.nextLine();

            IO.println("Enter appointment " + i + " date-time (yyyy-MM-dd HH:mm): ");
            String dateInput = scanner.nextLine();

            LocalDateTime dateTime = LocalDateTime.parse(dateInput, inputFormat);
            appointments.add(new AppointmentPlanner(name, dateTime));
        }

        appointments.sort(Comparator.comparing(a -> a.dateTime));

        IO.println("\n--- Your Schedule ---");

        for (int i = 0; i < appointments.size(); i++) {
            AppointmentPlanner a = appointments.get(i);

            System.out.printf("%d. %-12s – %s%n",
                    i + 1,
                    a.name,
                    a.dateTime.format(outputFormat));
        }
    }
}
