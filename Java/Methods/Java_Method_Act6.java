package javaMethod;
import java.util.*;
//import package
public class Java_Method_Act6 {
	public static void main(String[] args) {
		//creating a scanner
		Scanner sc = new Scanner(System.in);
		
		//creating a loop than execute a block of code as long as a specified condition is reached.
		while(true) {
		System.out.println("Choose operator: \n(+)Addition\n(-)Subtraction\n(*)Multiplication\n(/)Division\nPress(x) key to exit");
		//convert inputs into string
		String op = sc.nextLine();
		
		//using a case statement for easy separation of operators
		switch(op){
		//this is for addition
		case "+":
			//convert 2 input num into integer
			System.out.println("Input first num: ");
			int fnum = sc.nextInt();
				
			System.out.println("Input second num: ");
			int snum = sc.nextInt();
			
			//printing the addition value using call method
			System.out.println("The Result of Adding two numbers is: " + addcal(fnum, snum));
			//break the code once the condition already satisfy
			break;
		//this is for subtraction
		case "-":
			//convert 2 input num into integer
			System.out.println("Input first num: ");
			int fnum1 = sc.nextInt();
				
			System.out.println("Input second num: ");
			int snum1 = sc.nextInt();
			//printing the subtraction value using call method
			System.out.println("The Result of Subtracting two numbers is: " + subcal(fnum1, snum1));
			//break the code once the condition already satisfy
			break;
		//this is for multiplication
		case "*":
			System.out.println("Input first num: ");
			int fnum2 = sc.nextInt();
				
			System.out.println("Input second num: ");
			int snum2 = sc.nextInt();
			//printing the multiplication value using call method
			System.out.println("The Result of Multiplying two numbers is: " + multical(fnum2, snum2));
			break;
		//this is for division
		case "/":
			System.out.println("Input first num: ");
			int fnum3 = sc.nextInt();
				
			System.out.println("Input second num: ");
			int snum3 = sc.nextInt();
			//printing the division value using call method
			System.out.println("The Result of Dividing two numbers is: " + divical(fnum3, snum3));
			//break the code once the condition already satisfy
			break;
		case "x":
			//closing the code run
			System.out.println("Code runtime end");
			//break the code once the condition already satisfy
			break;
		//creating default that if the input is out of the condition the code block will run
		default:
			System.out.println("Program error");
			//continue the condition until the user want to end the code
			continue;
		}
		//adding conditional to the user
		System.out.println("Do you want to calculate again? 1)YES 2)NO");
		//converting input into int
		int con = sc.nextInt();
		//creating a if statement
			if(con == 2) {
				System.out.println("Code end");
				//break the code once the condition already satisfy
				break;
			}
		}
		}
	//creating a public int return type and naming addcal as the reserved word
	static int addcal(int x, int y) {
		//creating an int x and y as a parameter and return the addition of x and y
		 return x + y;
		 
	}
	//creating a public int return type and naming subcal as the reserved word
	static int subcal(int x, int y) {
		//creating an int x and y as a parameter and return the subtraction of x and y
		return x - y;
	}
	//creating a public int return type and naming multical as the reserved word
	static int multical(int x, int y) {
		//creating an int x and y as a parameter and return the mutiplication of x and y
		return x * y;
	}
	//creating a public int return type and naming divical as the reserved word
	static int divical(int x, int y) {
		//creating an int x and y as a parameter and return the division of x and y
		return x / y;
	}

}
