class BeingZero {
        int[] a=new int[1000001];
        BeingZero(){
            int m=1000000007;
            a[0]=1;
            a[1]=2;
            a[2]=5;
            a[3]=12;
            a[4]=29;
            for(int i=5;i<1000001;i++){
                a[i]=((a[i-1]*2)%m+(a[i-2])%m)%m;
            }
        }
    public int solve(int n) {
        return a[n];
    }
}
