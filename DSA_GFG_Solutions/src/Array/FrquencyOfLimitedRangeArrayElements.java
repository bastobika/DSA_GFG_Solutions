package Array;

public class FrquencyOfLimitedRangeArrayElements {

	public static void frequencyCount(int arr[], int N, int P){
        int temp = Math.max(N,P) + 1;
        for(int i=0;i<N;i++){
            int element = arr[i]%temp;
            if(element != 0 && element <= N) 
                arr[element-1] = arr[element-1] + temp;
            arr[i] -= element;  
        }
        for(int i=0;i<N;i++)
            arr[i] = arr[i]/temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
