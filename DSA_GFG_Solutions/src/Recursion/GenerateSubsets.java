package Recursion;

import java.util.ArrayList;

public class GenerateSubsets {

	//Greater than O(n) due to another loop
	private static ArrayList<String> generate(String str) { 
		ArrayList<String> result = new ArrayList<String>();
		if(str.length() == 0) {
			result.add("");
			return result;
		}
		result.addAll(generate(str.substring(1)));
		int size = result.size();
		for(int i=0;i<size;i++) 
			result.add(str.charAt(0) + result.get(i));
		return result;
	}
	
	//Tail Recursive solution - O(n)
	private static ArrayList<String> generateTailRecursive(String str,String current,int i) {
		ArrayList<String> result = new ArrayList<String>();
		if(str.length() == i) {
			result.add(current);
			return result;
		}
		result.addAll(generateTailRecursive(str,current,i+1));
		result.addAll(generateTailRecursive(str,current + str.charAt(i),i+1));
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(generate("ABC"));
		System.out.println(generateTailRecursive("ABC","",0));
	}

}
