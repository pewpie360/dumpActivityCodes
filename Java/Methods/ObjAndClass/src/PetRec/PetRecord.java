package PetRec;

public class PetRecord {
	private String name;
	private int age;
	private double weight;
	
	public void writeOutput() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
	}
	
	public PetRecord(String InitName, int InitAge, double InitWeight) {
		name = InitName;
		age = InitAge;
		weight = InitWeight;
	}
	
	public PetRecord() {
		name = "No name yet";
		age = 0;
		weight = 0;
	}
	
	public PetRecord(String InitName) {
		name = InitName;
		age = 0;
		weight = 0;
	}
	
	public void set(String newName, int newAge, double newWeight) {
		name = newName;
		age = newAge;
		weight = newWeight;
	}

}
