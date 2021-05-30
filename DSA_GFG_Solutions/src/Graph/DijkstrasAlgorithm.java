package Graph;

import java.util.ArrayList;

public class DijkstrasAlgorithm {

	static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        int[] result = new int[V];
        boolean visited[] = new boolean[V];
        for(int j=0;j<V;j++)
            result[j] = Integer.MAX_VALUE;
        result[S] = 0;
        
        //Updating the result for current source with the minimum possible distance
        for(int i=0;i<V;i++){
            visited[S] = true;
            for(int a=0;a<adj.get(S).size();a++){
                int node = adj.get(S).get(a).get(0);
                int weight = adj.get(S).get(a).get(1);
                if(!visited[node])
                    result[node] = Math.min(result[S] + weight,result[node]);
            }
            
            //Greedily choosing the minimum node reachable from current source as the next source
            int min = Integer.MAX_VALUE;
            for(int j=0;j<V;j++){
                if(!visited[j] && min > result[j]){
                    S = j;
                    min = result[j];
                }
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("Dijkstra's Algorithm");
	}

}
