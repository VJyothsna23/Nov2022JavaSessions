package OOP_AbstractClasses;

public abstract class Page {
	
//0% abstraction: You can have an abstract class with 0 abstract methods.
//100% abstraction: You can have an abstract class with all the methods that are abstract.
//Partial abstraction: You can have an abstract class with any number of abstract methods and any number of normal  methods.
	
// You can't create the object of Abstract classes just like how you can't create objects for interfaces
//	But we can create the constructor of the abstract class.
// and it will be called when we create an object of it's child class.
//If the child class also has a constructor of it's own,then parent class constructor will be called first and then goes to child class constructor. 

	
	
	
	//Page class constructor
	public Page() {
		System.out.println("Page class constructor");
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public final void displayLogo() {// making this method final to prevent method overriding
		System.out.println("Page ---- logo");
	}
	public void pageLoadingTime() {
		System.out.println("Page loading time is 10 secs");
	}
	public static void pageCycle() {
		System.out.println("Page cycle");
	}

}
