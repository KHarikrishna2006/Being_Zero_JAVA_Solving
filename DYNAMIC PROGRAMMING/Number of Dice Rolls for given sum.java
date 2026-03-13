class BeingZero{
    int[] a=new int[100001];
    BeingZero(){
        int m=1000000007;
        a[0]=1;
        for(int i=1;i<100001;i++){
            for(int k=1;k<=6;k++){
                if(i-k>=0) a[i]=((a[i]%m)+(a[i-k]%m))%m;
            }
        }
    }
public int[] solve(int queries[]) {
        int ans[]=new int[queries.length];
        //complete the function
        //Treat each queries[i] as N compute and store result for each N in in ans[i], RETURN ans
        for(int i=0;i<ans.length;i++){
            ans[i]=a[queries[i]];
        }
        return ans;
    }
}
