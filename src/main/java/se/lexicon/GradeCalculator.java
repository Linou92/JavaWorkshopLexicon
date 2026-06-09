package se.lexicon;

import java.util.Scanner;

public class GradeCalculator {
    public static void printGradeCalculator(){
        Scanner scanner = new Scanner(System.in);

        IO.print("Enter score: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            IO.println("Error: score must be between 0 and 100.");
        } else if (score >= 90) {
            IO.println("Grade: A");
        } else if (score >= 80) {
            IO.println("Grade: B");
        } else if (score >= 70) {
            IO.println("Grade: C");
        } else if (score >= 60) {
            IO.println("Grade: D");
        } else {
            IO.println("Grade: F");
        }
    }
}
