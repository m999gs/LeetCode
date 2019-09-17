/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode res=null;
        ListNode temp=res;
        
        while(temp1!=null&&temp2!=null){
            if(temp1.val<=temp2.val){
                ListNode newnode=new ListNode(temp1.val);
                newnode.next=null;
                if(res==null){
                res=newnode;
                    temp=res;
                }
                else{
                    temp.next=newnode;
                    temp=temp.next;
                }
                temp1=temp1.next;
            }
            else{
                ListNode newnode=new ListNode(temp2.val);
                newnode.next=null;
                if(res==null){
                res=newnode;
                    temp=res;
                }
                else{
                    temp.next=newnode;
                    temp=temp.next;
                }
                temp2=temp2.next;
            }
            
        }
        while(temp1!=null){
                ListNode newnode=new ListNode(temp1.val);
                newnode.next=null;
                if(res==null){
                res=newnode;
                    temp=res;
                }
                else{
                    temp.next=newnode;
                    temp=temp.next;
                }
                temp1=temp1.next;
        }
        while(temp2!=null){
                ListNode newnode=new ListNode(temp2.val);
                newnode.next=null;
                if(res==null){
                res=newnode;
                    temp=res;
                }
                else{
                    temp.next=newnode;
                    temp=temp.next;
                }
                temp2=temp2.next;
        }
        return res;
    }
}