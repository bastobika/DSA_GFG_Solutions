package BinarySearchTree;

import BinarySearchTree.InsertNodeInABST.Node;
import BinarySearchTree.InsertNodeInABST;

public class KthSmallestElement {

	private static int height(Node root,int k) {
		if(root == null)
			return 0;
		int left = height(root.left,k);
		if(left+1 == k) 
			System.out.println(root.data);
		int right = height(root.right,k-left-1);
		return Math.max(left, right)+1;
	}
	
	public static void main(String[] args) {
		Node tree = null;
		tree = InsertNodeInABST.insert(tree, 10);
		tree = InsertNodeInABST.insert(tree, 5);
		tree = InsertNodeInABST.insert(tree, 15);
		tree = InsertNodeInABST.insert(tree, 20);
		tree = InsertNodeInABST.insert(tree, 2);
		height(tree,5);
	}

}
