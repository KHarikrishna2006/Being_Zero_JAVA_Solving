/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
import java.util.*;
class Pair{
    Node n;
    int l;
    Pair(Node n,int l){
        this.n=n;
        this.l=l;
        
    }
}
class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,ArrayList<Integer>> tm=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair k=q.remove();
            
            if(!tm.containsKey(k.l)){
                tm.put(k.l,new ArrayList<>());
            }
            tm.get(k.l).add(k.n.data);
            
            if(k.n.left!=null) q.add(new Pair(k.n.left,k.l-1));
            if(k.n.right!=null) q.add(new Pair(k.n.right,k.l+1));
        }
        for(int i:tm.keySet()){
            ans.add(tm.get(i));
        }
        return ans;
        
    }
}
