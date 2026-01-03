import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int aa[]={a,b,c,d};
            int ac=0;
            for(int i=0;i<aa.length;i++){
                if(a==aa[i]) ac++;
            }
            int k=0;
            if(a!=b){
                k=b;
            }
            else if(a!=c) k=c;
            else if(a!=d) k=d;
            int ck=0;
            for(int i=0;i<aa.length;i++){
                if(k==aa[i]) ck++;
            }
            System.out.println((ac%2==0 && ck%2==0)?1:0);
        }
    }
}
