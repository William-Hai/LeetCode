package LeetCode_004;

public class Main {
    public static void main(String[] args){
        int[] num1 = { 1, 3 };
        int[] num2 = { 2 };

        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(num1, num2);
        System.out.println(result);
    }
}
