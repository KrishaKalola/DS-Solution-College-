
import java.util.*;

public class Lab11_53{
	public static void main(String[] args){
		CircularLinkList cll=new CircularLinkList();
		cll.insertAtFirst(1);
		cll.insertAtFirst(2);
		cll.insertAtFirst(3);
		cll.insertAtFirst(4);
		cll.display();
		cll.insertAtLast(5);
		cll.insertAtLast(6);
		cll.insertAtLast(7);
		cll.insertAtLast(8);
		cll.display();
		System.out.println("Deleted element is : "+ cll.deleteAIndex(0));
		cll.display();
		cll.insertAtFirst(100);
		cll.display();
		

	}	
}



class CircularLinkList{
     Node first;
     Node last;
     int size;

     public CircularLinkList(){
     	this.first=first;
     	this.last=last;
     	this.size=0;
     }

     public void insertAtFirst(int val){
     	Node node=new Node(val);
     	if(first==null){
     		first=node;
     		last=node;
     		node.next=null;
     		size++;
     		return;	
     	}
     	last.next=node;
     	node.next=first;
     	first=node;
     	size++;
    }

    public void insertAtLast(int val){
    	if(first==null){
    		insertAtFirst(val);
    		return;
    	}
    	Node node=new Node(val);
    	last.next=node;
    	node.next=first;
    	last=node;
    	size++;
    }

    public int deleteAIndex(int index){
    	
    	if(index>=size || index<0){
    		System.out.println("Such index not available");
    		return 0;
    	}
    	Node pri;
    	if(index==0){
    		 pri=last;
    	}
    	else{
			 pri= get(index-1);	
    	}

    	int val=pri.next.val;
		pri.next=pri.next.next;
		size--;

		if(index==0){
			first=pri.next.next;
			last.next=first;
		}
		if(index==size-1){
			last=pri;
			pri.next=first;
		}

		return val;
	}

	public Node get(int index){
		Node node=first;
		for (int i=0;i<index ;i++ ) {
			node=node.next;
		}
		return node;
	}

     public void display(){
     	Node temp=first;
     	if(first!=null){     			
     	do{
     		System.out.print(temp.val+" -> ");
     		temp=temp.next;
     	}while(temp!=first);
		}
     	System.out.print("HEAD");
     	System.out.println();
     	
     }



	class Node{
			int val;
			Node next;
		public Node(int val){
			this.val=val;
		}	
		public Node(int val,Node next){
			this.val=val;
			this.next=next;
		}

	}
}