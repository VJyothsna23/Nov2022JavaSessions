 package MethodsConcept;

public class MainMethodOverloading {
	
//This is an important concept for interviews, in real time we don't usually overload main methods.
//But, you can overload main method too. You can have 'N' number of main methods.
//No matter how many main methods we write within the class, 
//JVM always looks for and executes the static main method with String array parameter using the same exact keywords-
//(public static void main(String[] args)).
// The variable name of the string array parameter inside the main method can be anything, the default name is []args.
		

		public static void main(String []a) {//The name of the string parameter can be anything.
			System.out.println("Hello");
			MainMethodOverloading.main("World");//Main 1 will be printed
			MainMethodOverloading.main(10);//Main 2 will be printed
			MainMethodOverloading.main(10,20);//Main 3 will be printed
			
		}
		public static void main(String a) {//This is also main method overloading because we are passing the string not string array.
			System.out.println("Main 1: Hello " + a);
		}
		public static void main(int i) {
			System.out.println(i);
			System.out.println("Main 2: 1 param of int type");
		}
		public static void main(int i, int j) {
			System.out.println(i+j);
			System.out.println("Main 3: 2 params of int type");
		}
		
//The JVM recognizes the actual main method, and it automatically executes the main method automatically when we execute.
//If there is no actual main method(public static void main(String[] args), we won't be able to execute the program at all.
//The other main methods need to be called in-order to be executed. 
//In order to call the other main methods, we don't need to create any object. 
//We can directly call them using the class name because these methods are declared as static methods.
		

		
		
		
		
	}
