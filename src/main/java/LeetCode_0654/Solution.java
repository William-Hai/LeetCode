package LeetCode_0654;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-05 10:18
 * Last Modify: 2019-07-05
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {

    private TreeNode root = null;

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        dfs(nums);
        return root;
    }

    private void dfs(int[] nums) {
        int begin = 0, end = nums.length;

        int maxIndex = begin;
        int max = nums[maxIndex];
        for (int i = begin; i < end; i++) {
            if (nums[i] > max) {
                maxIndex = i;
                max = nums[i];
            }
        }

        root = new TreeNode(max);

        dfs(nums, begin, maxIndex, root, true);
        dfs(nums, maxIndex + 1, end, root, false);
    }

    private void dfs(int[] nums, int begin, int end, TreeNode parent, boolean left) {
        if (begin >= end)
            return;

        int maxIndex = begin;
        int max = nums[maxIndex];
        for (int i = begin; i < end; i++) {
            if (nums[i] > max) {
                maxIndex = i;
                max = nums[i];
            }
        }

        if (left) {
            parent.left = new TreeNode(max);
            dfs(nums, begin, maxIndex, parent.left, true);
            dfs(nums, maxIndex + 1, end, parent.left, false);
        } else {
            parent.right = new TreeNode(max);
            dfs(nums, begin, maxIndex, parent.right, true);
            dfs(nums, maxIndex + 1, end, parent.right, false);
        }
    }
}