package Graph;

public class FindWhetherPathExists {

	public static boolean is_Possible(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean visited[][] = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1)
                    return dfs(grid,i,j,visited);
            }
        }
        return false;
    }
    
    private static boolean dfs(int grid[][],int i,int j,boolean visited[][]){
        visited[i][j] = true;
        if(grid[i][j] == 2)
            return true;
        int x[] = {-1,0,0,1};
        int y[] = {0,-1,1,0};
        for(int k=0;k<4;k++){
            if(viablePath(i+x[k],j+y[k],visited,grid))
                if(dfs(grid,i+x[k],j+y[k],visited))
                    return true;
        }
        return false;
    }
    
    private static boolean viablePath(int i,int j,boolean visited[][],int grid[][]){
        int row = grid.length;
        int col = grid[0].length;
        return i >= 0 && i < row && j >= 0 && j < col && !visited[i][j] && (grid[i][j] == 2 ||  grid[i][j] == 3);
    }
    
	public static void main(String[] args) {
		int grid[][] = {{3,0,3,0,0},
							 {3,0,0,0,3},
							 {3,3,3,3,3},
							 {0,2,3,0,0},
							 {3,0,0,1,3}};
		System.out.println(is_Possible(grid));
	}

}
