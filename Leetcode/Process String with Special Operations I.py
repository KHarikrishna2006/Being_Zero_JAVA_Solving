class Solution:
    def processStr(self, s: str) -> str:
        r=""
        for i in s:
            if i=='*':
                if(len(r)!=0):
                    r=r[:len(r)-1]
            elif i==        '#':
                r=r+r
            elif i=='%':
                r=r[::-1]
            else:
                r+=i
        return r
