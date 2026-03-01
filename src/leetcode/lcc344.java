package leetcode;
import java.util.Arrays;

public class lcc344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {

        lcc344 solution = new lcc344();

        char[] input = {'h', 'e', 'l', 'l', 'o'};

        solution.reverseString(input);

        System.out.println(Arrays.toString(input));
    }
}
