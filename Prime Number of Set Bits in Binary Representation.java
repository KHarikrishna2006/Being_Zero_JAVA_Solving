class Solution {
    public static boolean isPrime(int n) { 
    if (n <= 1) {
        return false;
    }
    if (n == 2) {
        return true;
    }
    if (n % 2 == 0) {
        return false;
    }
    for (int i = 3; i *i<=n; i += 2) {
        if (n % i == 0) {
            return false; 
        }
    }
    return true; 
}

    public int countPrimeSetBits(int left, int right) {
        int cs=0;
        for(int i=left;i<=right;i++){
            int c= Integer.bitCount(i);    
            if(isPrime(c)) cs++;          }
            return cs;
    }
}
