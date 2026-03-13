class BeingZero {
        long[][] a=new long[2001][2001];
     BeingZero(){
        int m=1000000007;
        for(int i=0;i<2001;i++){
            for(int j=0;j<=i;j++){
                if(i==j || j==0) a[i][j]=1;
                else{
                    a[i][j]=((a[i-1][j]%m)+(a[i-1][j-1]%m))%m;
                }
            }
        }
    }
    public long solve(int n , int r) {
        //Input and output are handled complete the function and return the required answer
        return a[n][r];
    }
}
