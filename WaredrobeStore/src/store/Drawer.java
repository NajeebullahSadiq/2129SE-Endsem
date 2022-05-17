package store;

public class Drawer extends WardropesDecorator{

	public Drawer(Wardrobes wardrobes) {
		super(wardrobes);
		
	}
	
	@Override
	public double getTwoDoorCost() {
		// TODO Auto-generated method stub
		return wardrobes.getTwoDoorCost()+2000;
	}

	@Override
	public double getThreeDoorCost() {
		// TODO Auto-generated method stub
		return wardrobes.getThreeDoorCost()+2000;
	}
	

}
