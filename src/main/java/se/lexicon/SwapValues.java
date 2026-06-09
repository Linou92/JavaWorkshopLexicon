package se.lexicon;

public class SwapValues {
    public static void printSwapValues(){
        int a = 15;
        int b = 42;
        IO.println("Before: a = " +a+ " b = " +b);
        a = a + b;
        b = a - b;
        a = a - b;
        IO.println("After: a = " +a+ " b = " +b);
    }
}
