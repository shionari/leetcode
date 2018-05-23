package algorithm.simple.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 * Created by shionari on 2018/5/23
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();

        if (root != null) {
            list.add(root.val);
            list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal(root.right));
        }

        return list;
    }
}
