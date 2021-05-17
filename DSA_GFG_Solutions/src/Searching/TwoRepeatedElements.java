package Searching;

public class TwoRepeatedElements {

	public static void twoRepeated(int arr[], int N) {
		int first = 0;
		int second = 0;
        for(int i=0;i<N+2;i++){
            int index = arr[i]%(N+1);
            if(arr[index-1] > N){
                second = first == 0 ? 0 : index;
                first = first == 0 ? index : first;
            }
            arr[index-1] += N+1;
            arr[i] -= index;
        }
        System.out.println(first + " " + second);
    }
	
	public static void main(String[] args) {
		int arr[] = {1,2,1,3,4,3};
		twoRepeated(arr,4);
	}

}
