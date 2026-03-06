import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int d) {
        val = d;
        left = right = null;
    }
}

class BeingZero {
    public TreeNode searchBST(TreeNode root, int val) {
        // write your code here
        if(root==null || root.val==val) return root;
        if(val<root.val)  return searchBST(root.left,val);
        else return searchBST(root.right,val);
    }
}
