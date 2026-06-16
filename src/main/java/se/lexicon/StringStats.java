package se.lexicon;

import java.util.Scanner;

public class StringStats {
    public static void printStringStats() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);

                if (lower == 'a' || lower == 'e' || lower == 'i' ||
                        lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        IO.println("Vowels    : " + vowels + "\n" +
                "Consonants: " + consonants + "\n" +
                "Digits    : " + digits + "\n" +
                "Spaces    : " + spaces);
    }
}
