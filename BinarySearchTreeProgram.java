import java.util.*;

public class BinarySearchTreeProgram{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			BST bst=new BST();
			int[]  nums={100,76,3,105,45,378,1,8,9,10};
			bst.populate(nums);
			bst.display();

	}

}

class BST{
	Node root;
	public class Node{
		int value;
		Node right;
		Node left;
		int height;

		public Node(int value){
			this.value=value;
		}

	}
	// public BST(){

	// }

	public int height(Node node){
		if(node==null){
			return -1;
		}
		return node.height;
	}
	// public Boolean isEmpty(){
	// 	return root=null;
	// }

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
		if(value > node.value){
			node.right=insert(value, node.right);
		}

	node.height=Math.max(height(node.left),height(node.right))+1;	

	return node;	
	}
	public boolean balanced(){
		return balanced(root);
	}

	public void populate(int[] nums){
		for(int i=0;i<nums.length;i++){
			this.insert(nums[i]);
		}
	}

	public boolean balanced(Node node){
		if(node==null){
			return true;
		}
		return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
	}


	public void display(){
		display(this.root,"Root Node: ");
	}

	public void display(Node node, String details){
		if(node==null){
			return;
		}
		System.out.println(details+ node.value);

		display(node.left, "Left child of "+ node.value+" : ");
		display(node.right, "Right child of "+ node.value+" : ");
		System.out.println(balanced());

} 
}