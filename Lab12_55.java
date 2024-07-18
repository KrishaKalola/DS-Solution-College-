import java.util.*;

public class Lab12_55{
	public static void main(String[] args){
		DoubleLinkList dll=new DoubleLinkList();

		dll.insertAtFirst(1);
		dll.insertAtLast(2);
		dll.insertAtLast(3);
		dll.insertAtLast(4);
		dll.display();
		dll.delete(2);
		dll.display();
		dll.delete(4);
		dll.display();


	}
}

class DoubleLinkList{
		Node first;
		Node last;

	public DoubleLinkList(){
		this.first=null;
		this.last=null;
	}	

	public void insertAtFirst(int val){
		Node node=new Node(val);
		node.val=val;
		node.next=first;
		node.prev=null;
		if(first!=null){
			first.prev=node;
		}
		first=node;

	}

	public void insertAtLast(int val){

		if(first==null){
			insertAtFirst(val);
			return;
		}

		Node node=new Node(val);
		Node last=first;
		while(last.next!=null){
			last=last.next;
		}
		node.val=val;
		node.next=null;
		node.prev=last;
		last.next=node;
		last=node;

	}

	public Node find(int val){
		Node node=first;
		while(node!=null){
			if(node.val==val){
				return node;
			}
			node=node.next;
		}
		return null;
	}
	public Node get(int index){
		Node node=first;
		for (int i=0;i<(index) ;i++ ) {
			node=node.next;
		}
		return node;
	}

	
	public int delete(int val){

		Node temp=first;
		Node dnode=null;
		if(temp==null){
			System.out.println("LinkList is empty.");
			return -1;333363
		}
		while(temp!=null){
			if(temp.val==val){
				dnode=temp;
			}
			temp=temp.next;
		}

		if(dnode.prev==null){
			dnode.next.prev=null;
			dnode.next=null;
			return val;
		}
		if(dnode.next==null){
			dnode.prev.next=null;
			dnode.prev=null;
			return val;
		}

		dnode.prev.next=dnode.next;
		dnode.next.prev=dnode.prev;
		return val;
	}

	public void display(){
		Node temp=first;
		Node last=null;
		while(temp!=null){
			System.out.print(temp.val+" -> ");
			last=temp;
			temp=temp.next;
			
		}
		System.out.print("END");
		System.out.println();

		//print in reverse.
		// System.out.println();
		// System.out.println("Display in reverse");
		// while(last!=null){
		// 	System.out.print(last.val+" -> ");
		// 	last=last.prev;
		// }
		// System.out.print("START");
	}



	public class Node{
		int val;
		Node next;
		Node prev;

		public Node(int val){
			this.val=val;
		}
	    public Node(int val,Node next,Node prev){
	    	this.val=val;
	    	this.next=next;
	    	this.prev=prev;
	    }
	}
}
