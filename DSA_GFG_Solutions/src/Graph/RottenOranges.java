package Graph;

import java.util.ArrayDeque;

public class RottenOranges {

	class Point {
        int i;
        int j;
        int time;
        
        Point(int i,int j,int time){
            this.i = i;
            this.j = j;
            this.time = time;
        }
    }
    
    //Function to find minimum time required to rot all oranges. 
    public static int orangesRotting(int[][] grid) {
        int maxTime = 0;
        int rottenOranges = 0;
        int goodOranges = 0;
        int row = grid.length;
        int col = grid[0].length;
        boolean visited[][] = new boolean[row][col];
        RottenOranges object = new RottenOranges();
        ArrayDeque<Point> queue = new ArrayDeque<Point>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 2)
                    queue.add(object.new Point(i,j,0));
                if(grid[i][j] == 1)
                    goodOranges++;
            }
        }
        int x[] = {-1,0,0,1};
        int y[] = {0,-1,1,0};
        while(!queue.isEmpty()){
            Point element = queue.poll();
            int i = element.i;
            int j = element.j;
            for(int k=0;k<4;k++){
                if(safeCell(i+x[k],j+y[k],visited,grid)){
                    rottenOranges++;
                    visited[i+x[k]][j+y[k]] = true;
                    queue.add(object.new Point(i+x[k],j+y[k],element.time+1));
                    maxTime = element.time+1;
                }
            }
        }
        return goodOranges == rottenOranges ? maxTime : -1;
    }
    
    private static boolean safeCell(int i,int j,boolean visited[][],int grid[][]){
        int row = grid.length;
        int col = grid[0].length;
        return i >= 0 && i < row && j >= 0 && j < col && !visited[i][j] && grid[i][j] == 1;
    }
    
	public static void main(String[] args) {
		int grid[][] = {{0,1,2},{0,1,2},{2,1,1}};
		System.out.println(orangesRotting(grid));
	}

}
