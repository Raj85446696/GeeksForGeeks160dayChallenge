import java.util.*;

class ReverseString{
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int left = 0 ; 
        int right = words.length-1; 
        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left ++; 
            right-- ; 

        }
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        ReverseString r = new ReverseString(); 
        String s = "The Sky is Blue";
        System.out.println(r.reverseWords(s));

    }
}