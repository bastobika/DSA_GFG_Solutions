package BackTracking;

import java.util.ArrayList;
import java.util.Collections;

public class RatInAMaze {

	public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> result = new ArrayList<String>();
        if(m[0][0] == 0)
            return result;
        boolean visited[][] = new boolean[n][n];
        find(m,n,0,0,"",result,visited);
        Collections.sort(result);
        return result;
    }
    
    private static void find(int[][] m,int n,int i,int j,String path,ArrayList<String> result,boolean visited[][]){
        if(i == n-1 && j == n-1){
            result.add(path);
            return;
        }
        visited[i][j] = true;
        int x[] = {-1,1,0,0};
        int y[] = {0,0,-1,1};
        for(int k=0;k<4;k++){
            if(isSafe(m,n,i+x[k],j+y[k],visited)){
                path += path(x[k],y[k]);
                find(m,n,i+x[k],j+y[k],path,result,visited);
                path = path.substring(0,path.length()-1);
            }
        }
        visited[i][j] = false;
    }
    
    private static String path(int x,int y){
        if(x == -1 && y == 0)
            return "U";
        if(x == 1 && y == 0)
            return "D";
        if(x == 0 && y == -1)
            return "L";
        return "R";
    }
    
    private static boolean isSafe(int[][] m,int n,int i,int j,boolean visited[][]){
        if(i >= 0 && i < n && j >= 0 && j < n && !visited[i][j] && m[i][j] == 1)
            return true;
        return false;
    }
    
	public static void main(String[] args) {
		int m[][] = {{1, 0, 0, 0},
		         {1, 1, 0, 1}, 
		         {1, 1, 0, 0},
		         {0, 1, 1, 1}};
		System.out.println(findPath(m,4));
	}

}
