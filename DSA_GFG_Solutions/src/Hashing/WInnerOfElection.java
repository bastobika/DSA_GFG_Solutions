package Hashing;

import java.util.HashMap;
import java.util.Map;

public class WInnerOfElection {

	public static String[] winner(String arr[], int n) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int maxVotes = 0;
        String name = "";
        String[] result = new String[2];
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxVotes){
                maxVotes = Math.max(maxVotes,entry.getValue());
                name = entry.getKey();
            }else if(entry.getValue() == maxVotes)
                name = name.compareTo(entry.getKey()) > 0 ? entry.getKey() : name;
        }
        result[0] = name;
        result[1] = Integer.toString(maxVotes);
        return result;
    }
	
	public static void main(String[] args) {
		String Votes[] = {"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john","johnny","jamie","johnny","john"};
		System.out.println(winner(Votes,13)[0]);
	}

}
