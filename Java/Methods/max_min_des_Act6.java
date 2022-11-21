package javaMethod;
//import package
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class max_min_des_Act6 {

	public static void main(String[] args) {
		//creating a scanner
		Scanner sc = new Scanner(System.in);
		
		//asking for row amount limit
		System.out.println("Input amount of rows ");
		//convert it to int
		int num = sc.nextInt();
		
		//pass the converted row limit into one dimensional array
		int arr[] = new int[num];
		
		//asking for row values
		System.out.print("Enter row number values: ");
		//pass a loop statement
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//printing the max value using calling method
		System.out.println("The max is: " + maxi(arr));
		System.out.println("The min is: " + min(arr));
		//converting int into string to sort
		System.out.println("The Orig array is: " + Arrays.toString(arr));
		//sort the value converted
		Arrays.sort(arr);
		//print the sorter descending order values
		System.out.println("The descending array is: " + Arrays.toString(arr));
		}
	//creating a public int return type and naming maxi as the reserved word
	//creating a array as a parameter
	public static int maxi(int[] x) {
		//create a temporary local variable
		int tempo = x[0];
		//creating a loop for maximum
		for(int i = 0; i < x.length; i++) {
			if(tempo < x[i])
			   tempo = x[i];
		}
		//return the value once it already satisfy the condition
		return tempo;
	}
	public static int min(int[] y) {
		//create a temporary local variable
		int tempor = y[0];
		//creating a loop for minimum
		for(int i = 0; i < y.length; i++) {
			if(tempor > y[i]) 
			   tempor = y[i];
		}
		//return the value once it already satisfy the condition
			return tempor;
	}
	}
