import java.util.*;
import java.io.*;

class Main {
    static int r,c;
    static int[][] ma;//=new int[r][c];
    static int k=1;
    public static void dfs(int si,int sj){
        if(si<0 || si>=r || sj<0 || sj>=c) return;
        if(ma[si][sj]!=0) return;
        ma[si][sj]=k++;
        dfs(si-1,sj);
        dfs(si-1,sj+1);
        dfs(si,sj+1);
        dfs(si+1,sj+1);
        dfs(si+1,sj);
        dfs(si+1,sj-1);
        dfs(si,sj-1);
        dfs(si-1,sj-1);
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            r=sc.nextInt();
            c=sc.nextInt();
            ma=new int[r][c];
            int si=sc.nextInt();
            int sj=sc.nextInt();
            k=1;
            dfs(si,sj);
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(ma[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
