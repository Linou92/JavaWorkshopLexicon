package se.lexicon;

import java.util.Scanner;

public class RunningTotal {
    public static void printRunningTotal(){
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int number;
        do{
            IO.println("Enter a number (0 to stop): ");
            number = scanner.nextInt();
            if(number != 0){
                total += number;
                count++;
                IO.println("Total: " + total + " | Count: " + count);
            }
        } while (number != 0);
        double average = 0;
        if(count > 0){
            average = (double) total / count;
        }
        IO.println("--- Summary ---\n"+
                "Count : " + count + "\n" +
                "Total: " + total + "\n" +
                "Average: " + average);
    }
}
