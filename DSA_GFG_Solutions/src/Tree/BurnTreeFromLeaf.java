package Tree;

import Tree.TreeFromInorderAndPostorder;
import Tree.TreeFromInorderAndPostorder.Node;

public class BurnTreeFromLeaf {
	
	static int height;
	
	private static int burnTree(Node root,int leaf) {
		height = 0;
		int k = burn(root,leaf);
		if(k < 0)
			return -1;
		return k+Math.abs(height);
	}
	
	private static int burn(Node root, int leaf) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null) {
			if(root.data == leaf)
				return 1;
			return -1;
		}
		int left = burn(root.left,leaf);
		int right = burn(root.right,leaf);
		if(left < 0 && right < 0)
			return Math.min(left, right)-1;
		if(left == 0  && right == 0)
			return 0;
		height = Math.min(height, left < 0 ? left : right);  //Maximum height of the path which doesn't have the leaf
		height++;
		return left < 0 ? right+1 : left+1;
	}

	public static void main(String[] args) {
		TreeFromInorderAndPostorder object = new TreeFromInorderAndPostorder();
		int inOrder[] = {70,60,40,30,50,20,10};
		int postOrder[] = {70,60,40,50,30,20,10};
		Node tree = object.buildTree(inOrder, postOrder, 7);
		System.out.println("Time Taken To Burn Tree From Leaf "+ burnTree(tree,50));
	}

}
