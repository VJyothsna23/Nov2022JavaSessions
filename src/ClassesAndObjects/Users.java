package ClassesAndObjects;

public class Users {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {

//One object can have multiple reference names.That means one object can be called by pointed by multiple reference variables.
//With the below example, we can see that object reference names can be interchanged.
		Users u1 = new Users();
		u1.name = "Jyo";
		u1.age = 33;
		u1.city = "Seattle";
		
		Users u2 = new Users();
		u2.name = "Siri";
		u2.age = 35;
		u2.city = "Pune";
		
		Users u3 = new Users();
		u3.name = "Pravi";
		u3.age = 37;
		u3.city = "CA";
		
		System.out.println("User u1 info: "+ u1.name + u1.age + u1.city);//User u1 info: Jyo33Seattle
		System.out.println("User u2 info: "+ u2.name + u2.age + u2.city);//User u2 info: Siri35Pune
		System.out.println("User u3 info: "+ u3.name + u3.age + u3.city);//User u3 info: Pravi37CA
		
		System.out.println("---------");
		u1 = u2;// Due to this line, u1 will break existing connection and it starts pointing where u2 is pointing.
		System.out.println("User u1 info: "+ u1.name + u1.age + u1.city);//User u1 info: Siri35Pune
		System.out.println("User u2 info: "+ u2.name + u2.age + u2.city);//User u2 info: Siri35Pune
		System.out.println("User u3 info: "+ u3.name + u3.age + u3.city);//User u3 info: Pravi37CA

		System.out.println("---------");
		u2 = u3;// Due to this line, u2 will break existing connection and it starts pointing where u3 is pointing. and u1 was already pointing u2 because of the line 32.
		System.out.println("User u1 info: "+ u1.name + u1.age + u1.city);//User u1 info: Siri35Pune
		System.out.println("User u2 info: "+ u2.name + u2.age + u2.city);//User u2 info: Pravi37CA
		System.out.println("User u3 info: "+ u3.name + u3.age + u3.city);//User u3 info: Pravi37CA
		
		System.out.println("---------");
		u3 = u1;// Due to this line, u3 will break existing connection and it starts pointing where u1 is pointing. and u1 was already pointing u2 because of the line 32.
		System.out.println("User u1 info: "+ u1.name + u1.age + u1.city);//User u1 info: Siri35Pune
		System.out.println("User u2 info: "+ u2.name + u2.age + u2.city);//User u2 info: Pravi37CA
		System.out.println("User u3 info: "+ u3.name + u3.age + u3.city);//User u3 info: Siri35Pune

// This is a famous interview question too.
//In the above example, now that the first object with values "Jyo, 33, Seattle" is not being referred by 
//any reference variable, it becomes no reference object and it is ready for Garbage Collector.			
// With above example, we can see that object reference names can be interchanged. 

	}
 
}
