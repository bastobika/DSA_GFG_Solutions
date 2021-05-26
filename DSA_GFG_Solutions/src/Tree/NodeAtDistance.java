package Tree;

import java.util.ArrayList;
import java.util.HashSet;

public class NodeAtDistance {

	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=null;
	        right=null;
	    }
	}
	
	HashSet<Node> set = new HashSet<Node>();
    
    //Function to return count of nodes at a given distance from leaf nodes.
    int printKDistantfromLeaf(Node root, int k) {
        set.clear();    
        ArrayList<Node> ancestors = new ArrayList<Node>();
        findDistinctNodesFromLeaf(root,k,ancestors);
        return set.size();
    }
    
    //You can take ancestors as class variables too
    private void findDistinctNodesFromLeaf(Node root,int k,ArrayList<Node> ancestors) {
        if(root == null)
            return;
        ancestors.add(root);
        findDistinctNodesFromLeaf(root.left,k,ancestors);
        findDistinctNodesFromLeaf(root.right,k,ancestors);
        if(root.left == null && root.right == null && ancestors.indexOf(root) >= k)
            set.add(ancestors.get(ancestors.indexOf(root)-k));
        ancestors.remove(root);
    }
    
	public static void main(String[] args) {
		System.out.println("Node at distance k");
	}

}
