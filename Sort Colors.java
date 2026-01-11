class Solution {
    public void sortColors(int[] nums) {
        int c=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) c++;
            else if(nums[i]==1) c1++;
            else c2++;
        }
        int i=0;
        while(c-->0){
            nums[i]=0;
            i++;
        }
        while(c1-->0){
            nums[i]=1;
            i++;
        }
        while(c2-->0){
            nums[i]=2;
            i++;
        }
    }
}
