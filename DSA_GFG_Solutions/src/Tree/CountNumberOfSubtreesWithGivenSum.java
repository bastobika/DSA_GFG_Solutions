package Tree;

public class CountNumberOfSubtreesWithGivenSum {

	private static int count;
	
	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
    static int countSubtreesWithSumX(Node root, int X) {
        count = 0;
	    count(root,X);
	    return count;
    }
    
    static int count(Node root,int X){
        if(root == null)
            return 0;
        int leftSubtree = count(root.left,X);
        int rightSubtree = count(root.right,X);
        if(root.data + leftSubtree + rightSubtree == X)
        	count++;
        return root.data + leftSubtree + rightSubtree;
    }
    
	public static void main(String[] args) {
		System.out.println("Number of subtrees with given sum is " + countSubtreesWithSumX(null,7));
	}

}
