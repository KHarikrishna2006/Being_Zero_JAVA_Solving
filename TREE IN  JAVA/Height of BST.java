    class BSTNode{
        int data;
        BSTNode left;
        BSTNode right;
        int h=0;
        public BSTNode(int d){
            this.data=d;
            this.left=null;
            this.right=null;
            h=0;
        }
    }
class BeingZero {
    public BSTNode insBST(BSTNode r,int x){
        if(r==null) return new BSTNode(x);
        if(x<r.data) r.left=insBST(r.left,x);
        else r.right=insBST(r.right,x);
        r.h=1+Math.max((r.left==null?0:r.left.h),(r.right==null?0:r.right.h));
        return r;
    }

    public int solve(int A[]) {
        // This is a funtion only problem
		// Do not write the input output statements
		// Implement the logic here
        BSTNode root=null;
        for(int i=0;i<A.length;i++){
            root=insBST(root,A[i]);
        }
        return root.h;
    }
    
}
