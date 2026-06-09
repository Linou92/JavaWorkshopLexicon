package se.lexicon;

import java.util.Scanner;

public class AverageThreeNumbers {
    public static void printAverageThreeNumbers(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            IO.println("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }
        double average = (double) sum /3;
        IO.println("Average : " + average);
    }
}
