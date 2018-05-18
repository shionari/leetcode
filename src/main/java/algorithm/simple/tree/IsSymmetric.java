package algorithm.simple.tree;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * Created by shionari on 2018/5/18
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        } else if (left != null && right != null && left.val == right.val) {
            // do nothing
        } else {
            return false;
        }

        TreeNode ll = left.left;
        TreeNode lr = left.right;

        TreeNode rl = right.left;
        TreeNode rr = right.right;
        return isSymmetric(ll, rr) && isSymmetric(lr, rl);
    }
}
