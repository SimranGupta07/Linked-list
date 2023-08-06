package Linked_list;

import Linked_list.linkedlist.node;

public class cycle_removal {
	public class node{
				
				int val;
				node next;
			}
			private node head;
			private node tail;
			private int size;
			
			public void addfront(int item) {
				node nn=new node();//it is basically address here we build a node
				nn.val=item;
				if(size==0) {
					head=nn;
					tail=nn;
					size++;
				}
				else {
					nn.next=head;
					head=nn;
					size++;
				}
	}

public void addlast(int item) {
	if(size==0) {
		addfront(item);
	}
	else {
		node nn=new node();
		nn.val=item;
		tail.next=nn;
		tail=nn;
	}
}
public void Display(){
    node temp=head;
    while(temp!=null) {
 	   System.out.println(temp.val+""+temp.next);
 	   temp=temp.next;
    }
    System.out.print(".");
	}
public void createcycle() throws Exception {
	tail.next=getnode(2);
}
private node getnode(int k) {
	node temp=head;
	for(int i=0;i<k;i++) {
		temp=temp.next;
	}
	return temp;
}
public node hascycle() {
	node fast=head;
	node slow=head;
	while(fast!=null&&fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
		if(fast==slow) {
			return slow;
		}
	}
	return null;
}
public void removalcycle1() {
	node meet=hascycle();
	if(meet==null) {
		return;
	}
	node slow=head;
	while(slow!=null) {
		node temp=meet;
		while(temp!=meet) {
			if(temp.next==slow) {
				temp.next=null;
				return;
			}
			temp=temp.next;
		}
		slow=slow.next;
	}
}
public void removalcycle2() {
	node meet=head;
	if(meet==null) {
		return;
	}
	int count=1;
	node temp=meet;
	while(temp.next!=meet) {
		count++;
		temp=temp.next;
	}
	node fast=head;
	for(int i=0;i<count;i++) {
		fast=fast.next;
		
	}
	node slow=head;
	while(slow.next!=fast.next) {
		slow=slow.next;
		fast=fast.next;
	}
	fast.next=null;
}
//floyed cycle
public void removecycle3() {
	node meet=hascycle();
	if(meet==null) {
		return;
	}
	node fast=meet;
	node slow =head;
	while(slow.next!=fast.next) {
		slow=slow.next;
		fast=fast.next.next;
		
	}
	fast.next=null;
	
}

public static void main(String[] args) {
	cycle_removal cl=new cycle_removal();
	cl.addlast(2);
	cl.addlast(3);
	cl.addlast(4);
	cl.addlast(5);
	cl.addlast(6);
	cl.addlast(7);
	}
}
