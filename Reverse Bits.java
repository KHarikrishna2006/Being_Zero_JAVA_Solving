class Solution:
    def reverseBits(self, n: int) -> int:
        k=format(n,'b')
        k=k[::-1]
        l=32-len(k)
        while(l!=0):
            k+='0'
            l-=1
        print(len(k))
        return int(k,2)
