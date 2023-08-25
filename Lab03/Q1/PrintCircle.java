public class PrintCircle {
	public static void printCircle(NewCircle newCircle) {
		System.out.println(" r = " + newCircle.getRadius( ));
		System.out.println("center = [" + newCircle.getCenter( ).getX() 
            + " , "  + newCircle.getCenter( ).getY() + "]");
	}
}
