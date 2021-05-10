package Array;

import java.util.ArrayList;

public class MaxAndSecondMax {

	public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]){
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0,-1);
        result.add(1,-1);
        for(int i=0;i<sizeOfArray;i++){
            if(result.get(0) == -1)
                result.add(0,arr[i]);
            else{
                if(result.get(0) > arr[i])
                    result.add(1,Math.max(result.get(1),arr[i]));
                else if(result.get(0) < arr[i]){
                    result.add(1,result.get(0));
                    result.add(0,arr[i]);
                }
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		ArrayList<Integer> result = largestAndSecondLargest(5,arr);
		System.out.println(result.get(0));
		System.out.println(result.get(1));
	}

}
