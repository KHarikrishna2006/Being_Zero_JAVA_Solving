class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<(1<<nums.length);i++){
            List<Integer> aa=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0) aa.add(nums[j]);
            }
            a.add(aa);
        }
        return a;
    }
}
