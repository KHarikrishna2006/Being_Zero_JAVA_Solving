/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode sl=null;
        ListNode fs=head;
        while(fs!=null && fs.next!=null){
            if(sl==null) sl=head;
            else sl=sl.next;
            fs=fs.next.next;
        }
        ListNode k=sl;
        if(sl.next!=null || sl.next.next!=null) k=k.next.next;
        else k=null;
        sl.next=k;
        return head;
    }
}
