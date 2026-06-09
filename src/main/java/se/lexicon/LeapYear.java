package se.lexicon;

import java.util.Scanner;

public class LeapYear {
    public static void printLeapYear() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            IO.println(year + " is a leap year.");
        } else {
            IO.println(year + " is NOT a leap year.");
        }
    }
}
