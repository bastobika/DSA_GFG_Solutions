package Graph;

public class XTotalShapes {

	public static int xShape(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        boolean visited[][] = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!visited[i][j] && grid[i][j] == 'X'){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }
    
     private static void dfs(char grid[][],int i,int j,boolean visited[][]){
        visited[i][j] = true;
        int x[] = {-1,0,0,1};
        int y[] = {0,-1,1,0};
        for(int k=0;k<4;k++){
            if(safeCell(i+x[k],j+y[k],visited,grid))
                dfs(grid,i+x[k],j+y[k],visited);
        }
    }
    
    private static boolean safeCell(int i,int j,boolean visited[][],char grid[][]){
        int row = grid.length;
        int col = grid[0].length;
        return i >= 0 && i < row && j >= 0 && j < col && !visited[i][j] && grid[i][j] == 'X';
    }
    
	public static void main(String[] args) {
		char grid[][] = {{'X','O','X'},{'O','X','O'},{'X','X','X'}};
		System.out.println(xShape(grid));
	}

}
