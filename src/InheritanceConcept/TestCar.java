package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		
// Creating a child class object:
//Here we can access both parent class, child class methods. Child class can inherit the parent class methods.
		BMW b = new BMW();
		b.start();// overridden method
		b.autoParking();// individual method
		b.refuel();//inherited method
		b.stop();//inherited method
		
		System.out.println("---------");

//Creating a parent class object:Here we can access only parent class methods. Parent class can't inherit the child class methods. 
		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		
		
//Top Casting: A child class object can be referred using a parent class referance variable.
		
		Car c = new BMW();
		

	}

}
