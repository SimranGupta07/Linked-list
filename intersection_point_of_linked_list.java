package Linked_list;

public class intersection_point_of_linked_list {
	 public class ListNode {
		    int val;
		      ListNode next;
		     ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	 public class Solution {
		    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		    	ListNode ll1=headA;
		    	ListNode ll2=headB;
		    	while(ll1!=ll2) {
		    		if(ll1==null) {
		    			ll1=headB;
		    		}
		    		else {
		    			ll1=ll1.next;
		    			
		    		}
		    		if(ll2==null) {
		    			ll2=headA;
		    		}else {
		    			ll2=ll2.next;
		    		}
		    		
		    	}
		    	return ll1;
		    }
		}
}

