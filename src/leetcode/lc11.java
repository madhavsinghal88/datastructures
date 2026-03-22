package leetcode;

public class lc11 {
    public static int maxArea(int[] height){

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left],height[right]);
            int area = width * h;
            maxArea = Math.max(maxArea,area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxArea;
    }
    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = maxArea(height);

        System.out.println("Maximum Water Area = " + result);
    }
}
