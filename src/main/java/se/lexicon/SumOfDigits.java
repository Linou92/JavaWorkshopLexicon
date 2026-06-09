package se.lexicon;

public class SumOfDigits {
    public static void sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        IO.println(sum);
    }
}
