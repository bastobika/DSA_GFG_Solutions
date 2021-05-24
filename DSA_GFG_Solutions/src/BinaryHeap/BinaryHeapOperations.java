package BinaryHeap;

public class BinaryHeapOperations {

	int[] harr;
    int capacity; 
    int heap_size;
    
    BinaryHeapOperations(int cap) {
        heap_size = 0;
        capacity = cap;
        harr = new int[cap];
    }
    
    int parent(int i) { return (i - 1) / 2; }
    int left(int i) { return (2 * i + 1); }
    int right(int i) { return (2 * i + 2); }

    //Function to extract minimum value in heap and then to store 
    //next minimum value at first index.
    int extractMin() {
        if(this.heap_size == 0)
            return -1;
        int temp = harr[0];
        harr[0] = harr[this.heap_size-1];
        harr[this.heap_size-1] = temp;
        int element = harr[this.heap_size-1];
        harr[this.heap_size-1] = 0;
        this.heap_size--; 
        MinHeapify(0);
        return element;
    }

    //Function to insert a value in Heap.
    void insertKey(int k) {
        if(this.heap_size < this.capacity){
            this.heap_size++;
            harr[this.heap_size-1] = k;
            int i = heap_size-1;
            while(i > 0 && harr[i] < harr[parent(i)]){
                harr[i] = harr[i] + harr[parent(i)];
                harr[parent(i)] = harr[i] - harr[parent(i)];
                harr[i] = harr[i] - harr[parent(i)];
                i = parent(i);
            }
        }
    }

    //Function to delete a key at ith index.
    void deleteKey(int i) {
        if(i >= this.heap_size)
            return;
        decreaseKey(i,Integer.MIN_VALUE);
        extractMin();
    }

    //Function to change value at ith index and store that value at first index.
    void decreaseKey(int i, int new_val) 
    {
        harr[i] = new_val;
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }

    /* You may call below MinHeapify function in
      above codes. Please do not delete this code
      if you are not writing your own MinHeapify */
    void MinHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l] < harr[i]) smallest = l;
        if (r < heap_size && harr[r] < harr[smallest]) smallest = r;
        if (smallest != i) {
            int temp = harr[i];
            harr[i] = harr[smallest];
            harr[smallest] = temp;
            MinHeapify(smallest);
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Binary Heap Operations");
	}

}
