package StaticConcept;

public class Car {

	// Class variables are also called as global variables.
    // Method variables are called as local variables.

//Static variables: A class variable can be declared as static, when all the objects have common property value. 
			String brand_name;
			int Milage ;
			boolean issports_version;
			static int wheels = 4;
			final int mirrors = 6;// If a variable is declared with final, it's value can't be changed.
// Any variable (class variable or local variable) can be declared as final. 
			
			
//Since the variable wheels has the common property value for all the objects, 
//we can declare 'wheels' as a static variable. Doing so will save a lot of space.
//Only class variables can be declared as static variables. Local variables can't be static.
//For all the non static variables, Java will create a copy for each object that's present.
//Where as for static variables, Java creates only one copy for all the objects.
			
//Memory allocation for static vs non static variables/methods:
//All the non static variables/methods  are stored in heap memory inside their objects.
//The object reference names are stored in Stack memory and they will point to their respective objects.
//*The static variables/methods are always stored inside CMA(*Common Memory Allocation)
//It is a separate memory area which is also called as Permanent generation or Meta Space

//You can access static variables/static methods directly or by using class name. 
//Accessing the static methods/static variables using their class name is the preferred approach.
			
	//Static methods: Methods can also be declared static.
			public void start() {// Normal method-so, a copy will be created for each object of the class.
				System.out.println("Car start method");			
			}
			public static void speedTest() {//static method-so, only one copy will be created for all the objects of the class and is stored in CMA(common memory allocation)
				System.out.println("Speed Test Method");			
			}			
			

			public static void main(String[] args) {
//  static int i =4; Local variables can't be static. Only class variables can be declared static.
				final int i = 10;// Local variables can be declared as final.
				
				System.out.println(i);
				Car C1 = new Car();
				C1.brand_name = "BMW";
				C1.Milage = 100;
				C1.issports_version = true;
//				C1.wheels = 4;
				
				Car C2 = new Car();
				C2.brand_name = "Nissan";
				C2.Milage = 110;
				C2.issports_version = false;
//				C2.wheels = 4;
				
				Car C3 = new Car();
				C3.brand_name = "Audi";
				C3.Milage = 90;
				C3.issports_version = false;
//				C3.wheels = 4;
				
				Car C4 = new Car();
				C4.brand_name = "Ferrari";
				C4.Milage = 70;
				C4.issports_version = true;
//				C4.wheels = 4;
				
//You can access static variables directly or by using class name.
				System.out.println(wheels);// direct calling
				System.out.println(Car.wheels);//This is the recommended approach-using the class name.
				System.out.println(C1.brand_name+" gives a milage of "+C1.Milage+", with number of wheels as "+Car.wheels);
				//O/p for above: BMW gives a milage of 100, with number of wheels as 4
				
//You can call static methods directly(like static variables) without any object, or by using class name.
				Car.speedTest();//Calling static method using class name
				C1.start();// calling noon static method using object reference name
//				Car.start();//You can't call non static methods using class name directly. This will throw error.
				
//You can call static methods using objects but you will get a warning that static methods should be accessed in static way.
//But this is allowed, it desn't throw error. But, it's not the right way. Ex:
				C1.speedTest();
// Static variables or methods should always be accessed in static way(using class name).
				
//				C1.mirrors = 7;// This won't be possible because 'mirrors' variable is declared final.
				
			}


		}


