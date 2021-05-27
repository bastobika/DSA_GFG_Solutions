package Tree;

public class MaxSumOfNonAdjacentNodes {

	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=null;
	        right=null;
	    }
	}
	
	static class Pair {
        
        int sumIncRoot;
        int sumExcRoot;
        
        Pair(int including,int excluding) {
            this.sumIncRoot = including;
            this.sumExcRoot = excluding;
        }
        
    }
    
    //Function to return the maximum sum of non-adjacent nodes.
    static int getMaxSum(Node root) {
        Pair pair = getMax(root);
        return Math.max(pair.sumIncRoot,pair.sumExcRoot);
    }
    
    private static Pair getMax(Node root) {
        if(root == null)
            return new Pair(0,0);
        Pair rightPair = getMax(root.right);
        Pair leftPair = getMax(root.left);
        int includingRoot = rightPair.sumExcRoot+leftPair.sumExcRoot+root.data;
        int excludingRoot = Math.max(rightPair.sumIncRoot,rightPair.sumExcRoot) + 
                            Math.max(leftPair.sumIncRoot,leftPair.sumExcRoot);
        return new Pair(includingRoot,excludingRoot);
    }
    
	public static void main(String[] args) {
		System.out.println("Max Sum Of Non Adjacent Nodes");
	}

}
