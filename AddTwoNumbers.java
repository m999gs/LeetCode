import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1=l1;
        ListNode c2=l2;
        ListNode newList=new ListNode(0);
        ListNode d=newList;
        int sum=0;
        while(c1!=null||c2!=null){
            sum/=10;
        if(c1!=null){
            sum+=c1.val;
            c1=c1.next;
        }
        if(c2!=null){
            sum+=c2.val;
            c2=c2.next;
        }
        d.next=new ListNode(sum%10);
        d=d.next;  
        }
        if(sum>=10){
            d.next=new ListNode(1);
            d=d.next;
        }
        return newList.next;
        }
}