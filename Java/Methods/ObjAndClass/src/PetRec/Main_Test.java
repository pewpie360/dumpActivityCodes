package PetRec;
import java.util.*;
public class Main_Test {
		//Main test for PetRecord Class
	public static void main(String[] args) {
		
		//creating new object
		PetRecord Petrec = new PetRecord("Chris Jay");//Declaring and Creating a reference variable
		System.out.println("My record of your pet: ");
		Petrec.writeOutput();
		
		//creating new object
		PetRecord Petrec1 = new PetRecord("Joe Mama", 13, 22);//Declaring and Creating a reference variable
		System.out.println("My record of your pet: ");
		Petrec1.writeOutput();
		
		//accessing set constructor
		Petrec.set("Chupapi", 15, 33);
		Petrec.writeOutput();
		
		//Accessing blank constructor
		PetRecord petrec = new PetRecord();
		petrec.writeOutput();
	}

}
