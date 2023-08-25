public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return radius * radius * Math.PI;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius + ", area= " + getCircleArea();
    }
}
