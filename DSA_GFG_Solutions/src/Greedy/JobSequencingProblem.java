package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {

	class Job {
		int id,deadline,profit;
		
		Job(int x,int y, int z) {
			this.id = x;
			this.deadline = y;
			this.profit = z;
		}
	}
	
	class MyComparator implements Comparator<Job> {
        
        @Override
        public int compare(Job j1,Job j2){
            return j2.profit - j1.profit;
        }
    }
    
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr,new MyComparator());
        int maxDeadline = 0;
        for(int i=0;i<n;i++)
            maxDeadline = Math.max(arr[i].deadline,maxDeadline);
        boolean deadline[] = new boolean[maxDeadline];
        int profit = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline-1;j>=0;j--){
                if(!deadline[j]){
                    deadline[j] = true;
                    profit += arr[i].profit;
                    count++;
                    break;
                }
            }
        }
        int result[] = new int[2];
        result[0] = count;
        result[1] = profit;
        return result;
    }
    
	public static void main(String[] args) {
		System.out.println("Job sequencing problem");
	}

}
