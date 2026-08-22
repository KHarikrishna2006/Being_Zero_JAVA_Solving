class Solution:
    def checkDivisibility(self, n: int) -> bool:
        s=0
        p=1
        for i in str(n):
            s+=int(i)
            p*=int(i)
        return n%(s+p)==0
