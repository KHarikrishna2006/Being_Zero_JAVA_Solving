import java.util.*;
import java.io.*;
class pos{
    int si;
    int sj;
    pos(int si,int sj){
        this.si=si;
        this.sj=sj;
    }
}
class Main {
    static int r;
    static int c;
    static int k=1;
   static  int[][] ma;
    public static void bfs(int si,int sj){
    Queue<pos> q=new LinkedList<>();
        pos kk=new pos(si,sj);
        q.add(kk);
        ma[si][sj]=k++;
        int[] x={-1,-1,0,1,1,1,0,-1};
        int[] y={0,1,1,1,0,-1,-1,-1};
        while(!q.isEmpty()){
            pos p=q.remove();
            for(int d=0;d<8;d++){
                int ni=p.si+x[d];
                int nj=p.sj+y[d];
                if(!(ni<0 || ni>=r || nj<0 || nj>=c)&& 
                  ma[ni][nj]==0){
            // System.out.println("k");
                    q.add(new pos(ni,nj));
                    ma[ni][nj]=k++;;
                    
                }
                
            }
        }
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
            bfs(si,sj);
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
