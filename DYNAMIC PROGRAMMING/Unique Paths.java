class BeingZero {
    int[][] a=new int[100][100];
    BeingZero(){
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(i==0 || j==0) a[i][j]=1;
                else a[i][j]=a[i-1][j]+a[i][j-1];
            }
        }
    }
    public int solve(int m , int n) {
        
        return a[m-1][n-1];
    }
}
