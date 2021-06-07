package Greedy;

import java.util.Arrays;

public class NMeetingsInARoom {

	static class Pair implements Comparable<Pair>{
        int start;
        int end;
        
        Pair(int start,int end) {
            this.start = start;
            this.end = end;
        }
        
        public int compareTo(Pair p){
            if(p.end > this.end)
                return -1;
            return 1;
        }
    }
    
    public static int maxMeetings(int start[], int end[], int n) {
        Pair array[] = new Pair[n];
        for(int i=0;i<n;i++)
            array[i] = new Pair(start[i],end[i]);
        Arrays.sort(array);
        int meetings = 1;
        int endTime = array[0].end;
        for(int i=1;i<n;i++){
            if(array[i].start > endTime){
                meetings++;
                endTime = array[i].end;
            }
        }
        return meetings;
    }
    
	public static void main(String[] args) {
		int S[] = {75250, 50074, 43659, 8931, 11273,27545, 50879, 77924};
		int F[] = {112960, 114515, 81825, 93424, 54316,35533, 73383, 160252};
		System.out.println(maxMeetings(S,F,8));
	}

}
