import java.util.*;

public class MirrorOfBst{
	public static void main(String args[]){
	BST bst=new BST();
	bst.insert(2);
	bst.insert(67);
	bst.insert(4);
	bst.insert(1);
	bst.insert(6);
	System.out.println("Pre Order Traversal is:");
	bst.PreOrderTraversal();
	System.out.println("In Order Traversal is:");
	bst.InOrderTraversal();
	}
}

class BST{
	Node root;


	public Node insert(int value){
		if(root==null){
			root=new Node(value);
		return root;	
		}
		return insert(value,root);	
	}

	public Node insert(int value, Node node){
		
		if(node==null){
			node=new Node(value);
			return node;
		}
		
		node.left=node.right;
		node.right=node.left;

		if(value < node.value){
			node.left=insert(value,node.left);				
		}
		else if(value > node.value){
			node.right=insert(value,node.right);	
		}
		
		
	return node;
	}	

	public void InOrderTraversal(){
		InOrderTraversal(root);
		System.out.println();
	}

	public void InOrderTraversal(Node node){
		if(node!=null){
		PreOrderTraversal(node.left);
		System.out.print(node.value+" ");
		PreOrderTraversal(node.right);	
		}
	}



	public void PreOrderTraversal(){
		PreOrderTraversal(root);
		System.out.println();
	}

	public void PreOrderTraversal(Node node){
		if(node!=null){
		System.out.print(node.value+" ");
		PreOrderTraversal(node.left);
		PreOrderTraversal(node.right);	
		}
	}

	
	public class Node{
		int value;
		Node left;
		Node right;
		public Node(int value){
			this.value=value;
			this.left=null;
			this.right=null;
		}
	}

}	