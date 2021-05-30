package Graph;

import java.util.ArrayList;

public class MotherVertex {

	public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj) {
        for(int i=0;i<V;i++){
            boolean visited[] = new boolean[V];  
            if(dfs(i,adj,visited) == V)
                return i;
        }
        return -1;
    }
    
    private int dfs(int i, ArrayList<ArrayList<Integer>> adj,boolean visited[]) {
        visited[i] = true;
        int count = 1;
        for(int j=0;j<adj.get(i).size();j++){
            int element = adj.get(i).get(j);
            if(!visited[element])
                count += dfs(element,adj,visited);
        }
        return count;
    } 
    
	public static void main(String[] args) {
		System.out.println("Mother Vertex");
	}

}
