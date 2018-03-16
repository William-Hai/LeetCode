package LeetCode_001;

public class Main {
    public static void main(String[] args){

        int[] indices = new Solution().twoSum(new int[]{2, 7, 11, 15}, 18);
        System.out.println(String.format("[%d, %d]", indices[0], indices[1]));
    }
}
