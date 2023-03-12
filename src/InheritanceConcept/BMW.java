package InheritanceConcept;

public class BMW extends Car{
	
//Method Overriding: When we have a same method both in parent and child class with the following conditions:
//With the same exact method name	
//With the same number of parameters, sequence of parameters( variable names can be different)	 	
//With the same return type (of the methods). 
//		
//@Override - is the Annotation to show that below is an over ridden method from parent class.
//This annotation gives error if the method it is specifying is not overridden. 
	
	@Override
	public void start() {
		System.out.println("BMW --- Strat");
	}
	public void autoParking() {
		System.out.println("BMW --- Autoparking");
	}
}
