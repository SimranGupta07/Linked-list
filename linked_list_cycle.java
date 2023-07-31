package Linked_list;

public class linked_list_cycle {
	 class ListNode {
		    int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	 public class solution{
		 public boolean hascycle(ListNode head) {
		ListNode slow=head;
		 ListNode fast=head;
		 while(fast!=null&&fast.next!=null) {
			
			 slow=slow.next;
			 fast=fast.next.next;
			 if(slow==fast) {
				 return true;
			 }
		 }
		 return false;
	 }

}
	 }