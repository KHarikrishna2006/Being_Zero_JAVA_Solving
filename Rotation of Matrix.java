import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=0;
        while(t-->0){
            int n=sc.nextInt();
            int[][] an=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    an[i][j]=sc.nextInt();
                }
            }
            System.out.println("Test Case #"+(++c)+":");
            for(int j=0;j<n;j++){
                for(int i=n-1;i>=0;i--){
                    System.out.print(an[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
