package LeetCode_001;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        if (null == nums || nums.length < 2) {
            return null;
        }

        int[] indices = new int[2];

        boolean finded = false;
        for(int i = 0; i < nums.length - 1 && !finded; i++){
            indices[0] = i;
            for(int j = i + 1; j < nums.length; j++){
                if (nums[j] + nums[indices[0]] == target){
                    // TODO
                    indices[1] = j;
                    finded = true;
                    break;
                }
            }
        }

        return indices;
    }
}