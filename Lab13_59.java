import java.util.*;

public class Lab13_59{
public static void main(String[] args){
	BST bst=new BST();
	bst.insert(2);
	bst.insert(67);
	bst.insert(4);
	bst.insert(1);
	bst.insert(6);
	System.out.println("Pre Order Traversal is:");
	bst.PreOrderTraversal();
//	System.out.println("Post Order Traversal is:");
//	bst.PostOrderTraversal();
//	System.out.println("In Order Traversal is:");
//	bst.InOrderTraversal();
	bst.delete(6);
	System.out.println("Pre Order Traversal is:");
	bst.PreOrderTraversal();
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
		if(value < node.value){
			node.left=insert(value, node.left);
		}
		else if(value > node.value){
			node.right=insert(value, node.right);
		}
		
	return node;
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

	public void PostOrderTraversal(){
		PostOrderTraversal(root);
		System.out.println();
	}

	public void PostOrderTraversal(Node node){
		if(node!=null){	
		PreOrderTraversal(node.left);
		PreOrderTraversal(node.right);
		System.out.print(node.value+" ");	
		}
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


	public Node delete(int dval){
		root= delete(dval,root);
		return root;
	}

	public Node delete(int dval,Node root){
		if(root==null){
			System.out.println("Tree is empty");
			return root;
		}
		if(dval<root.value){
			root.left= delete(dval,root.left);
		}

		else if(dval>root.value){
			root.right= delete(dval,root.right);
		}
		
		else{
			 if(root.left==null && root.right==null){
			return null;}
			if(root.left==null){
				return root.right;
			}
			else if(root.right==null){
				return root.left;
			}
			Node Is=minValue(root.right);
			root.value=Is.value;
			root.right=delete(root.value,root.right);
			}
		return root;
	}

	public Node minValue(Node root) {
    
    while (root.left != null) {
      root = root.left;
    }
    return root;
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