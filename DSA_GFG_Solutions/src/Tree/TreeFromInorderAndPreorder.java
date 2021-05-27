package Tree;

import java.util.HashMap;
import java.util.Map;
import Tree.Traversals;
import Tree.Traversals.Node;

public class TreeFromInorderAndPreorder {
	
	static Map<Integer,Integer> inOrderMap = new HashMap<Integer,Integer>();
	static int index;
	
	private static Node constructTree(int inorder[],int preorder[],int n) {
		for(int i=0;i<n;i++)
			inOrderMap.put(inorder[i],i);
		index = 0;
		return construct(preorder,0,n-1);
	}
	
	private static Node construct(int[] preorder, int begin,int end) {
		if(begin > end)
			return null;
		Traversals object = new Traversals();
		int element = preorder[index];
		index++;
		Node root = object.new Node(element);
		root.left = construct(preorder,begin,inOrderMap.get(element)-1);
		root.right = construct(preorder,inOrderMap.get(element)+1,end);
		return root;
	}

	public static void main(String[] args) {
		int inOrder[] = {40,20,50,10,30,80,70,90};
		int preOrder[] = {10,20,40,50,30,70,80,90};
		Node tree = constructTree(inOrder,preOrder,8);
		System.out.println("Postorder Traversal : " + Traversals.postOrder(tree));
	}
 
}
