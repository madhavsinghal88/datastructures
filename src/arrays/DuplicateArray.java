package arrays;

import java.util.Arrays;

public class DuplicateArray {

    public static int[] duplicatearray(int[] arr) {
        if (arr.length == 0)
            return new int[0];

        int n = arr.length;
        int[] temp = new int[n];

        int j = 0;
        temp[j] = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] != temp[j]) {
                j++;
                temp[j] = arr[i];
            }
        }

        return Arrays.copyOf(temp, j + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};

        int[] result = duplicatearray(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("After Removing Duplicates: " + Arrays.toString(result));
    }
}
