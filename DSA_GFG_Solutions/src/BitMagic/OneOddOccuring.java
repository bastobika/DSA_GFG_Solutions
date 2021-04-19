package BitMagic;

public class OneOddOccuring {

	private static int oddOccuring(int[] arr) {
		int result = 0;
		for(int i=0;i<arr.length;i++)
			result = result ^ arr[i];
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {4,3,5,5,4,4,4};
		System.out.println(oddOccuring(arr));
	}

}
