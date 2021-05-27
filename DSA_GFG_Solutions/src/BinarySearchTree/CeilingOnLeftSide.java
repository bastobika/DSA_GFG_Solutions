package BinarySearchTree;
import java.util.TreeSet;

public class CeilingOnLeftSide {

	private static void solution(int arr[]) {
		TreeSet<Integer> set = new TreeSet<Integer>();   //Self Balancing BST - Maintains a running set of sorted elements
		for(int i=0;i<arr.length;i++) {
			if(set.ceiling(arr[i]) == null)
				System.out.print(-1 + " ");
			else
				System.out.print(set.ceiling(arr[i]) + " ");
			set.add(arr[i]);	
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,8,30,15,25,12};
		solution(arr);
	}

}