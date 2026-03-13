class BeingZero {
    int[] a=new int[100001];
    BeingZero(){
        int m=1000000007;
        a[0]=1;
        a[1]=2;
        for(int i=2;i<a.length;i++){
            a[i]=((a[i-1]%m)+(a[i-2]%m))%m;
        }
    }
    public int[] solve(int A[]) {
        int ans[]=new int[A.length];
        //complete the function
        //Treat each A[i] as N compute and store it in ans[i], return ans[]
        for(int i=0;i<A.length;i++){
            ans[i]=a[A[i]];
        }
        return ans;
    }
}
