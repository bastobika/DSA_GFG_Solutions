package Matrix;

public class SearchInARowColumnSortedMatrix {

	static boolean search(int matrix[][], int n, int m, int x) {  
	    int row = 0;
	    int col = m-1;
	    while(row < n && col >= 0){
	        if(x > matrix[row][col])
	            row++;
	        else if(x < matrix[row][col])
	            col--;
	        else
	            return true;
	    }
	    return false;
	} 
	
	public static void main(String[] args) {
		int matrix[][] = {{ 3, 30, 38},
	              {36, 43, 60},
	              {40, 51, 69}};
		System.out.println(search(matrix,3,3,62));
	}

}
