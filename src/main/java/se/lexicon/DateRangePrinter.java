package se.lexicon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateRangePrinter {
    public static void printDateRangePrinter(){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter start date (yyyy-MM-dd): ");
        LocalDate startDate = LocalDate.parse(scanner.nextLine());
        IO.println("Enter end date   (yyyy-MM-dd): ");
        LocalDate endDate = LocalDate.parse(scanner.nextLine());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy (eeee)");

        LocalDate current = startDate;

        while (!current.isAfter(endDate)) {
            IO.println(current.format(formatter));
            current = current.plusDays(1);
        }
    }
}
