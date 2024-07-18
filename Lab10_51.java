import java.util.*;

public class Lab10_51{
	public static void main(String[] args){
		queue que=new queue();
		que.insert(3);
		que.insert(2);
		que.insert(1); 
		
		que.display();
		System.out.println("Deleted element is: "+ que.delete());
		que.display();


	}	
}

class queue{
	Node first;
	Node last;
	int size;
	public queue(){
		this.first=null;
		this.last=null;
		this.size=0;
	}

	public void insert(int val){
		Node node=new Node(val);
			node.next=first;
			first=node;
			if(last==null){
			last=first;
			}	

		size++;			
	}

	public int delete(){
		if(last==null){
			System.out.println("Empty");
			return -1;
		}
		if(size==1){
			int val=last.val;
			last=last.next;
			first=null;
			size--;
			return val;
		}

		Node secandLast= get(size-2);
		int val=last.val;
		last=secandLast;
		last.next=null;
		size--;
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
		while(temp!=null){
			System.out.print(temp.val+" -> ");
			temp=temp.next;
		}
		System.out.print("END");
		System.out.println();
	}



	public class Node{
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