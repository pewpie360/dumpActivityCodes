package TestCircle;

public class Circle {
	//this is the radius of a circle
	double radius; //Data Field
	
	/*Constructor is a special kind of method which it must have the same name as the class it self. It has no 
	return type not even a void. It is invoked using new operator*/
	
	//Construct a circle with radius 1
	Circle(){//Constructor
	radius = 1.0;
	}
	
	//Construct a circle object with a specified radius
	Circle(double newRadius){
		radius = newRadius;
	}
	
	//Return the area of this circle
	double getArea() { //Method
		return radius * radius * Math.PI;
	}
}
