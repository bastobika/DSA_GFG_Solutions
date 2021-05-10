package Array;

import java.util.ArrayList;

public class StockBuyAndSell {

	static ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int begin = 0;
        int end = 0;
        for(int i=1;i<n;i++){
            if(arr[end] < arr[i])
                end++;
            else{
                if(begin != end){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(begin);
                    temp.add(end);
                    result.add(temp);
                }
                begin = i;
                end = i;
            }
        }
        if(begin != end){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(begin);
            temp.add(end);
            result.add(temp);
        }
        return result;
    }
	
	public static void main(String[] args) {
		int A[] = {100,180,260,310,40,535,695};
		ArrayList<ArrayList<Integer>> result = stockBuySell(A,7);
		for(int i=0;i<result.size();i++)
			System.out.println(result.get(i).get(0) + " " + result.get(i).get(1));
	}

}
