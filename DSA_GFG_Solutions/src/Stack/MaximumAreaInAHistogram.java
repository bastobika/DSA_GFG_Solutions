package Stack;

import java.util.ArrayDeque;

public class MaximumAreaInAHistogram {

	public static long getMaxArea(long hist[], long n) {
        long maxArea = 0;
        long prevSmall = 0; 
        long nextSmall = n;
        long val = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && hist[stack.peek()] > hist[i]){
                val = hist[stack.pop()];
                if(!stack.isEmpty())
                    prevSmall = stack.peek();
                else
                    prevSmall = -1;
                nextSmall = i;
                maxArea = Math.max(maxArea,(nextSmall - prevSmall - 1)*val);
            }
            stack.push(i);
        }
        nextSmall = n;
        while(!stack.isEmpty()){
            val = hist[stack.pop()];
                if(!stack.isEmpty())
                    prevSmall = stack.peek();
                else
                    prevSmall = -1;
            maxArea = Math.max(maxArea,(nextSmall - prevSmall - 1)*val);
        }
        return maxArea;
    }
	public static void main(String[] args) {
		long arr[]= {6,2,5,4,5,1,6};
		System.out.println(getMaxArea(arr,7));
 	}

}
