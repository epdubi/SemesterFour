package HOT3;

public class Vehicle {

	protected double speed = 10;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void accelerate()
	{
		speed += 5;
	}
	
	public String toString()
	{
		return "";
	}
}
