package Graph;

import java.util.ArrayList;

public class PrintAdjacencyList {

	public ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp;
        for(int i=0;i<V;i++){
            temp = new ArrayList<Integer>();
            temp.add(i);
            temp.addAll(adj.get(i));
            result.add(temp);
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("Print adjacency list");
	}

}
