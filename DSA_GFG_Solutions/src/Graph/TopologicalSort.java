package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TopologicalSort {

	static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int indegrees[] = new int[V];
        for(int i=0;i<adj.size();i++)
            for(int j=0;j<adj.get(i).size();j++)
                indegrees[adj.get(i).get(j)]++;
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        int result[] = new int[V];
        int k = 0;
        for(int i=0;i<V;i++){
            if(indegrees[i] == 0)
                queue.add(i);
        }
        while(!queue.isEmpty()){
            int i = queue.poll();
            for(int j=0;j<adj.get(i).size();j++){
                indegrees[adj.get(i).get(j)]--;
                if(indegrees[adj.get(i).get(j)] == 0)
                    queue.add(adj.get(i).get(j));
            }
            result[k] = i;
            k++;
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("Topological sort");
	}

}
