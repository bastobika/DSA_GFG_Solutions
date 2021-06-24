package BackTracking;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {

	static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B){
        Collections.sort(A);
        return findSum(A,B,0,new ArrayList<Integer>());
    }
    
    static private ArrayList<ArrayList<Integer>> findSum(ArrayList<Integer> A,int target,int index,ArrayList<Integer> curr){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(target < 0)
            return result;
        if(target == 0){
            result.add(new ArrayList(curr));
            return result;
        }
        int prev = 0;
        for(int i=index;i<A.size();i++){
            if(prev != A.get(i)){
                curr.add(A.get(i));
                prev = A.get(i);
                result.addAll(findSum(A,target-A.get(i),i,curr));
                curr.remove(curr.size()-1);
            }
        }
        return result;
    }
    
	public static void main(String[] args) {
		System.out.println("Unique combinations that lead to given sum");
	}

}
