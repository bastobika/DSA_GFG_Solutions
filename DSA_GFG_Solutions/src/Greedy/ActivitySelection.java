package Greedy;

import java.util.Arrays;

public class ActivitySelection {

	static class Pair implements Comparable<Pair>{
        int start,end;
        
        Pair(int start,int end){
            this.start = start;
            this.end = end;
        }
        
        @Override
        public int compareTo(Pair p){
            return this.end - p.end;
        }
    }
    
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n) {
        Pair pair[] = new Pair[n];
        for(int i=0;i<n;i++)
            pair[i] = new Pair(start[i],end[i]);
        Arrays.sort(pair);
        int count = 1;
        int currEnd = pair[0].end;
        for(int i=1;i<n;i++){
            if(pair[i].start > currEnd){
                count++;
                currEnd = pair[i].end;
            }
        }
        return count;
    }
    
	public static void main(String[] args) {
		int start[] = {1,3,2,5};
		int end[] = {2,4,3,6};
		System.out.println(activitySelection(start,end,4));
	}

}
