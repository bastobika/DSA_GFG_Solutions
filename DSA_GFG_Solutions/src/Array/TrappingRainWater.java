package Array;

import java.util.ArrayDeque;

public class TrappingRainWater {

	static int trappingWater(int arr[], int n) { 
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        int totalWater = 0;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                int element = stack.pop();
                if(!stack.isEmpty())
                    totalWater += (Math.min(arr[i],arr[stack.peek()])-arr[element])*(i-stack.peek()-1);
            }
            stack.push(i);
        }
        return totalWater;
    } 
	
	public static void main(String[] args) {
		int arr[] = {7,4,0,9};
		System.out.println(trappingWater(arr,4));
	}

}
