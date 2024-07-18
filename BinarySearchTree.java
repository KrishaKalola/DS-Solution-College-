import java.util.*;

public class BinarySearchTree{
	public static void  main(String[] args){
		Scanner sc =new Scanner(System.in);
		bst bstimplication=new bst();

		bstimplication.insert(sc);
		bstimplication.display();

	}

}

class bst{
	Node root;
	public bst(){
		this.root=null;
	}

	public void insert(Scanner sc){
		System.out.println("Enter a root node.");
		int value=sc.nextInt();
		root =new Node(value);
		insertp(sc,root);

	}

	public void insertp(Scanner sc,Node node){
		System.out.println("Do u want to insert a left node of "+node.value+" ?");
		boolean left=sc.nextBoolean();
		if(left){
			System.out.println("Enter a value of left node value of "+node.value);
			int value=sc.nextInt();
			node.left=new Node(value);
			insertp(sc,node.left);
		}

		System.out.println("Do u want to insert a right node of "+node.value+" ?");
		boolean right=sc.nextBoolean();
		if(right){
			System.out.println("Enter a value of right node value of "+node.value);
			int value=sc.nextInt();
			node.right=new Node(value);
			insertp(sc,node.right);
		}
	}

	public void display(){
		if(root==null){
			return;
		}
		System.out.println(root.value);
		display(root,"");
	}
	public void display(Node node,String indent){
		
		if(node.left!=null){
			System.out.print(indent+ node.left.value);
			display(node.left,"");
		}
		if(node.right!=null){
			System.out.print(indent+node.right.value);
			display(node.right,"");
		}

	}

	public class Node{
		int value;
		Node left;
		Node right;

		public Node(int value){
			this.value=value;
		}
	}
}