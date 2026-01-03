import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double a=sc.nextInt();
            double b=sc.nextInt();
            double c=sc.nextInt();
            double d=sc.nextInt();
            double re=Math.pow(((Math.pow((a-c),2))+(Math.pow((b-d),2))),0.5);
            System.out.printf("%.3f",re);
            System.out.println();
        }
    }
}
