package Tree;

import java.util.ArrayList;
import java.util.HashMap;

public class BinaryTreeFromParentArray {

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
	
	private static HashMap<Integer,ArrayList<Integer>> map;

    public static Node createTree(int parent[], int N){
        map = new HashMap<Integer,ArrayList<Integer>>();
        ArrayList<Integer> temp;
        for(int i=0;i<N;i++){
            if(!map.containsKey(parent[i])){
               temp = new ArrayList<Integer>();
               temp.add(i);
               map.put(parent[i],temp);
            }else
                map.get(parent[i]).add(i);
        }
        return create(-1);
    }
    
    public static Node create(int index){
        Node root = null;
        if(map.isEmpty())
            return root;
        if(map.containsKey(index) && map.get(index).size() > 0){
        	BinaryTreeFromParentArray bt = new BinaryTreeFromParentArray();
            root = bt.new Node(map.get(index).get(0));
            map.get(index).remove(0);
            if(map.get(index).size() == 0)
                map.remove(index);
        }
        if(root != null){
            root.left = create(root.data);
            root.right = create(root.data);
        }
        return root;
    }
    
	public static void main(String[] args) {
		int[] parent = {-1,0,0,1,1,3,5};
		System.out.println("Binary Tree from Parent Array " + createTree(parent,7));
	}

}
