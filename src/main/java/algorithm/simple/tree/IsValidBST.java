package algorithm.simple.tree;

/**
 *
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * Created by shionari on 2018/5/18
 */
public class IsValidBST {

    public static void main(String[] args) {
        IsValidBST isValidBST = new IsValidBST();
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(20);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        System.out.println(isValidBST.isValidBST(node1));
    }

    private boolean isFirst = true;

    private int lastNodeVal = -1;

    public boolean isValidBST(TreeNode root) {
        boolean isValidBST = true;
        if (root == null) {
            return isValidBST;
        }
        isValidBST = isValidBST && isValidBST(root.left);
        isValidBST = isValidBST && check(root.val);
        isValidBST = isValidBST && isValidBST(root.right);
        return isValidBST;
    }

    private boolean check(int val) {
        if (isFirst) {
            lastNodeVal = val;
            isFirst = false;
            return true;
        } else if (lastNodeVal < val) {
            lastNodeVal = val;
            return true;
        } else {
            return false;
        }
    }
}
