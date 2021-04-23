package Tree;

import java.util.HashMap;

public class TreeFromInorderAndPostorder {

	class Node {
	    int data;
	    Node left;
	    Node right;

	    Node(int value) {
	        data = value;
	        left = null;
	        right = null;
	    }
	}
	
	private int index;
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    Node buildTree(int in[], int post[], int n) {
        if(n == 0)
            return null;
        for(int i=0;i<n;i++)
            this.map.put(in[i],i);
        this.index = n;
        int start = 0;
        int end = n-1;
        return build(post,start,end,n);
    }
    
    Node build(int post[],int start,int end,int n){
        if(start > end || this.index < 0)
            return null;
        this.index--;
        Node root = new Node(post[this.index]);
        int indexOfRoot = this.map.get(post[this.index]);
        root.right = build(post,indexOfRoot+1,end,n);
        root.left = build(post,start,indexOfRoot-1,n);
        return root;
    }
    
	public static void main(String[] args) {
		System.out.println("Tree from Inorder and Postorder ");
	}

}
