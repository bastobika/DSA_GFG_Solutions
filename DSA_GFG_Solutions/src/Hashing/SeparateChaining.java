package Hashing;

import java.util.ArrayList;

public class SeparateChaining {

	public static ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)  {
        //Your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<hashSize;i++)
        		result.add(new ArrayList<Integer>());
        for(int i=0;i<n;i++)
            result.get(arr[i]%hashSize).add(arr[i]);
        return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {12,45,36,87,11,42,51};
		ArrayList<ArrayList<Integer>> result = separateChaining(arr,7,10);
		for(int i=0;i<result.size();i++) {
			for(int j=0;j<result.get(i).size();j++) 
				System.out.print(result.get(i).get(j)+" ");
			System.out.println();
		}
	}

}
