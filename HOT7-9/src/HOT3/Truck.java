package HOT3;

public class Truck extends Vehicle {

	public void accelerate()
	{
		double truckAccelerate = 0;
		truckAccelerate += super.getSpeed() + 3;
		super.setSpeed(truckAccelerate);
	}
	
	public String toString()
	{
		return "Truck Speed: " + super.getSpeed();
	}
}
