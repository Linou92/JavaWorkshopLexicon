package se.lexicon;

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void printPasswordStrengthChecker(){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a password: ");
        String password = scanner.nextLine();
        boolean hasUppercase = false;
        boolean hasDigit = false;
        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                hasUppercase = true;
            }
            if(c >= '0' && c <= '9'){
                hasDigit = true;
            }
        }
        int rulesMet = 0;
        if(password.length() >= 8){
            rulesMet++;
        }
        if(hasUppercase){
            rulesMet++;
        }
        if(hasDigit){
            rulesMet++;
        }
        String rating;
        if(rulesMet == 3){
            rating = "Strong";
        }
        else if(rulesMet == 2){
            rating = "Medium";
        }
        else{
            rating = "Weak";
        }
        IO.println("Rules met: " + rulesMet + "/3");
        IO.println("Rating: " + rating);
    }
}
