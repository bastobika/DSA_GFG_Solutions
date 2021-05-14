package Recursion;

import java.util.ArrayList;

public class PowerSetUsingRecursion {

	static ArrayList<String> powerSet(String s){
        ArrayList<String> result = new ArrayList<String>();
        if(s.length() == 0){
            result.add("");
            return result;
        }
        result.addAll(powerSet(s.substring(1)));
        int size = result.size();
        for(int i=0;i<size;i++)
            result.add(s.charAt(0)+result.get(i));
        return result;
    }
	
	public static void main(String[] args) {
		ArrayList<String> result = powerSet("abc");
		for(int i=0;i<result.size();i++)
			System.out.println(result.get(i));
	}

}
