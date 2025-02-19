package hyd.lucifer.bstrefresh;

public class BinarySearchTree {
	
	Node root;
	
	public void addData(int data) {
		root = addDataRec(root,data);
	}
	
	public Node addDataRec(Node root,int data) {
		
		if(root!=null) {
			if(data<root.data) {
				root.left=addDataRec(root.left, data);
			}else {
				root.right=addDataRec(root.right, data);
			}
		}else {
			root = new Node(data);
		}
		
		return root;
	}
	
	public void traversalIO() {
		
		if(root!=null) {
			traversalIORec(root);
			System.out.println(root.data);
			traversalIORec(root.right);
		}else {
			System.out.println("The tree is empty!! Start by adding nodes to the tree");
		}
		
	}
	
	public void traversalIORec(Node root) {
	if(root==null) {
		return;
	}else if(root.left!=null) {
		traversalIORec(root.left);
	}else {
		System.out.println(root.data);
 		traversalIORec(root.right);
	}
		
	}
	
	
	public void traversalIORecR(Node root) {
		if(root==null) {
			return;
		}else if(root.right!=null) {
			traversalIORec(root.right);
		}else {
			System.out.println(root.data);
			traversalIORec(root.right);
		}
			
		}
//	
//	public void traversalIORecRight(Node root) {
//		
////		if(root.left != null) {
////			System.out.print(root.left.data);
////			traversalIORec(root.right);
////		}
//		
//
//		
//		if(root.right !=null){
//			System.out.print(root.right.data);
//			traversalIORec(root.right);
//		}
//		
//		
//	}
//	
	
	
	
	
	
	
	
}
