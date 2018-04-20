package HOT3;

public class Car extends Vehicle {
	
	public void accelerate()
	{
		double carAccelerate = 0;
		carAccelerate += super.getSpeed() + 10;
		super.setSpeed(carAccelerate);
	}
	
	public String toString()
	{
		return "Car Speed: " + super.getSpeed();
	}
}
