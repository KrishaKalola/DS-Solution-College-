import java.util.*;

public class LinkList{
	public static void main(String[] args){
		LinkListLL ll=new LinkListLL();
		DoubleLinkList dll=new DoubleLinkList();
		CircularLinkList cll=new CircularLinkList();

		// Scanner sc=new Scanner(System.in);
		// System.out.println("Which type of linklist you would like to apply?");
		// System.out.println("Enter:\n 1= Singlylink linear list,\n 2= CircularLinkList,\n 3= DoubleLinkList");
		// int ans=sc.nextInt();

		// while(true){
		// 		switch(ans){
		// 				case 1:	
		// 				System.out.println("Which operation u would like to apply in Singlylinklist?");
		// 				System.out.println("Enter:\n 1= insertAtFirst,\n 2=insertAtLast,\n3= insertAtIndex,\n 4=deleteAtFirst,\n 5=deleteFromlast,\n 6=deleteAIndex,\n7=deleteAValue");
		// 				int ansll=sc.nextInt();
		// 				while(true){
		// 					switch(ansll){
		// 					case 1:
		// 						while(true){
		// 							System.out.println("enter an value to insert at first and enter -1 to display list: ");
		// 						    int val=sc.nextInt();
		// 						    if(val!=-1){
		// 						    ll.insertAtFirst(val);	
		// 						    } 
		// 						    else{
		// 						    	ll.display();
		// 						    	break;

		// 						    }
		// 						}
		// 						break;
								
		// 					case 2:
		// 							while(true){
		// 							System.out.println("enter an value to insert at last and enter -1 to display list: ");
		// 						    int val=sc.nextInt();
		// 						    if(val!=-1){
		// 						    ll.insertAtLast(val);	
		// 						    } 
		// 						    else{
		// 						    	ll.display();
		// 						    	break;
		// 						    }
		// 						}
		// 						break;

		// 					case 3:
		// 							while(true){
		// 							System.out.println("enter an value to insert at an index and enter -1 to display list: ");
		// 						    int val=sc.nextInt();
		// 						    System.out.println("Enter an index: ");
		// 						    int index=sc.nextInt();
		// 						    if(val!=-1){
		// 						    ll.insertAtIndex(val,index);	
		// 						    } 
		// 						    else{
		// 						    	ll.display();
		// 						    	break;
		// 						    }
		// 						}
		// 						break;

		// 					case 4:	
		// 						while(true){
		// 							System.out.println("Enter 1 to delete from first and -1 to not delete anything.");
		// 							int del=sc.nextInt();
		// 							if(del==1){
		// 								ll.deleteFromFirst();
		// 							}
		// 							else{
		// 								ll.display();
		// 								break;
		// 							}
		// 						}	
		// 						break;


		// 					}
		// 				}	

		// 		}

		// }


		// ll.insertAtFirst(2);
		// ll.insertAtFirst(3);
		// ll.insertAtFirst(4);
		// ll.insertAtFirst(5);
		// ll.insertAtFirst(1);
		// ll.insertAtLast(999);
		// ll.insertAtIndex(0,3);

		// ll.display();
		// System.out.println();
		// System.out.println("deleted element is:" +ll.deleteFromFirst());
		// ll.display();
		// System.out.println("deleted element is:" +ll.deleteFromlast());
		// ll.display();
		// System.out.println("deleted element is"+ll.deleteAIndex(2));
		// ll.display();
		// System.out.println("deleted element is"+ll.deleteAValue(5));
		// ll.display();

		

		// dll.insertAtFirst(2);
		// dll.insertAtFirst(3);
		// dll.insertAtFirst(4);
		// dll.insertAtFirst(5);
		// dll.insertAtFirst(6);

		// dll.insertAtLast(1);
		// dll.insertAtLast(2);
		// dll.insertAtLast(3);
		// dll.insertAtLast(65);
		// dll.insertAtLast(88);	
		// dll.display();
		// System.out.println();
		// // dll.insertAfterValue(88,99);
		// // // dll.display();
		// // dll.insertAtIndex(2,100);

		// dll.delete(2);
		// dll.display();

		
		// cll.insertAtFirst(1);
		// cll.insertAtFirst(2);
		// cll.insertAtFirst(3);
		// cll.insertAtFirst(4);
		// cll.insertAtFirst(5);
		// cll.insertAtLast(100);
		
		// cll.display();
		// cll.delete(5);
		// cll.display();

	}
}

class LinkListLL{

	Node first;
	Node last;
	int size;

	public LinkListLL(){
		this.size=0;
	}

	public void insertAtFirst(int val){
		Node node=new Node(val);
		node.next=first;
		first=node;

		if(last==null){
			last=first;
		}
		size++;
	}

	public void insertAtLast(int val){
		
		if(last==null){
			insertAtFirst(val);
			return;
		}	
		Node node =new Node(val);
		last.next=node;
		last=node;
		size++;
	}

	public void insertAtIndex(int val,int index){
		if(index==0){
			insertAtFirst(val);
			return;
		}
		else if(index== size){
			insertAtLast(val);
			return;
		}

		Node temp=first;

		for(int i=1;i<index;i++){
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
		size++;
	}

	public int deleteFromFirst(){
		int val=first.val;
		first=first.next;
		if(first==null){
			last=null;
		}
		size--;
		return val;
	}
	public int deleteFromlast(){
		if(size<=1){
			return deleteFromFirst();
		}
		Node secandlast=get(size-2);
		int val=last.val;
		last=secandlast;
		last.next=null;

		return val;

	}

	public int deleteAIndex(int index){
		if(index==0){
			return deleteFromFirst();
		}
		if(index==size-1){
			return deleteFromlast();
		}

		Node pri= get(index-1);
		int val=pri.next.val;
		pri.next=pri.next.next;

		return val;
	}

	public Node get(int index){
		Node node=first;
		for (int i=0;i<index ;i++ ) {
			node=node.next;
		}
		return node;
	}

	public int deleteAValue(int value){
		Node node=first;
		for(int i=0;i<size;i++){
			if(node.val==value){
				return deleteAIndex(i);
			}
			node=node.next;
		}
		return value;
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

	public void insertAfterValue(int after,int val){
		Node p= find(after);

		if(p==null){
			System.out.println("System does not exit");
			return;
		}

		Node node=new Node(val);
		node.next=p.next;
		p.next=node;
		node.prev=p;
		if(node.next!=null){
			node.next.prev=node;
		}
	}

	public void insertAtIndex(int index,int val){
		Node p=get(index-1);
		int value=p.val;
		insertAfterValue(value,val);
	}


	public int delete(int val){
		Node temp=first;
		Node dnode=null;
		if(temp==null){
			return -1;
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

		//print in reverse.
		System.out.println();
		System.out.println("Display in reverse");
		while(last!=null){
			System.out.print(last.val+" -> ");
			last=last.prev;
		}
		System.out.print("START");
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

class CircularLinkList{
     Node first;
     Node last;

     public CircularLinkList(){
     	this.first=first;
     	this.last=last;
     }

     public void insertAtFirst(int val){
     	Node node=new Node(val);
     	if(first==null){
     		first=node;
     		last=node;
     		node.next=null;
     		return;	
     	}
     	last.next=node;
     	node.next=first;
     	first=node;
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
    }

    public void delete(int val){
    	Node temp=first;
    	if(temp==null){
    		return;
    	}
    	if(temp.val==val){
    		first=first.next;
    		last.next=first;
			return;	    	
    	}

    	do{
    		Node n=temp.next;
    		if(n.val==val){
    			temp.next=n.next;
    			break;
    		}
    		temp=temp.next;
    	}while(temp!=first);

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