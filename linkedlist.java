package Linked_list;

public class linkedlist {
	public class node{
		
		int val;
		node next;
	}
	private node head;
	private node tail;
	private int size;
	
	public void addfront(int item) {
		node nn=new node();//generate a node
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
	public void addindex(int item,int k)throws Exception {
		if(k<0|| k>size) {
			throw new Exception("wrong address");
		}
		if(k==0) {
			addfront(item);
		}
		else if (k==size) {
			addlast(item);
		}
		else {
			node k_1=getnode(k-1);
			node nn=new node();
			nn.val=item;
			nn.next=k_1.next;
			k_1.next=nn;
			size++;
		}
	}
	private node getnode(int k) {
		node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	public int getfirst() {
		return head.val;
	}
	
	public int getlast() {
		return tail.val;
	}
	
	public int getindex(int k) {
		return getnode(k).val;
	}
	
	public int removefirst() {
		node temp;
		temp=head;
		if(size==1) {//if there were only one node
			head.next=null;
			tail.next=null;
		}
		else {
		head=head.next;
		temp.next=null;
		}
		size--;
		return temp.val;
	}
	
	public int removelast() {
		if(size==1) {
			return removefirst();
		}
		else {
			node sn=getnode(size-2);
			tail=sn;
			tail.next=null;		
		    size--;
		    return tail.val;
		}
	}
	
	public int removeatindex(int k) {
		if(size==0) {
			return removefirst();
		}
		else if(k==size-1) {
			return removelast();
			}
		else {
			node prev=getnode(k-1);
			node curr=getnode(k);
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.val;
			
		}
	}
	
	public int size() {
		return size;
	}
	
	public void Display(){
       node temp=head;
       while(temp!=null) {
    	   System.out.println(temp.val+""+temp.next);
    	   temp=temp.next;
       }
       System.out.print(".");
	}

}
