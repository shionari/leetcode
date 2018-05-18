package algorithm.simple.tree;

/**
 *
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * Created by shionari on 2018/5/18
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);
        return 1 + (depthLeft > depthRight ? depthLeft : depthRight);
    }
}
