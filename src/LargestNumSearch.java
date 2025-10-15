import java.util.*;

public class LargestNumSearch {
    public static int getLargestNumSearch(int[] numbers){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];

            }
        }
        return largest;
    }
    public static void main(String[] args){
        int[] numbers = {3,64,78,23,12,97};
        System.out.println("largest value is :" + getLargestNumSearch(numbers));
    }


}
