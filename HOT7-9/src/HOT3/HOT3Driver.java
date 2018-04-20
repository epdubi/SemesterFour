package HOT3;

public class HOT3Driver {

	public static void main(String[] args) {
		Vehicle v1;
		v1 = new Car();
		v1.accelerate();
		v1.accelerate();
		System.out.println(v1.toString());
		Vehicle v2;
		v2 = new Truck();
		v2.accelerate();
		v2.accelerate();
		System.out.println(v2.toString());
		

	}

}
