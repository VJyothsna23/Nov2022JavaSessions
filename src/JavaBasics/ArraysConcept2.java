package JavaBasics;

import java.util.Arrays;

public class ArraysConcept2 {

	public static void main(String[] args) {
//Different types of static arrays: 
//1. Arrays that are of single data type, ex: int array, double array, float array, char array, String array etc
//2. Arrays that are of different data types, ex: Object arrays
		   
		
			int a[] = new int[4];
			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			a[3] = 40;
			System.out.println(Arrays.toString(a));
	        for (int e : a) {
	        	System.out.println(e);
	        	if (e==20) {
	        		System.out.println("Bye!");
	        		break;
	        	}
	        }
	        
	        double d[] = new double[3];
	        d[0] = 21.78;
	        d[1] = 89.45;
	        d[2] = 34.56;
	        d[2] = d[1] - d[0];
	        System.out.println(Arrays.toString(d));
	        for(double e:d) {
	        	System.out.println(e);
	        }
	        
	        char c[] = new char[3];
	        c[0] = 'a';
	        c[1] = '1';
	        c[2] = '*';
	        System.out.println(Arrays.toString(c));		
	        for (char e: c) {
	        	System.out.println(e);
	         }
	        
	        String s[] = new String[5];//String is a class in java that's why we capitalize S in String.
	        s[0]= "Jyothsna";
	        s[1]=" Nirmal";
	        s[2]="Sri";
//If we dint specify s[2], default value for string will be stored which is null. 
//Whenever we perform some operation on this s[2] like if condition, it returns null pointer exception.
	        s[3]="Sreya";
	        s[4]="Sri";
	        //String s[] = {"Jyo", "Nirmal", "Sri", "Sreya"};
	        System.out.println(Arrays.toString(s));
	        for (String e:s) {
	        	System.out.println(e);
	        	if(e.equals("Sri")) {
	        		System.out.println("You are a wonderful son");
	        	}
	        	if(e.equals("Sreya")) {
	        		System.out.println("You are a wonderful daughter");
	        	}
	        }
//Object array:Object is class in java - it is a super class of all the classes in java.
//Creating Object array using new keyword:
	        Object employee[] = new Object[4];
	        employee[0] = "Jyo";
	        employee[1] = 6;
	        employee[2] = "QA";
	        employee[3] = 50;
	        System.out.println("Employee "+ employee[0]+ " has "+employee[1]+" years of experience as a "+employee[2]+" engineer and earns "+employee[3]+"$ per hour salary!");
	        System.out.println("The length of the employee array is: "+employee.length); 
	        System.out.println("The elements of the employee array are: "+ Arrays.toString(employee));
	        for (Object e: employee) {
	        	System.out.println(e);
	        }
	        
//creating Object array using Array literals:
	        Object employee1[] = {"Jyothsna",8,"QA",55,true};
	        System.out.println("The elements of the employee1 array are: "+Arrays.toString(employee1));
	        System.out.println("The length of the employee1 array is: "+ employee1.length);  
	        
	        for (Object e: employee1) {
	        	System.out.println(e);
	        }
  }
}