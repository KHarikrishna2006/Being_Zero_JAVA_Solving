class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        c=0
        for i in range(len(nums)):
            a=set()
            for j in range(i,len(nums)):
                a.add(nums[j])
                print(a)
                c+=(len(a)**2)
        return c
