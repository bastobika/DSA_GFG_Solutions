package Deque;

public class FirstCircularTour {

	private static int point(int petrol[],int distance[],int n) {
		int totalPetrol = 0;
		int totalDistance = 0;
		int cumulativePetrol = 0;
		int cumulativeDistance = 0;
		int begin = 0;
		for(int i=0;i<n;i++) {
			begin = totalPetrol == 0 ? i : begin;
			totalPetrol += petrol[i];
			totalDistance += distance[i];
			if(totalDistance > totalPetrol) {
				cumulativePetrol += totalPetrol;
				cumulativeDistance += totalDistance;
				totalPetrol = 0;
				totalDistance = 0;
			}
		}
		if(cumulativePetrol + totalPetrol >= cumulativeDistance + totalDistance)
			return begin+1;
		return -1;
	}
	public static void main(String[] args) {
		int petrol1[] = {4,8,7,4};
		int distance1[] = {6,5,3,5};
		System.out.println(point(petrol1,distance1,4));
		int petrol2[] = {4,8};
		int distance2[] = {5,6};
		System.out.println(point(petrol2,distance2,2));
		int petrol3[] = {8,9,4};
		int distance3[] = {5,10,12};
		System.out.println(point(petrol3,distance3,3));
	}

}
