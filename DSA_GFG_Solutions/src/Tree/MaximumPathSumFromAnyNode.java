package Tree;

import Tree.CheckSubtree.Node;

public class MaximumPathSumFromAnyNode {

	int maxSum;
	
	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=null;
	        right=null;
	    }
	}
	
	int findMaxSum(Node root) {
        this.maxSum = Integer.MIN_VALUE;
        findMax(root);
        return this.maxSum;
    }
    
    private int findMax(Node root) {
        if(root == null)
            return 0;
        int left = findMax(root.left);
        int right = findMax(root.right);
        
        //Considering root + any one side of it(maximum) or root alone and some ancestors of root are present in the maximum path
        int maxSingleSide = Math.max(root.data,root.data+Math.max(left,right));
        
        //Considering that the root is included in the maximum path and no other ancestor of root are present in the maximum path
        int maxBothSide = Math.max(maxSingleSide,root.data+left+right);
        
        //Updating the maxSum 
        this.maxSum = Math.max(maxSum,Math.max(maxSingleSide,maxBothSide));
        
        //Returning only single side because if ancestors are present in maximum path then it does not need to know maxBothSide
        return maxSingleSide;
    }
    
	public static void main(String[] args) {
		System.out.println("Maximum Path Sum From Any Node");
	}

}
