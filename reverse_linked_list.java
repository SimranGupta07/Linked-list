package Linked_list;

public class reverse_linked_list {
	public class ListNode {
		    int val;
		     ListNode next;
		      ListNode() {}
		     ListNode(int val) { this.val = val; }
		    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	 class solution{
		public ListNode reverse(ListNode head) {
	 ListNode prev=null;
     ListNode curr=head;
     while(curr!=null) {
     	ListNode ahead=curr.next;
     	curr.next=prev;
     	prev=curr;
     	curr=ahead;
     	
     }
     return prev;
 }
}
