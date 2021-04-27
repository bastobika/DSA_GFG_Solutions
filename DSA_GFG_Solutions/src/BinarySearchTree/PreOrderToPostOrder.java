package BinarySearchTree;

import java.util.Arrays;

public class PreOrderToPostOrder {
	
	class Node {
	    int data;
	    Node left;
	    Node right;
	    Node(int data) {
	        this.data = data;
	        left=null;
	        right=null;
	    }
	}
	
	
	//Efficient - O(n)
	public static Node constructTree(int pre[], int size) {
	    index = 0;
	    int in[] = new int[size];
	    for(int i=0;i<size;i++)
	        in[i] = pre[i];
	    Arrays.sort(in);
	    return construct(pre,in,0,size-1);
	} 
	
	//Not efficient - O(nLogn)
	private static int index;

	public static Node constructTreeWithSortFunction(int pre[], int size) {
	    index = 0;
	    int in[] = new int[size];
	    for(int i=0;i<size;i++)
	        in[i] = pre[i];
	    Arrays.sort(in);
	    return construct(pre,in,0,size-1);
	} 

	private static Node construct(int pre[],int in[],int low,int high){
	    if(low > high || index >= in.length)
	        return null;
	    PreOrderToPostOrder obj = new PreOrderToPostOrder();
	    Node root = obj.new Node(pre[index]);
	    int indexOfRoot = find(in,pre[index]);
	    index++;
	    root.left = construct(pre,in,low,indexOfRoot-1);
	    root.right = construct(pre,in,indexOfRoot+1,high);
	    return root;
	}

	private static int find(int arr[],int x){
	    for(int i=0;i<arr.length;i++)
	        if(arr[i] == x)
	            return i;
	    return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("PreOrder to PostOrder");
	}

}
