package ObjClass;

public class Stud {
	
	/*Concept of information hiding/encapsulation is applicable to data fields in the class. It's not a good programming practice
	that the fields in the class can be accessed by any application program. The data must be hidden by using the access modifier
	to private in the different data fields.*/
	
	/*The Accessor and Mutator is a method that modify or access values for each Instance Variables in a class, need to create the
	 * accessor/mutator method. A Accessor is a way to get methods to return a value of a data fields while Mutator set method
	 * update a value of a data field
	 */
	/*Formats:
	 * public returnType getFieldName() - Accessor
	 * public void setFieldName() - Mutator
	 */
	
	private String Name;
	private int Age;
	private boolean isDSMajor;
	private char gender;
	
	public Stud() {
		
	}
	
	public Stud(Stud s) {
		Name = s.Name;
		Age = s.Age;
		isDSMajor = s.isDSMajor;
		gender = s.gender;
	}
	
	//accessor
	public String getName() {
		return Name;
	}
	
	public int getAge() {
		return Age;
	}
	
	//Mutator
	public void setName(String n) {
		Name = n;
	}
	
	public void setAge(int a) {
		Age = a;
	}
	
	public void display(Stud s) {
		System.out.println("Name: " + s.Name);
		System.out.println("Age: " + s.Age);
	}

}
