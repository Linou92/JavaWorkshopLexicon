package se.lexicon;

import java.util.Scanner;

public class WordReverser {
    public static void printReversedWord() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a word: ");
        String word = scanner.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();
        IO.println("Reversed: " + reversed);
    }
}
