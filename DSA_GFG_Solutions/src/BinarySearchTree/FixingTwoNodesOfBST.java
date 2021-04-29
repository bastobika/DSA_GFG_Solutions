package BinarySearchTree;

public class FixingTwoNodesOfBST {

	class Node  { 
	     int data; 
	     Node left, right; 

	     public Node(int d)  { 
	         data = d; 
	         left = right = null; 
	     } 
	 }
	
	private static Node one = null;
    private static Node two = null;
    private static Node current = null;
    
    public Node correctBST(Node root) {
        findFaultyNodes(root);
        swapNodes();
        FixingTwoNodesOfBST.one = null;
        FixingTwoNodesOfBST.two = null;
        FixingTwoNodesOfBST.current = null;
        return root;
    }
    
    private void findFaultyNodes(Node root){
        if(root == null)
            return;
        findFaultyNodes(root.left);
        if(FixingTwoNodesOfBST.current != null){
            if(root.data < FixingTwoNodesOfBST.current.data){
                FixingTwoNodesOfBST.one = FixingTwoNodesOfBST.one == null ? FixingTwoNodesOfBST.current : FixingTwoNodesOfBST.one;
                FixingTwoNodesOfBST.two = root;    //to handle edge case where the two problematic nodes are next to each other in inorder traversal
            }
        }
        FixingTwoNodesOfBST.current = root;
        findFaultyNodes(root.right);
    }
    
    private static void swapNodes(){
        if(one != null && two != null){
            int temp = one.data;
            one.data = two.data;
            two.data = temp;
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
