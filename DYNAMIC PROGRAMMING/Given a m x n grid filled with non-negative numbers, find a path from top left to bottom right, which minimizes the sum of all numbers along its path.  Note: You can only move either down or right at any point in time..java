class BeingZero {
    public int solve(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
            for(int j=1;j<n;j++){
                mat[0][j]+=mat[0][j-1];
            }
            for(int j=1;j<m;j++){
                mat[j][0]+=mat[j-1][0];
            }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int m1=Math.min(mat[i][j-1],mat[i-1][j]);
                int m2=Math.min(m1,mat[i-1][j-1]);
                mat[i][j]+=m2;
            }
        }
        return mat[m-1][n-1];
    }
}

