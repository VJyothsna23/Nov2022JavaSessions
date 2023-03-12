package JavaBasics;

public class MainMethodOverloading {
	
//You can overload main method too. You can have 'N' number of main methods.
//No matter how many main methods we write within the class, 
//	JVM always looks for and executes the main method with String array parameter using the same exact keywords-
	//(public static void main(String[] args)).
// The variable name of the string array parameter inside the main method can be anything, the default name is []args.
	

	public static void main(String []a) {//The name of the string parameter can be anything.
		System.out.println("Hello");
	}
	public static void main(String a) {//This is also main method overloading because we are passing the string not string array.
		System.out.println("Hello");
	}
	public static void main(int i) {
		System.out.println(i);
		System.out.println("1 param of int type");
	}
	public static void main(int i, int j) {
		System.out.println(i+j);
		System.out.println("2 params of int type");
	}
	
//The JVM recognizes the actual main method, and it automatically executes the main method.
//The other main methods need to be called in-order to be executed.
	
MainMethodOverloading obj = new MainMethodOverloading();
//obj.main(10);
	
	
}
 