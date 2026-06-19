class Solution {
    public int largestAltitude(int[] gain) {
        int k=0;
        int l=0;
        for(int i:gain){
            l=l+i;
            k=Math.max(k,l);
        }
        return k;
    }
}
