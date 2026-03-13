class BeingZero {
    long[] a=new long[1000001];
    BeingZero(){
        long m=1000000007;
        a[0]=1;
        a[1]=0;
        a[2]=1;
        a[3]=1;
        a[4]=1;
        a[5]=2;
        a[6]=2;
        for(int i=7;i<1000001;i++){
            a[i]=((a[i-2]%m)+(a[i-3]%m))%m;
        }
    }
    public long solve(int n) {
        return a[n];
    }
}


