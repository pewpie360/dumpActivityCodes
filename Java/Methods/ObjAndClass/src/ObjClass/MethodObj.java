package ObjClass;
import java.util.*;

public class MethodObj {
		//Main test for Stud Class
	public static void main(String[] args) {
		//create an object
		Stud Student = new Stud();
		String name;
		int age;
		/*Student.Name = "Chan";
		Student.Age = 21;
		Student.isDSMajor = true;
		Student.gender = 'M';*/
		
		//Accessing/assigning values of an objects
		Student.setName("Chan");
		Student.setAge(21);
		name = Student.getName();
		age = Student.getAge();
		
		Stud SecStud = new Stud(Student);
		System.out.println("Name: " + SecStud.getName());
		SecStud.display(Student);
		
		
		
	}

}
