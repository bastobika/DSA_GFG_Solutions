package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LevelOfNodes {

	class Pair {
        int value;
        int level;
        
        Pair(int value,int level) {
            this.value = value;
            this.level = level;
        }
    }
    
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X) {
        boolean visited[] = new boolean[V];
        ArrayDeque<Pair> queue = new ArrayDeque<Pair>();
        queue.add(new Pair(0,0));
        visited[0] = true;
        while(!queue.isEmpty()){
            Pair element = queue.poll();
            int j = element.value;
            if(j == X)
                return element.level;
            for(int i=0;i<adj.get(j).size();i++){
                if(!visited[adj.get(j).get(i)]){
                    queue.add(new Pair(adj.get(j).get(i),element.level+1));
                    visited[adj.get(j).get(i)] = true;
                }
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {
		System.out.println("Level of nodes");
	}

}
