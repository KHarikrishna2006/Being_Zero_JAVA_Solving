import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ii=0,jj=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int k=sc.nextInt();
                    if(k==1){
                        ii=i;
                        jj=j;
                    }
                    
                }
            }
            int c=0;
            // System.out.println(ii+" "+jj);
            c+=Math.abs((n/2)-ii);
            c+=Math.abs((n/2)-jj);
            System.out.println(c);
        }
    }
}
