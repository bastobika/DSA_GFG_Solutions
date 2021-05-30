package Graph;

import java.util.ArrayDeque;

public class StepsByKnight {

	class Point {
        int i;
        int j;
        int distance;
        
        Point(int i,int j,int distance){
            this.i = i;
            this.j = j;
            this.distance = distance;
        }
    }
    
    //Function to find out minimum steps Knight needs to reach target position.
    public static int minStepToReachTarget(int KnightPos[], int TargetPos[], int N) {
        boolean visited[][] = new boolean[N+1][N+1];
        StepsByKnight object = new StepsByKnight();
        ArrayDeque<Point> queue = new ArrayDeque<Point>();
        queue.add(object.new Point(KnightPos[1],KnightPos[0],0));
        int x[] = {2,2,-2,-2,-1,-1,1,1};
        int y[] = {-1,1,-1,1,-2,2,-2,2};
        while(!queue.isEmpty()){
            Point element = queue.poll();
            int i = element.i;
            int j = element.j;
            if(i == TargetPos[1] && j == TargetPos[0])
                return element.distance;
            for(int k=0;k<8;k++){
                if(isViable(i+x[k],j+y[k],N,visited)){
                    visited[i+x[k]][j+y[k]] = true;
                    queue.add(object.new Point(i+x[k],j+y[k],element.distance+1));
                }
            }
        }
        return 0;
    }
    
    private static boolean isViable(int x,int y,int N,boolean visited[][]){
        return x >= 1 && x <= N && y >= 1 && y <= N && !visited[x][y];
    }
    
	public static void main(String[] args) {
		int knightPos[] = {4, 5};
		int targetPos[] = {1, 1};
		System.out.println(minStepToReachTarget(knightPos,targetPos,6));
	}

}
