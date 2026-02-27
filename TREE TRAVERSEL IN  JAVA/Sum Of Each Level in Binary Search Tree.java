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
	List<Integer>  solve(TreeNode r){
		List<Integer> ans = new ArrayList<>();
        if(r==null) return ans;
		Queue<TreeNode> q=new LinkedList<>();
        q.add(r);
        while(!q.isEmpty()){
            int sum=0;
            int s=q.size();
            while(s!=0){
                TreeNode k=q.remove();
                sum+=k.val;
                if(k.left!=null) q.add(k.left);
                if(k.right!=null) q.add(k.right);
                s-=1;
            }
            ans.add(sum);
        }
		return ans;
	}
}
