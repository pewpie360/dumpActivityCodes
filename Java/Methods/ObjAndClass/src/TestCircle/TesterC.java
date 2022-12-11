package TestCircle;

public class TesterC {
	//** Main Method is the TesterC*/
	public static void main(String[] args) {
		//Create a circle with radius 1.0
		//Creating a first object name circle
		Circle circle = new Circle();//Declaring and Creating a reference variable
		System.out.println("The area of the circle of radius " + circle.radius + " is " + circle.getArea());
		
		//Create a circle with a radius of 10
		Circle circle1 = new Circle(10);
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
		
		//Modify circle radius
		circle.radius = 100;
		System.out.println("The area of the circle of radius " + circle.radius + " is " + circle.getArea());
	}

}
