public class Appliance {
	private double price;  // purchase price of the appliance
	private int type;  // value is AIR_CONDITIONER or WASHING_MACHINE
	public static final int AIR_CONDITIONER = 0;
	public static final int WASHING_MACHINE = 1;
	
	public Appliance(int type, double price) {
		this.type = type;
		this.price = price;
	}
	public double getPrice() { return price; }
	
	public double getExtendedWarrantyPrice() {
		double amt = 0.0;
		if (type == AIR_CONDITIONER) {
		  amt = Math.max(0.2*price,500.0);  
		} else if (type == WASHING_MACHINE) {
		  amt = 70.0+0.15*price;
		}
		return amt;
	}
}
