package Graph;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {

	public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,adj,visited,new boolean[V]))
                    return true;
            }
        }
        return false;
    }
    
    private boolean dfs(int i, ArrayList<ArrayList<Integer>> adj,boolean visited[],boolean stack[]) {
        visited[i] = true;
        stack[i] = true;
        for(int j=0;j<adj.get(i).size();j++){
            if(stack[adj.get(i).get(j)])
                return true;
            else if(!visited[adj.get(i).get(j)] && dfs(adj.get(i).get(j),adj,visited,stack))
                return true;
        }
        stack[i] = false;
        return false;
    }
    
	public static void main(String[] args) {
		System.out.println("Detect cycle in a directed graph");
	}

}
