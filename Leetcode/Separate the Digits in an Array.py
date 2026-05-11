class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        al=[]
        for i in nums:
            for j in str(i):
                al.append(int(j))
        return al
