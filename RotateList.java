/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return head;
        ListNode temp=head;
        ListNode prev=temp;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;count++;
        }
        k=k%count;
        if(k==0)return head;
        count=0;
        prev=temp=head;
        while(temp.next!=null){
            temp=temp.next;count++;
            if(count>k){
                prev=prev.next;
            }
        }
        temp.next=head;
        head=prev.next;
        prev.next=null;
        return head;
    }
}