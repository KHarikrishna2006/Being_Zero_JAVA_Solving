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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode c=head;
        ListNode cr=head;
        while(c!=null){
            while(c!=null && cr.val==c.val){
                c=c.next;
            }
            cr.next=c;
            cr=cr.next;
        }
        return head;
    }
}
