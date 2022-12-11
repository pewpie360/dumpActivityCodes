package ArrayOfObj;

public class ArrayCircle {
	
	public double radius = 1;
	private static int numberOfObj = 0;
	
	public ArrayCircle() {
		numberOfObj++;
	}
	
	public ArrayCircle(double newRadius) {
		radius = newRadius;
		numberOfObj++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius: 0;
	}
	
	public static int getNumberOfObj() {
		return numberOfObj;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
