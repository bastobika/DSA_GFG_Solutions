package Graph;

public class FindNumberOfIslands {

	//To find number of islands
	public static int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean visited[][] = new boolean[row][col];
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }
    
	//To traverse all parts of an island
    private static void dfs(char[][] grid,int i,int j,boolean visited[][]) {
        visited[i][j] = true;
        int x[] = {-1,-1,-1,0,0,1,1,1};
        int y[] = {-1,0,1,-1,1,-1,0,1};
        for(int k=0;k<8;k++){
            if(safeCell(i+x[k],j+y[k],visited,grid))
                dfs(grid,i+x[k],j+y[k],visited);
        }
    }
    
    //To check if a cell is a part of the island or not
    private static boolean safeCell(int i,int j,boolean visited[][],char grid[][]){
        int row = grid.length;
        int col = grid[0].length;
        return i < row && i >= 0 && j < col && j >=0 && !visited[i][j] && grid[i][j] == '1'; 
    }
    
	public static void main(String[] args) {
		char grid[][] = {{'0','1'},{'0','0'},{'1','1'},{'1','0'}};
		System.out.println(numIslands(grid));
	}

}
