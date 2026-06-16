package se.lexicon;

import java.util.Random;
import java.util.Scanner;

public class DiceStatistics {
    public static void printDiceStatistics(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        IO.println("How many rolls? ");
        int rolls = scanner.nextInt();

        int doubles = 0;

        for (int i = 1; i <= rolls; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;

            int total = die1 + die2;

            if (die1 == die2) {
                doubles++;
                IO.println("Roll " + i + ": " + die1 + " + " + die2
                        + " = " + total + "  DOUBLE!");
            } else {
                IO.println("Roll " + i + ": " + die1 + " + " + die2
                        + " = " + total);
            }
        }
        IO.println("Doubles rolled: " + doubles + " out of " + rolls);
    }
}
