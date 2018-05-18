package algorithm.simple.tree;

/**
 *
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * Created by shionari on 2018/5/18
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int target = (start + end + 1) / 2;
        int val = nums[target];
        TreeNode node = new TreeNode(val);

        TreeNode left = sortedArrayToBST(nums, start, target - 1);
        TreeNode right = sortedArrayToBST(nums, target + 1, end);
        node.left = left;
        node.right = right;
        return node;
    }
}
