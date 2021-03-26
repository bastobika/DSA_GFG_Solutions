package Array;

public class Majority {

	public static int majorityWins(int arr[], int n, int x, int y) {
        int countX = 0; int countY = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == x)
                countX++;
            if(arr[i] == y)
                countY++;
        }
        if(countX == countY)
            return x > y ? y : x;
        return countX > countY ? x : y;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,4,4,4,5};
		System.out.println(majorityWins(arr,11,4,5));
	}

}
