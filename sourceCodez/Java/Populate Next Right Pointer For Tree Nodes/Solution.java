import java.util.*;
import crio.ds.Tree.TreeNode;

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
    public TreeNode populatingNextRightPointersInEachNode(TreeNode root) {

        List<TreeNode> queue = new ArrayList<>();

        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {

            TreeNode node = queue.remove(0);

            if (node != null) {

                node.next = queue.get(0);

                if (node.left != null) {

                    queue.add(node.left);
                }

                if (node.right != null) {

                    queue.add(node.right);
                }
            }

            else if (!queue.isEmpty()) {

                queue.add(null);
            }
        }

        return root;
    }
}
