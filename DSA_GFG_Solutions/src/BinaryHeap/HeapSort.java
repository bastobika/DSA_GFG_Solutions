package BinaryHeap;

public class HeapSort {

	//Function to build a Heap from array.
    static void buildMaxHeap(int arr[], int n) {
        for(int i=(int)Math.floor((n-2)/2);i>=0;i--) 
            maxHeapify(arr,n,i);
    }
 
    //Heapify function to maintain heap property.
    static void maxHeapify(int arr[], int n, int i) {
        while(i < n) {
            int left = 2*i+1;
            int right = 2*i+2;
            int largest = left < n ? (arr[i] > arr[left] ? i : left) : i;
            largest = right < n ? (arr[largest] > arr[right] ? largest : right) : largest;
            if(largest != i){
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                i = largest;
            }else
                break;
        }
    }
    
    static int extractMax(int arr[],int n) {
        int element = arr[0];
        arr[0] = arr[n];
        maxHeapify(arr,n,0);
        return element;
    }
    
    //Function to sort an array using Heap Sort.
    public static void heapSort(int arr[], int n) {
        buildMaxHeap(arr,n);
        for(int i=n-1;i>=0;i--)
            arr[i] = extractMax(arr,i);
        for(int i=0;i<n;i++)
        	System.out.print(arr[i] + " ");
    }
    
	public static void main(String[] args) {
		int arr[] = {4,2,5,1,6};
		heapSort(arr,5);
	}

}
