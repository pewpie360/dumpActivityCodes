package ArrayOfObj;

public class Array_Obj {
	
	/*Declaration, creation and access to
	arrays of object*/

	public static void main(String[] args) {
		
		ArrayCircle []MyCircle = new ArrayCircle[10];
		double sum = 0;
		
		for(int i = 0; i < 10; i++) {
			MyCircle[i] = new ArrayCircle(i * 10);
		}
		for(int i = 0; i < 10; i++) {
			sum += MyCircle[i].getArea();
		}
		System.out.println(sum);
		
		ArrayCircle MyCircle1 = new ArrayCircle(5.0);
		printCircle(MyCircle1);//Using objects as parameter to method

	}
	public static void printCircle(ArrayCircle c) {
		System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
	}

}

