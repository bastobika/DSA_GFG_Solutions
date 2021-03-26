package Array;

public class StrongestNeighbour {

	static void maximumAdjacent(int sizeOfArray, int arr[]){
        for(int i=0;i<sizeOfArray-1;i++)
            System.out.print(Math.max(arr[i],arr[i+1]) + " ");
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,5};
		maximumAdjacent(6,arr);
	}

}
