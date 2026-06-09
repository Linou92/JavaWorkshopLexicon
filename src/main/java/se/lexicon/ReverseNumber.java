package se.lexicon;

import java.util.Scanner;

public class ReverseNumber {
    public static void printReverseNumber(){
        Scanner scanner = new Scanner(System.in);
        IO.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        IO.println("Reversed: " + reversed);
    }
}
