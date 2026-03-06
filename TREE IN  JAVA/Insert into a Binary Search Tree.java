import java.util.*;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int d){
      	val = d;
      	left = right = null;
    }
}

class BeingZero{
    public TreeNode insertIntoBST(TreeNode root, int x) {
        // complete the function
        if(root==null) return new TreeNode(x);
        if(x<root.val) root.left=insertIntoBST(root.left,x);
        else root.right=insertIntoBST(root.right,x);
        return root;
    }
}
