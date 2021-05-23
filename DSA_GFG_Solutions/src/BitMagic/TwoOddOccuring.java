package BitMagic;

public class TwoOddOccuring {

	private static void solution(int arr[]) {
		int xorResult = 0;
		for(int i=0;i<arr.length;i++)
			xorResult = xorResult^arr[i];
		int n = xorResult;
		int count = 1;
        while(n > 0){
        	if((n & 1) == 1)
                break;
            count = count << 1;
            n = n >> 1;
        }
        
        // n & ~(n-1) - First Set Bit in O(1)
        
        int a = xorResult;
        int b = xorResult;
        for(int i=0;i<arr.length;i++)
        	if((count & arr[i]) == 0)
        		a = a^ arr[i];
        	else
        		b = b^arr[i];
        System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		int arr[] = {3,5,4,4,3,7,7,6,9,9,9,9};
		solution(arr);
	}

}
