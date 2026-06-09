package se.lexicon;

public class CountVowels {
    public static int countVowels(String s){
        s = s.toLowerCase();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if("aeiou".indexOf(c) != -1){
                count++;
            }
        }
        return count;
    }
}
