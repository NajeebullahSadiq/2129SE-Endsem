package store;


public class WardropeStore {

	public static void main(String[] args) {
		
		Wardrobes metal = new Metal();
	
		
		Wardrobes locker = new  locker(metal);
		System.out.println(locker.getThreeDoorCost());
		
		Wardrobes mer = new  Mirror(locker);
		System.out.println(mer.getThreeDoorCost());
		System.out.println(mer.getTwoDoorCost());
		
		
		
		

	}

}