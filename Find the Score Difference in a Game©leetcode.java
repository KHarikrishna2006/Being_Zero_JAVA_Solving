class Solution {
    public int scoreDifference(int[] nums) {
        int p1=0,p2=0;
        boolean b=true;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) % 6 == 0) {
                b = !(b);
            }
            if ((nums[i] &1)!= 0) {
                b=!(b);
            }
            if (b) {
                    p1+=nums[i];
                
            } else{
                p2+=nums[i];
            }
        }
        return p1-p2;
    }
}©leetcode
