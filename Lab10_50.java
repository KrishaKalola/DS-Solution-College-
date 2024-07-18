
import java.util.*;

public class Lab10_50{
	public static void main(String[] args){
		Stack stack=new Stack();

		stack.push(100);
		stack.display();
		stack.push(3);
		stack.push(54);
		stack.push(34);
		stack.push(23);
		stack.push(22);
		stack.display();
		System.out.println("deleted item is: "+stack.pop());
		stack.display();
		System.out.println("deleted item is: "+stack.peep(2));
		stack.display();
		stack.change(101,2);
		stack.display();

	}
}

class Stack{
	Node top;
	Node first;
	int size;
	public Stack(){
		this.size=0;
		this.first=null;
	}


	public void push(int val){
		Node node= new Node(val);
		if(first==null){
			node.next=first;
			first=node;
			top=first;
			size++;
			return;
		}
		top.next=node;
		top=node;	
		size++;
	}

	public int pop(){
		if(top==null){
			System.out.println("Empty");
			return -1;
		}
		if(size==1){
			int val=top.val;
			top=top.next;
			first=null;
			size--;
			return val;
		}

		Node secandLast= get(size-2);
		int val=top.val;
		top=secandLast;
		top.next=null;
		size--;
		return val;
	}

	public int peep(int i){
		int index=size-i;
		if(index==0 || index==(size-1)){
			return pop();
		}
		Node pri=get(index-1);
		int val=pri.next.val;
		pri.next=pri.next.next;
		size--;
		return val;
	}

	public void change(int val,int i){
		int index=size-i;
		Node node=get(index);
		node.val=val;
		return;
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
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.print("End");
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