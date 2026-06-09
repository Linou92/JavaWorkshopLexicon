package se.lexicon;

import java.util.Scanner;

public class ArithmeticUserInput {
    public static void printArithmeticUserInput() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter first number: ");
        int number1 = scanner.nextInt();
        IO.println("Enter second number: ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        int rest = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        IO.println(number1 + " + " + number2 + " = " +sum+"\n"+
                number1 + " - " + number2 + " = " +rest+"\n"+
                number1 + " * " + number2 + " = " +multiplication+"\n"+
                number1 + " / " + number2 + " = " +division);
    }
}
