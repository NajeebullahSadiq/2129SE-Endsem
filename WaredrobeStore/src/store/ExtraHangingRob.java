package store;

public class ExtraHangingRob extends WardropesDecorator{

	public ExtraHangingRob(Wardrobes wardrobes) {
		super(wardrobes);
		
	}
	
	@Override
	public double getTwoDoorCost() {
		// TODO Auto-generated method stub
		return wardrobes.getTwoDoorCost()+500;
	}

	@Override
	public double getThreeDoorCost() {
		// TODO Auto-generated method stub
		return wardrobes.getThreeDoorCost()+500;
	}
	

}
