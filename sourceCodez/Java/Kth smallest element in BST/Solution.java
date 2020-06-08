import crio.ds.Tree.TreeNode;
import java.util.*;

/*
// Definition of TreeNode
public class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}
*/


public class Solution {

    public int kthSmallest(TreeNode root, int k) {

        ArrayList<TreeNode> inorder = new ArrayList<>();

        populateInorder(root, inorder);

        return (int)inorder.get(k - 1).val;
    }

    public void populateInorder(TreeNode node, ArrayList<TreeNode> inorder) {

        if (node != null) {

            populateInorder(node.left, inorder);
            inorder.add(node);
            populateInorder(node.right, inorder);
        }
    }
}
