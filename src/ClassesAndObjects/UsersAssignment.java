package ClassesAndObjects;

public class UsersAssignment {
	
	String name;
	int age;
	String state;
	char sex;

	public static void main(String[] args) {
		
		UsersAssignment u1 = new UsersAssignment();
		u1.name = "Veda";
		u1.age = 14;
		u1.state = "CA";
		u1.sex = 'F';
		
		UsersAssignment u2 = new UsersAssignment();
		u2.name = "Sreya";
		u2.age = 6;
		u2.state = "WA";
		u2.sex = 'F';
		
		UsersAssignment u3 = new UsersAssignment();
		u3.name = "Sri";
		u3.age = 10;
		u3.state = "WA";
		u3.sex = 'M';
		
		UsersAssignment u4 = new UsersAssignment();
		u4.name = "Sashu";
		u4.age = 10;
		u4.state = "Maharashtra";
		u4.sex = 'M';
		
		System.out.println("User u1 info: "+ u1.name + u1.age + u1.state + u1.sex );//User u1 info: Veda14CAF
		System.out.println("User u2 info: "+ u2.name + u2.age + u2.state + u2.sex );//User u2 info: Sreya6WAF
		System.out.println("User u3 info: "+ u3.name + u3.age + u3.state + u3.sex );//User u3 info: Sri10WAM
		System.out.println("User u4 info: "+ u4.name + u4.age + u4.state + u4.sex );//User u4 info: Sashu10MaharashtraM
		
		System.out.println("--------");
		u1=u2;
		u2=u3;
		u3=u4;
		u4=u1;
		System.out.println("User u1 info: "+ u1.name + u1.age + u1.state + u1.sex );//User u1 info: Sreya6WAF
		System.out.println("User u2 info: "+ u2.name + u2.age + u2.state + u2.sex );//User u2 info: Sri10WAM
		System.out.println("User u3 info: "+ u3.name + u3.age + u3.state + u3.sex );//User u3 info: Sashu10MaharashtraM
		System.out.println("User u4 info: "+ u4.name + u4.age + u4.state + u4.sex );//User u4 info: Sreya6WAF
		
	}

}
