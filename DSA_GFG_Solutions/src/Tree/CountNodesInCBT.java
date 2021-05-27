package Tree;

import Tree.TreeFromInorderAndPostorder.Node;

public class CountNodesInCBT {
	
	private static int solution(Node root) {
		if(root == null)
			return 0;
		int leftHeight = 0;
		Node temp = root;
		while(temp.left != null) {
			temp = temp.left;
			leftHeight++;
		}
		temp = root;
		int rightHeight = 0;
		while(temp.right != null) {
			temp = temp.right;
			rightHeight++;
		}
		if(leftHeight != 0 && rightHeight != 0 && leftHeight == rightHeight)
			return (int)Math.pow(2, leftHeight)+1;
		return solution(root.left) + solution(root.right) + 1;
	}
	
	public static void main(String[] args) {
		TreeFromInorderAndPostorder object = new TreeFromInorderAndPostorder();
		int inOrder[] = {80,40,90,20,100,50,10,60,30,70};
		int postOrder[] = {80,90,40,100,50,20,60,70,30,10};
		Node tree = object.buildTree(inOrder, postOrder, 10);
		System.out.println("Total number of nodes in complete binary tree is "+ solution(tree));
	}

}
