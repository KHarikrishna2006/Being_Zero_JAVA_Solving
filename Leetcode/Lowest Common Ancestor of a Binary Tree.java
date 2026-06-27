/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p.val==root.val || q.val==root.val) return root;
        TreeNode k=lowestCommonAncestor(root.left,p,q);
        TreeNode k1=lowestCommonAncestor(root.right,p,q);
        if(k!=null && k1!=null) return root;
        return k!=null?k:k1;
    }
}
