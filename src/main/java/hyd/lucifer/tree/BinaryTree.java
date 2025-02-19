package hyd.lucifer.tree;

public class BinaryTree {
	
	Node root;

	public static void main(String[] args) {
		
		BinaryTree b = new BinaryTree();
		b.insertData(3);
		b.insertData(5);
		b.insertData(2);
		b.insertData(7);
		b.insertData(9);
		inOrderTraversal(b);
	}
	
	
	
	public static void  inOrderTraversal(BinaryTree a) {
		
		if(a.root!=null) {
			System.out.println(a.root.data);
//			inOrder(a.root); 
		}
		
	}
//	
//	public static void inOrder(Node n) {
//		if(n!=null) {
//			if(n.left!=null) {
//				System.out.println(n.left.data);
//				inOrder(n.left);
//			}else if(n.right!=null) {
//				System.out.println(n.right.data);
//				inOrder(n.right);
//			}
//		}
//		
//	}
	
	public void insertData(int data) {
		if(root!=null) {
			root = insertDataRec(root, data);
		}else {
			root = new Node(data);
		}
	}
	
	
	public Node insertDataRec(Node root,int data) {
		
		if(root.data < data) {
			insertDataRec(root.left, data);
		}else {
			insertDataRec(root.right, data);
		}
		
		
		return root;
		
	}
	
	
}
