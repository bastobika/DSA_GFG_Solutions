package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class BFSTraversal {

	//BFS of connected directed graph
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        boolean visited[] = new boolean[V];
        queue.add(0);
        while(!queue.isEmpty()){
            int element = queue.poll();
            for(int i=0;i<adj.get(element).size();i++){
                int vertex = adj.get(element).get(i);
                if(!visited[vertex]){
                    queue.add(vertex);
                    visited[vertex] = true;
                }
            }
            result.add(element);
        }
        return result;
    }
    
	public static void main(String[] args) {
		System.out.println("BFS of Directed Connected Graph");
	}

}
