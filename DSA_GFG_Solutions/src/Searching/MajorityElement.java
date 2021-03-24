package Searching;

public class MajorityElement {

	static int majorityElement(int a[], int size) {
        //Getting Maximum Element
        int count = 0; int majorityElement = 0;
        for(int i=0;i<size;i++){
            if(count == 0){
                majorityElement = a[i];
                count++;
                continue;
            }
            if(a[i] == majorityElement)
                count++;
            else
                count--;
        }
        //Counting occurence of Maximum Element
        count = 0;
        for(int i=0;i<size;i++)
            if(a[i] == majorityElement)
                count++;
        if(count > size/2)
            return majorityElement;
        return -1;
    }
	
	public static void main(String[] args) {
		int[] arr = {3,1,3,3,2};
		System.out.println(majorityElement(arr,5));
	}

}
