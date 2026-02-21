class Solution {
    public int[] decrypt(int[] code, int k) {
        int len =code.length;
        int[] a=new int[len];
        if(k==0) return a;
        int n=0;
        int i=0,j=0;
        while(n<code.length){
            if(k>0){
                i = (n + 1) % len;
                j = (n + k) % len;
            }
            else{
                i = (n + k % len + len) % len; 
                j = (n - 1 + len) % len;
            }
            System.out.println(i+" "+j);
            int sm=0;
            if(i<=j){
                for(int l=i;l<=j;l++) sm+=code[l];
            }
            else{
                for(int l=i;l<code.length;l++) sm+=code[l];
                for(int l=0;l<=j;l++) sm+=code[l];
            }
            a[n]=sm;
            n++;
        
        }
        return a;
    }
}
