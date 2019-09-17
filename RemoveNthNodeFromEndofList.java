/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode prev;
        int count=1,cn=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        n=count-n;
        temp=head;
        prev=temp;
        while(temp.next!=null){
            
            if(n!=0)cn++;
            if(n==0){
                head=temp.next;
                break;
            }
            else if(cn==n){
                prev=temp.next;
                temp.next=temp.next.next;
                prev.next=null;break;
            }
            prev=temp;
            temp=temp.next;
        }
        if(n==count-1){
            if(n==0){
                head=null;
            }
            else{
            prev.next=null;   
            }
        }
        return head;
    }
}