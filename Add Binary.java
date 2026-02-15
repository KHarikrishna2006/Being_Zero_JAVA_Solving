class Solution:
    def addBinary(self, a: str, b: str) -> str:
        aa=0
        bb=0
        a=a[::-1]
        b=b[::-1]
        c=0
        for i in a:
            if(i=="1"):
                aa+=(2**c)
            c+=1
        c=0
        for i in b:
            if(i=="1"):
                bb+=(2**c)
            c+=1
        s=aa+bb
        return format(s,'b')
