
package store;

public abstract class WardropesDecorator implements Wardrobes{
	
	
	
	
	protected Wardrobes wardrobes;
	
	public WardropesDecorator( Wardrobes wardrobes) {
		
		this.wardrobes = wardrobes;
	}

	@Override
	public double getTwoDoorCost() {
		// TODO Auto-generated method stub
		return wardrobes.getTwoDoorCost();
	}

	@Override
	public double getThreeDoorCost() {
		// TODO Auto-generated method stub
		return wardrobes.getThreeDoorCost();
	}
}
