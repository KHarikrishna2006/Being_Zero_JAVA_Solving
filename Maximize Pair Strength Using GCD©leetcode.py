class Solution:
    def gcd(a,b):
        if b==0:
            return a;
        return gcd(b,a%b)
    def maxPairStrength(self, nums: list[int]) -> int:
        m=0
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                a=((nums[i]*nums[j])//gcd(nums[i],nums[j])**2)
                m=max(m,a)
        return m©leetcode
