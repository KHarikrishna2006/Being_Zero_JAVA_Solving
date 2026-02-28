class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Map<Integer,Integer> tm=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(!tm.containsKey(nums[i])){
              tm.put(nums[i],1);  
            }
            else{
                tm.put(nums[i],tm.get(nums[i])+1);
            }
        }
        // System.out.println(tm);
        for (int x : tm.keySet()) {
    for (int y : tm.keySet()) {
        if (x < y) {
            if (!tm.get(x).equals(tm.get(y))) {
                return new int[]{x, y};
            }
        }
    }
}
        return new int[]{-1,-1};
    }
}©leetcode
