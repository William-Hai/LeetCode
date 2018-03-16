package LeetCode_209;

public class Main {
    public static void main(String[] args){
        int s = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };

        Solution solution = new Solution();
        int result = solution.minSubArrayLen(s, nums);
        System.out.println(result);
    }
}
