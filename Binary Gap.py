class Solution:
    def binaryGap(self, n: int) -> int:
        s=format(n,'b')
        if s.count('1')<2:
            return 0
        m=0
        l=0
        for i in range(len(s)):
            if s[i]=='1':
                m=max(m,i-l)
                l=i
        return m
