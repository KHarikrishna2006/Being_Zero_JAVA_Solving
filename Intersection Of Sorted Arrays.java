public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] intersect(final int[] A, final int[] B) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<A.length && j<B.length){
            if(A[i]==B[j]){
                ans.add(A[i]);
                i++;j++;
            }
            else if(A[i]>B[j]) j++;
            else i++;
            
        }
        int[] aa=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            aa[k]=ans.get(k);
        }
        return aa;
    }
}
