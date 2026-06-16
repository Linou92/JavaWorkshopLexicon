package se.lexicon;

import java.util.Scanner;

public class EmailSlicer {
    public static void printEmailSlicer() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter email: ");
        String email = scanner.nextLine();
        int atIndex = email.indexOf('@');
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);
        IO.println("Username: " + username);
        IO.println("Domain  : " + domain);
    }
}
