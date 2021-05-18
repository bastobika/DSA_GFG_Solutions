package Searching;

public class MaxWaterBetweenTwoBuildings {

	static int maxWater(int arr[], int n) { 
        int low = 0;
        int high = n-1;
        int area = 0;
        while(low < high){
            int minHeight = Math.min(arr[low],arr[high]);
            area = Math.max(area,minHeight*(high-low-1));
            if(minHeight == arr[low])
                low++;
            else
                high--;
        }
        return area;
    } 
	
	public static void main(String[] args) {
		int arr[] = {2,1,3,4,6,5};
		System.out.println(maxWater(arr,6));
	}

}
