class BeingZero {
    public int solve(int mat[][], int m, int n) {
        int ans = 0;
        //complete the function
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                if(j==0) mat[i][j]+=mat[i-1][j];
                else if(i==0) mat[i][j]+=mat[i][j-1];
                else{
                    int min=Math.min(mat[i-1][j],mat[i][j-1]);
                    mat[i][j]+=min;
                }
            }
        }
        return mat[m-1][n-1];
    }
}
