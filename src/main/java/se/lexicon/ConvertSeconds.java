package se.lexicon;

import java.util.Scanner;

public class ConvertSeconds {
    public static void printConvertSeconds(){
        Scanner scanner = new Scanner(System.in);

        IO.println("Enter seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        IO.println(String.format("%02d:%02d:%02d%n", hours, minutes, seconds));
    }
}
