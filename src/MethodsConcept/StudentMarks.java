package MethodsConcept;

public class StudentMarks {
	
	public int getStudentMarks(String student_name) {
		
		System.out.println("Getting student marks for " + student_name);
		int marks = -1;
		switch (student_name.trim()) {
		case "Jyo": {
			marks = 100;
			break;
				}
		case "Nirmal": {
			marks = 90;
			break;
				}
		case "Sri": {
			marks = 99;
			break;
				}
		case "Sreya": {
			marks = 98;
			break;
				}
		default:
			System.out.println("Student name not found. ");
		}
		return marks;
//		if(student_name.equals("Jyo")) {
//			marks = 100;
//		}
//		else if(student_name.equals("Sri")) {
//			marks = 90;
//		}
//		else if(student_name.equals("Sreya")) {
//			marks = 95;
//		}
//		else if(student_name.equals("Nirmal")) {
//			marks = 80;
//		}
//		else if(student_name.equals("Tom")) {
//			marks = 0;
//		}
//		else {
//			System.out.println("Student name not found!");
//			
//		}
//		
//		return marks;
		
	}

	public static void main(String[] args) {
		StudentMarks obj = new StudentMarks();
		int m1 = obj.getStudentMarks("Nimal");
		System.out.println(m1);
		if(m1 == 100) {
			System.out.println("Congratulations!");
		}
		else if(m1 == 0) {
			System.out.println("Good luck next time!");
		}
		else if(m1 ==-1){
			System.out.println("No marks to print!");
		}
		else {
			System.out.println("Way to go!!");
		}
		

	}

}