package se.lexicon;

import java.util.Scanner;

public class RightTriangleChecker {
    public static void printRightTriangleChecker() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter side a: ");
        double a = scanner.nextDouble();
        IO.println("Enter side b: ");
        double b = scanner.nextDouble();
        IO.println("Enter side c: ");
        double c = scanner.nextDouble();
        double longest = Math.max(a, Math.max(b, c));
        double x, y;
        if (longest == a) {
            x = b;
            y = c;
        } else if (longest == b) {
            x = a;
            y = c;
        } else {
            x = a;
            y = b;
        }

        boolean isRightTriangle =
                Math.abs((x * x + y * y) - (longest * longest)) < 0.0001;

        IO.println("Longest side: " + longest);

        if (isRightTriangle) {
            IO.println("This IS a right triangle.");
        } else {
            IO.println("This is NOT a right triangle.");
        }
    }
}
