package se.lexicon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodayCalendar {
    public static void printTodayCalendar() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        IO.println("Today is: " + today.format(formatter));
        DayOfWeek day = today.getDayOfWeek();
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            IO.println("It is a Weekend.");
        } else {
            IO.println("It is a Weekday.");
        }
    }
}
