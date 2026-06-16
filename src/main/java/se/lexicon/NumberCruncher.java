package se.lexicon;

import java.util.Scanner;

public class NumberCruncher {
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    public static void printNumberCruncher() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter first number : ");
        int num1 = scanner.nextInt();
        IO.println("Enter second number: ");
        int num2 = scanner.nextInt();
        IO.println("Enter third number : ");
        int num3 = scanner.nextInt();
        IO.println("Maximum : " + findMax(num1, num2, num3) + "\n" +
                "Minimum : " + findMin(num1, num2, num3));
        System.out.printf("Average : %.2f%n", average(num1, num2, num3));
    }
}
