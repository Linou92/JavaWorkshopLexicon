package se.lexicon;

import java.util.Scanner;

public class MultiplicationTable {
    public static void printMultiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            IO.println(number + " x " + i + " = " + (number * i));
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            IO.println();
        }
    }
}
