package Queue;

public class CircularTour {

	static int tour(int petrol[], int distance[]) {
        int prevPetrolSum = 0;
        int currPetrolSum = 0;
        int prevDistSum = 0;
        int currDistSum = 0;
        int result = -1;
        boolean flag = false;
	    for(int i=0;i<petrol.length;i++){
	        currPetrolSum += petrol[i];
	        currDistSum += distance[i];
	        if(currPetrolSum < currDistSum){
	            prevPetrolSum += currPetrolSum;
	            prevDistSum += currDistSum;
	            currPetrolSum = 0;
	            currDistSum = 0;
	            result = -1;
	            flag = false;
	        }else
	            if(flag == false){
	                result = i;
	                flag = true;
	            }
	    }
	    if(flag == true)
	        if(currPetrolSum + prevPetrolSum < currDistSum + prevDistSum)
	            result = -1;
	    return result;
    }
	
	public static void main(String[] args) {
		int[] petrol = {4,6,7,4};
		int[] distance = {6,5,3,5};
		System.out.println(tour(petrol,distance));
	}

}
