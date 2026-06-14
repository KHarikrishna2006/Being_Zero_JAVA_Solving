# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        l=[]
        while(head.next!=None):
            l.append(head.val)
            head=head.next
        l.append(head.val)
        k=0
        for i in range(0,len(l)//2):
            s=l[i]+l[len(l)-1-i]
            k=max(k,s)
        return k
