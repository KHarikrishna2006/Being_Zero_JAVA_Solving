class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int s=0,p=1;
        int n=nums.length;
        double[] s1 = new double[n];
        double[] p1 = new double[n];
        s1[0]=0;
        p1[n-1]=1;
        for(int i=1;i<n;i++){
            s1[i]=(double)nums[i-1]+s1[i-1];
        }
        for (int i=n-2;i>=0;i--) {
            p1[i]=(double)p1[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            if (s1[i]==p1[i]) {
                return i;
            }
        }
        return -1;
    }
}
