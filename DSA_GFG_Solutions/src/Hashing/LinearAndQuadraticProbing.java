package Hashing;

public class LinearAndQuadraticProbing {

	static int[] quadraticProbing(int hash_size, int arr[], int N) {
		int[] hash = new int[hash_size];
        for(int i=0;i<hash_size;i++)
            hash[i] = -1;
        for(int i=0;i<N;i++){
            int index = 0;
            while(hash[(arr[i]+(int)Math.pow(index,2))%hash_size] != -1)
                index++;
            hash[(arr[i]+(int)Math.pow(index,2))%hash_size] = arr[i];
        }
        return hash;
    }
	
	static int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        int[] hashTable = new int[hash_size];
        for(int i=0;i<hash_size;i++)
            hashTable[i] = -1;
        for(int i=0;i<sizeOfArray;i++){
            int index = 0;
            while(hashTable[(arr[i]+index)%hash_size] != -1)
                index++;
            hashTable[(arr[i]+index)%hash_size] = arr[i];
        
        }
        return hashTable;
    }
	
	public static void main(String[] args) {
		int[] arr = {21,4,54,11};
		int[] linearProbing = linearProbing(10,arr,4);
		int[] quadraticProbing = quadraticProbing(11,arr,4);
		System.out.println("Linear Probing Result : ");
		for(int i=0;i<10;i++)
			System.out.print(linearProbing[i]+" ");
		System.out.println("\nQuadratic Probing Result : ");
		for(int i=0;i<11;i++)
			System.out.print(quadraticProbing[i]+" ");
	}

}
