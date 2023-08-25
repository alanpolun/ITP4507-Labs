public class Car {
	private String name;
	private double maxSpeed;	// in kilometers per hour
	public Car() { }
	public Car(String name, double maxSpeed) {
		this.name = name;
		this.maxSpeed = maxSpeed;
	}
	public String getName() { return name; }
	public double getMaxSpeed() { return maxSpeed; }
	public double compare(Car car) 
		{  	return getMaxSpeed() - car.getMaxSpeed(); }
}
