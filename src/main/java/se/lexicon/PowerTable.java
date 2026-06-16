package se.lexicon;

import java.util.Scanner;

public class PowerTable {
    public static void printPowerTable() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a base number: ");
        double base = scanner.nextDouble();
        for (int exponent = 1; exponent <= 10; exponent++) {
            double result = Math.pow(base, exponent);
            System.out.printf("%.0f ^ %d = %.0f%n", base, exponent, result);
        }
    }
}
