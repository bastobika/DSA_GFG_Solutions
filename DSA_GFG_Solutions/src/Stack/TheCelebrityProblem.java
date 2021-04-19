package Stack;

import java.util.ArrayDeque;

public class TheCelebrityProblem {

	//O(N^2)
	static int celebrityNaive(int M[][], int n){
        int index = 0; 
        boolean flag = false;
    	for(int i=0;i<n;i++){
    	    flag = false;
    	    for(int j=0;j<n;j++)
    	        if(M[i][j] == 1){
    	            flag = true;
    	            break;
    	        }
    	        if(!flag){
    	            index = i;
    	            break;
    	        }
    	       
    	}
    	for(int i=0;i<n;i++)
    	    if(i != index && M[i][index] == 0)
    	        return -1;
    	return index; 
	}
	
	//O(N)
	static int celebrityEfficient(int M[][], int n) {
    	ArrayDeque<Integer> celebs = new ArrayDeque<Integer>();
    	for(int i=0;i<n;i++)
    	    celebs.push(i);
    	while(celebs.size() > 1){
    	    int a = celebs.pop();
    	    int b = celebs.pop();
    	    if(M[a][b] == 1 && M[b][a] != 1)
    	        celebs.push(b);
    	    else if(M[a][b] != 1 && M[b][a] == 1)
    	        celebs.push(a);
    	    //If both not 1,that means both doesn't know each other
    	    //Then neither cannot be the celebrity
    	}
    	int celeb = -1;
    	if(!celebs.isEmpty())
    	    celeb = celebs.pop();
    	boolean allZeros = true;
    	for(int i=0;i<n;i++){
    	    if(i != celeb && M[i][celeb] != 1)
    	        return -1;
    	    if(M[celeb][i] != 0){
    	        allZeros = false;
    	        break;
    	    }
    	}
    	celeb = allZeros ? celeb : -1;
    	return celeb;
    }

	public static void main(String[] args) {
		int[][] M = {{0, 1 , 0},
		         {0, 0 ,0}, 
		         {0, 1 ,0}};
		System.out.println(celebrityEfficient(M,3));
	}

}
