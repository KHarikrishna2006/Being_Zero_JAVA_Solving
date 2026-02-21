public class Solution {
    public int maxArea(int[] A) {
        int i=0,j=A.length-1;
        int max=0;
        while(i<j){
            int e=(j-i)*(Math.min(A[i],A[j]));
            max=Math.max(max,e);
            if(A[i]<A[j]) i++;
            else j--;
        }
        return max;
    }
}
