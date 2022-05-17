package store;

public class locker extends WardropesDecorator{

	public locker(Wardrobes wardrobes) {
		super(wardrobes);
		
	}
	
	@Override
	public double getTwoDoorCost() {
		// TODO Auto-generated method stub
		return wardrobes.getTwoDoorCost()+5000;
	}

	@Override
	public double getThreeDoorCost() {
		// TODO Auto-generated method stub
		return wardrobes.getThreeDoorCost()+5000;
	}
	
	
	
}
