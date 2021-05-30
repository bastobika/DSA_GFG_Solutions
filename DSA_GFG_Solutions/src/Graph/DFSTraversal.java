package Graph;

import java.util.ArrayList;

public class DFSTraversal {

	//DFS traversal of undirected graph
	public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<V;i++){
            if(!visited[i])
                result.addAll(dfs(i,adj,visited));
        }
        return result;
    }
    
    private ArrayList<Integer> dfs(int i, ArrayList<ArrayList<Integer>> adj,boolean visited[]) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(i);
        visited[i] = true;
        for(int j=0;j<adj.get(i).size();j++){
            int element = adj.get(i).get(j);
            if(!visited[element])
                temp.addAll(dfs(element,adj,visited));
        }
        return temp;
    } 
    
    public static void main(String[] args) {
		System.out.println("DFS of Undirected Graph");
	}
    
}
