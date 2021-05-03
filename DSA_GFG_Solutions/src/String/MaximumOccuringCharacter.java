package String;

public class MaximumOccuringCharacter {

	public static char getMaxOccuringChar(String data) {
        int arr[] = new int[256];
        char max = data.charAt(0);
        int maxFreq = 0;
        for(int i=0;i<data.length();i++){
            arr[data.charAt(i)]++;
            if(arr[data.charAt(i)] > maxFreq)
                max = data.charAt(i);
            else if(arr[data.charAt(i)] == maxFreq)
                max = max > data.charAt(i) ? data.charAt(i) : max;
            maxFreq = Math.max(arr[data.charAt(i)],maxFreq);
        }
        return max;
    }
	
	public static void main(String[] args) {
		System.out.println(getMaxOccuringChar("testcase"));
	}

}
