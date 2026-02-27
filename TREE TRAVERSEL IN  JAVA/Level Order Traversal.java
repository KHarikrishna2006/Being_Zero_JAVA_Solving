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
	List< List<Integer> > solve(TreeNode root){
		List< List<Integer> > ans = new ArrayList<>();
		Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> a=new ArrayList<>();
            int s=q.size();
            while(s!=0){
                TreeNode k=q.remove();
                a.add(k.val);
                if(k.left!=null) q.add(k.left);
                if(k.right!=null) q.add(k.right);
                s-=1;
            }
            ans.add(a);
        }
		return ans;
	}
}
