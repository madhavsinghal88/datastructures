package leetcode;

import java.sql.SQLOutput;

public class lc9 {
    public static void main(String[] args) {

        int x = 121;

        if (x<0){
            System.out.println("Is palindrome : false");
            return;
        }

        int original = x;
        int reversed = 0;

        while(x!=0){
            int digit = x%10;
            reversed = reversed * 10 + digit;
            x = x/10;
        }
        boolean result = original == reversed;

        System.out.println("Is Palindrome:" + result);



    }

}
