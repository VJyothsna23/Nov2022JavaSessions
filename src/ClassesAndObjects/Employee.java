package ClassesAndObjects;

public class Employee {
	//class is category of objects/blueprint/template of objects.
	//Object is a physical entity which is designed by the template of the class.
	
	//class variables:
	String name;
	int age;
	char gender;
	double salary;
	boolean ispermanent;

	public static void main(String[] args) {
		
		//obj is the object reference name here and the data type of the object 'obj' is Employee class.
		//new Employee()below always creates a new object(RHS - Right hand side)
		//You can create any number of objects under a class with different reference names.
		
// creating an object under Employee class with reference name 'obj'
		Employee obj = new Employee();
		obj.name = "Jyothsna";
		obj.age = 32;
		obj.gender = 'F';
		obj.salary = 24.67;
		obj.ispermanent = true;
		System.out.println(obj.name +" "+ obj.age +" "+ obj.gender);//Jyothsna 32 F
		
		// creating another object under Employee class with reference name 'E1'
		Employee E1 = new Employee();
//If we create an object and don't assign values, then default values of the variable data types that were mentioned in the class will be printed.
		E1.name = "Nirmal";
		E1.age = 36;
		E1.gender = 'M';
		E1.salary = 45.89;
		E1.ispermanent = true;
		System.out.println(E1.name +" is "+E1.age+" years old!");
		System.out.println(E1.name +"'s salary is "+E1.salary+", and his job status is " +E1.ispermanent);
		
//Creating another object - Null reference object(an object without any reference name using null).
		Employee E2 = new Employee();
		E2 = null;//Null reference object
		System.out.println(E2.name);
		// Null pointer exception will be thrown because any operation on null will return null pointer exception.
		//This is not a recommended way to create a Null reference object because it will be waste of memory and we won't be able to use the object.
		
//Creating another object with no reference name:
		new Employee();//This will create an object with a photocopy of the class variables, but no reference name.
		//Since there is no reference name, there is no way to access this object to assign the values to the variables.
		new Employee().name = "Jyothsna";
	//This creates different objects each time and assigns the values but this is different object from the object we created in line 47.
	//It's never a good practice and is not recommended to create objects without a reference name.
	
//No reference objects and Null reference objects are collected by Garbage Collector(GC) in regular intervals.	
		
//Garbage Collector is called by JVM in regular intervals to clear the garbage so that memory is not wasted on the unwanted objects. 
//Using below line, we can manually call the Garbage Collector but we don't have guarantee 
//that it will come and destroy the unnecessary objects like null reference or no reference objects.
//GC always monitors for unwanted objects and waits for the JVM instructions before destroying them.		

		System.gc();
	}

}
