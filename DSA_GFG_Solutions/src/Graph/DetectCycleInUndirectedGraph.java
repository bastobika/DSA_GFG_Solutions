package Graph;

import java.util.ArrayList;

public class DetectCycleInUndirectedGraph {

	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i])
                if(dfs(i,adj,visited,i))
                    return true;
        }
        return false;
    }
    
    private boolean dfs(int i, ArrayList<ArrayList<Integer>> adj,boolean visited[],int parent) {
        visited[i] = true;
        for(int j=0;j<adj.get(i).size();j++){
            int element = adj.get(i).get(j);
            if(!visited[element]){
                if(dfs(element,adj,visited,i))
                    return true;
            }else 
                if(element != parent)
                    return true;
        }
        return false;
    }
    
	public static void main(String[] args) {
		System.out.println("Detect cycle in undirected graph");
	}

}
