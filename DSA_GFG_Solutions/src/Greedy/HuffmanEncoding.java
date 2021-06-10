package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanEncoding {

	class Node {
        int frequency;
        char c;
        Node left,right;
        
        Node(int frequency,char c) {
            this.frequency = frequency;
            this.c = c;
        }
    }
    
    class MyComparator implements Comparator<Node>{
        
        @Override
        public int compare(Node a,Node b){
            if(a.frequency >= b.frequency)
                return 1;
            return -1;
        }
    }
    
    public static ArrayList<String> huffmanCodes(String S, int f[], int N) {
    	HuffmanEncoding object = new HuffmanEncoding();
        PriorityQueue<Node> pq = new PriorityQueue<Node>(object.new MyComparator());
        for(int i=0;i<N;i++)
            pq.add(object.new Node(f[i],S.charAt(i)));
        Node root = buildTree(pq);
        return encode(root,"");
    }
    
    private static Node buildTree(PriorityQueue<Node> pq){
    	HuffmanEncoding object = new HuffmanEncoding();
        while(pq.size() > 1){
            Node a = pq.poll();
            Node b = pq.poll();
            Node root = object.new Node(a.frequency+b.frequency,'$');
            root.left = a;
            root.right = b;
            pq.add(root);
        }
        return pq.poll();
    }
    
    private static ArrayList<String> encode(Node root,String code){
        ArrayList<String> result = new ArrayList<String>();
        if(root.left == null && root.right == null){
            result.add(code);
            return result;
        }
        result.addAll(encode(root.left,code+"0"));
        result.addAll(encode(root.right,code+"1"));
        return result;
    }
	public static void main(String[] args) {
		int arr[] = {5,3,12,6,9,3};
		System.out.println(huffmanCodes("abcdef",arr,6));
	}

}
