package se.lexicon;

public class FizzBuzz {
    public static void printFizzBuzz(){
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                IO.println("FizzBuzz");
            } else if (i % 3 == 0) {
                IO.println("Fizz");
            } else if (i % 5 == 0) {
                IO.println("Buzz");
            } else {
                IO.println(i);
            }
        }
    }
}
