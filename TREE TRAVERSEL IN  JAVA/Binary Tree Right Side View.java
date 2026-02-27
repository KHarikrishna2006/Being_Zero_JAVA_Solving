/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> a=new ArrayList<>();
            int s=q.size();
            while(s-->0){
                TreeNode k=q.remove();
                a.add(k.val);
                if(k.left!=null) q.add(k.left);
                if(k.right!=null) q.add(k.right);
            }
            ans.add(a);
        }
        return ans;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        if(root==null) return a;
        List<List<Integer>> aa=levelOrder(root);
        for(List<Integer> i:aa){
            a.add(i.get(i.size()-1));
        }
        return a;
    }
}
