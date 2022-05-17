package store;

public class Mirror extends WardropesDecorator{

	public Mirror(Wardrobes wardrobes) {
		super(wardrobes);
		
	}
	
	@Override
	public double getTwoDoorCost() {
		// TODO Auto-generated method stub
		return wardrobes.getTwoDoorCost()+4000;
	}

	@Override
	public double getThreeDoorCost() {
		// TODO Auto-generated method stub
		return wardrobes.getThreeDoorCost()+4000;
	}
	

}
