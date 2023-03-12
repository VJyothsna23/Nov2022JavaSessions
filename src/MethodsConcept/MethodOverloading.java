package MethodsConcept;

public class MethodOverloading {

//Method overloading is also called as Polymorphism. This is an Object oriented programming concept(OOP).
//Poly(many) + Morphism(forms)--Many forms of methods
//Method overloading is a Complile time polymorphism or Static polymorphism -
//because the decision(to pick which method to be called) happens at the compile time itself.  
	

//Method overloading happens only within the same class under certain conditions: 
//	We call it method overloading When we have:
//	1.different methods with same method names
//	2.having different number of parameters
//	3.having different types of parameters
//  4.having different sequence/order of parameters
//  5.Here the return type of the method doesn't matter. 
//Any methods with same method name but different return types still is not allowed, it will not be considered as method overloading.
//It's considered as duplicate methods.
	
//Real time examples of method overloading use cases: while testing the features like login, search, payment etc. 

	
	public void test() {//0 parameters
		System.out.println("Testing- 0 params");
	}
//	public int test() {//duplicate method even though the return type is different from above
//		return 10;
//	}
    public void test(int i) {//1 parameter of int type
    	System.out.println("1 parameter of int type");
	}
    public void test(String i) {//1 parameter of String type
    	System.out.println("1 parameter of string type");
	}
    public void test(int i, int j) {//2 parameters of int type
    	System.out.println("2 parameter of int type");
	}
    public void test(int i, String j) {//2 parameters of diff types
    	System.out.println("2 parameter of int, string type");
	}
    public void test(String i, int j) {//2 parameters of diff types in diff order than above method
    	System.out.println("2 parameter of diff order string, int type");
	}
    
	public static void main(String[] args) {
		MethodOverloading obj1 = new MethodOverloading();
		obj1.test("Jyo",10);// The complier will call the respective method based on the arguments we are passing.

	}

}