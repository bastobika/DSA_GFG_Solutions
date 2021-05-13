package Searching;

public class RoofTop {

	static int maxStep(int A[], int N){
        int max = 0;
        int step = 0;
        for(int i=1;i<N;i++){
            if(A[i-1] < A[i])
                step++;
            else{
                max = Math.max(max,step);
                step = 0;
            }
        }
        max = Math.max(max,step);
        return max;
    }
	
	public static void main(String[] args) {
		int A[] = {1,2,2,3,2};
		System.out.println(maxStep(A,5));
	}

}
