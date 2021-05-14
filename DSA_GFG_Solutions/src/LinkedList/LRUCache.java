package LinkedList;

import java.util.LinkedHashMap;

//Internally linked hashmap uses hashmap and doubly linked list to maintain the order of insertion
public class LRUCache {

	private int cap;
    private LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
    
    //Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap) {
        this.cap = cap;
        this.map.clear();
    }

    //Function to return value corresponding to the key.
    public int get(int key) {
        if(this.map.containsKey(key)){
            int value = this.map.get(key);
            this.map.remove(key);
            this.map.put(key,value);
            return value;
        }
        return -1;
    }

    //Function for storing key-value pair.
    public void set(int key, int value){
        if(this.map.containsKey(key))
        	this.map.remove(key);
        if(this.map.size() == cap)
        	this.map.remove(map.entrySet().iterator().next().getKey());
        this.map.put(key,value);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
