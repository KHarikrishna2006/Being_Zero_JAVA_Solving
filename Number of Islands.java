class Solution {
    public static void m(char[][] a,int i,int j){
        int n=a[0].length;
        int m=a.length;
        if(i>=m || i<0 || j>=n || j<0 || a[i][j]=='0') return;
        a[i][j]='0';
       m(a,i-1,j);
        m(a,i+1,j);
        m(a,i,j-1);
         m(a,i,j+1);
    }
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c++;
                    m(grid,i,j);
                }
            }
        }
        return c;
    }
}
