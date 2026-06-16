package se.lexicon;

import java.util.Scanner;

public class WordCounter {
    public static void printWordCounter() {
        Scanner scanner = new Scanner(System.in);

        IO.println("Enter a sentence  : ");
        String sentence = scanner.nextLine();

        IO.println("Enter word to find: ");
        String searchWord = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");
        int totalWords = words.length;
        int count = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }
        }
        IO.println("Total words : " + totalWords);
        IO.println("\"" + searchWord + "\" appears: " + count + " times");
    }
}
