package Tree;

public class CheckSubtree {

	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=null;
	        right=null;
	    }
	}
	
	public static boolean isSubtree(Node T, Node S) {
        if(T == null && S == null)
            return true;
        if(T ==  null || S == null)
            return false;
        return (T.data == S.data && isSubtree(T.left,S.left) && isSubtree(T.right,S.right))
                || isSubtree(T.left,S) || isSubtree(T.right,S);
    }
	
	public static void main(String[] args) {
		System.out.println("Check if one tree is subtree of another");

	}

}
