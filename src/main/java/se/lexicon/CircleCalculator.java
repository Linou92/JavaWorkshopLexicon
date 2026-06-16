package se.lexicon;

import java.util.Scanner;

public class CircleCalculator {
    public static void printCircleCalculator (){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Area         : %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);
    }
}
