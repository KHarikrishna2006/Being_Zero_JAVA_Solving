class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        n=k
        while True:
            if k not in nums:
                return k
            k+=n
            
