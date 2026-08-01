class Solution:
    def countValidPrefixes(self, s: str) -> int:
        c=0
        for i in range(1,len(s)+1):
            w=s[:i]
            k=abs(w.count('0')-w.count('1'))
            if k<=1:
                c+=1
        return c©leetcode
