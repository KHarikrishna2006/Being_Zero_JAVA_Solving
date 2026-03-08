class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int mi=-1,m=Integer.MAX_VALUE;
        for(int i=0;i<capacity.length;i++){
            if((capacity[i]-itemSize)>=0 && (capacity[i]-itemSize)<m){
                m=capacity[i]-itemSize;
                mi=i;
            }
        }
        return mi;
    }
}
