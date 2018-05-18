package algorithm.simple.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * Created by shionari on 2018/5/18
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        levelOrder(list, root, 0);
        return list;
    }

    private void levelOrder(List<List<Integer>> list, TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        List<Integer> order;
        if (depth == list.size()) {
            order = new ArrayList<Integer>();
            list.add(order);
        } else {
            order = list.get(depth);
        }
        order.add(node.val);
        TreeNode left = node.left;
        TreeNode right = node.right;
        if (left != null) {
            levelOrder(list, left, depth + 1);
        }
        if (right != null) {
            levelOrder(list, right, depth + 1);
        }
    }
}
