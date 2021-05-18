package Array;

public class MaximumIndex {

	static int maxIndexDiff(int arr[], int n) { 
        if(n == 0)
            return 0;
        int LeftMin[] = new int[n];
        int RightMax[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(arr[i],min);
            LeftMin[i] = min;
        }
        for(int i=n-1;i>=0;i--){
            max = Math.max(arr[i],max);
            RightMax[i] = max;
        }
        int i=0;
        int j=0;
        int maxDiff = 0;
        while(i < n && j < n){
            if(RightMax[j] >= LeftMin[i]){
                maxDiff = Math.max(maxDiff,j-i);
                j++;
            }else
                i++;
        }
        return maxDiff;
    }
	
	public static void main(String[] args) {
		int arr[] = {34,8,10,3, 2, 80, 30, 33, 1};
		System.out.println(maxIndexDiff(arr,9));
	}

}
