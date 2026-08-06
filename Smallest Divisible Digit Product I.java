class Solution {
    public static int po(int a){
        int k=1;
        while(a!=0){
            int d=a%10;
            k*=d;
            a/=10;
        }
        return k;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            if(po(n)%t==0) return n;
            n+=1;
        }
    }
}
