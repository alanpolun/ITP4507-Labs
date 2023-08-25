public class TestCarSpeed {
	public static String compare(Car carA, Car carB) {
		double diff = carA.compare(carB);
		if (diff > 0)
			return carA.getName() + " is faster than " + carB.getName();
		else if (diff < 0)
			return carB.getName() + " is faster than " + carA.getName();
		else
			return carA.getName() + " is as fast as " + carB.getName();
	}
}
