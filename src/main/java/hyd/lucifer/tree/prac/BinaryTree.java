package hyd.lucifer.tree.prac;

public class BinaryTree {
	
		Node root;
		
		
		
		public void addData(int data) {
				root=addDataRec(root, data);
		}
		
		public Node addDataRec(Node root,int data) {
			
			if(root==null) {
			root = new Node(data);	
			}else if(data<root.data) {
				root.left=addDataRec(root.left, data);
			}else if(data > root.data){
				root.right=addDataRec(root.right, data);
			}
			
			return root;
		}
		
		

	
}
