package Array;

public class MaximumOccuredInteger {

	public static int maxOccured(int L[], int R[], int n){
        int max = 0;
        for(int i=0;i<n;i++)
            max = Math.max(max,R[i]);
        int arr[] = new int[max+1];
        for(int i=0;i<n;i++){
            arr[L[i]] += 1;
            if(R[i] < max) arr[R[i]+1] -= 1;
        }
        int sum = 0;
        int maxElem = 0;
        int maxFreq = 0;
        for(int i=0;i<max+1;i++){
            sum += arr[i];    
            arr[i] = sum;
            if(maxFreq < sum){
                maxElem = i;
                maxFreq = sum;
            }
        }
        return maxElem;
    }
	
	public static void main(String[] args) {
		int L[] = {1,4,3,1};
		int R[] = {15,8,5,4};
		System.out.println(maxOccured(L,R,4));
	}

}
