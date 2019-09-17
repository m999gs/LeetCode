/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        int x;
        while(temp!=null && temp.next!=null){
            temp.val+=temp.next.val;
            temp.next.val=temp.val-temp.next.val;
            temp.val=temp.val-temp.next.val;
            
            if(temp.next!=null && temp.next.next!=null){
                temp=temp.next.next;
            }
            else{
                break;
            }
        }
        return head;
    }
}