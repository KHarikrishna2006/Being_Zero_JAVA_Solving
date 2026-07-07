class Solution:
    def sumAndMultiply(self, n: int) -> int:
        l=[]
        s=0
        for i in str(n):
            if i!='0':
                l.append(i)
                s+=int(i)
        if not l:
            return 0
        k=int("".join(l))
        return k*s
        
