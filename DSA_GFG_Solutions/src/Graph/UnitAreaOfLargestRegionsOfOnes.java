package Graph;

public class UnitAreaOfLargestRegionsOfOnes {

	static int maxArea;
    //Function to find unit area of the largest region of 1s.
    public static int findMaxArea(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean visited[][] = new boolean[row][col];
        maxArea = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!visited[i][j] && grid[i][j] == 1)
                    maxArea = Math.max(maxArea,dfs(grid,i,j,visited));
            }
        }
        return maxArea;
    }
    
    private static int dfs(int[][] grid,int i,int j,boolean visited[][]) {
        visited[i][j] = true;
        int x[] = {-1,-1,-1,0,0,1,1,1};
        int y[] = {-1,0,1,-1,1,-1,0,1};
        int area = 1;
        for(int k=0;k<8;k++){
            if(safeCell(i+x[k],j+y[k],visited,grid))
                area += dfs(grid,i+x[k],j+y[k],visited);
        }
        return area;
    }
    
    //To check if a cell is a part of the area or not
    private static boolean safeCell(int i,int j,boolean visited[][],int grid[][]){
        int row = grid.length;
        int col = grid[0].length;
        return i < row && i >= 0 && j < col && j >=0 && !visited[i][j] && grid[i][j] == 1; 
    }
    
	public static void main(String[] args) {
		int grid[][] = {{1,1,1,0},{0,0,1,0},{0,0,0,1}};
		System.out.println(findMaxArea(grid));
	}

}
