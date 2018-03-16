package LeetCode_084;

public class Main {
    public static void main(String[] args){
        int[] array = { 2, 1, 5, 6, 2, 3 };

        Solution solution = new Solution();
        int result = solution.largestRectangleArea(array);
        System.out.println(result);
    }
}
