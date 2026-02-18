class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        b=format(n,'b')
        if(b[0]=='1'):
            for i in range(1,len(b)):
                if(i%2==0):
                    if(b[i]=='0'):
                        return False
                else:
                    if(b[i]=='1'):
                        return False
        else:
                for i in range(1,len(b)):
                    if(i%2==0):
                        if(b[i]=='1'):
                            return False
                    else:
                        if(b[i]=='0'):
                            return False

        return True
