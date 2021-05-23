package BitMagic;

public class MaximumANDValue {

	public static int maxAND (int arr[], int N) {
        int result = 0;
        int count = 0;
        for(int i=16;i>=0;i--){
            count = countNumbers(arr,(result | (1 << i)));
            if(count >= 2)
                result = result | (1 << i);
        }
        return result;
    }
    
    private static int countNumbers(int arr[],int pattern) {
        int count = 0;
        for(int i=0;i<arr.length;i++)
            if((arr[i] & pattern) == pattern)
                count++;
        return count;
    }
    
    public static void main(String[] args) {
    	int arr[] = {4,8,12,10};
    	System.out.println(maxAND(arr,4));
    }
}
