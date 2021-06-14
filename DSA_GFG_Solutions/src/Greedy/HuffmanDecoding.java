package Greedy;

public class HuffmanDecoding {

	class MinHeapNode {
        int frequency;
        char data;
        MinHeapNode left,right;
        
        MinHeapNode(int frequency,char c) {
            this.frequency = frequency;
            this.data = c;
        }
    }
	
	static String decodeHuffmanData(MinHeapNode root, String binaryString) {
        String result = "";
        MinHeapNode temp = root;
        for(int i=0;i<binaryString.length();i++){
            if(binaryString.charAt(i) == '1')
                temp = temp.right;
            else
                temp = temp.left;
            if(temp.left == null && temp.right == null){
                result += Character.toString(temp.data);
                temp = root;
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("Huffman Decoding");
	}

}
