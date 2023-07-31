package Linked_list;

public class SORTING {

	 public class ListNode {
		      int val;
		   ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
		 
		class Solution{
			public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
				ListNode A=list1;
				ListNode B=list2;
				ListNode dummy=new ListNode();
				ListNode temp=dummy;
				while(A!=null&&B!=null) {
					if(A.val<B.val){
					dummy.next=A;
					dummy=dummy.next;
					A=A.next;
					}
				
				else {
					dummy.next=B;
					dummy=dummy.next;
					B=B.next;
				}
				
			}
			if(A==null) {
				dummy.next=B;
				
			}
			if(B==null) {
				dummy.next=A;
			}
			return temp.next;
		}

	}

}
