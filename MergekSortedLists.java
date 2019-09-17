/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list=new ArrayList<>();
        for(ListNode x:lists){
            while(x!=null){
                list.add(x.val);
                x=x.next;
            }
        }
        Collections.sort(list);
        
        ListNode head=new ListNode(0);
        ListNode temp=head;
        
        for(int i:list){
            ListNode newnode=new ListNode(i);
            temp.next=newnode;
            temp=temp.next;
        }
        return head.next;
    }
}