package JavaBasics;

import java.util.Arrays;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str = "This is my Java Code and I love it!";
		System.out.println(str.charAt(0));//o/p = T
		System.out.println(str.indexOf("i"));//First occurrence of i in my string: o/p = 2
		
		System.out.println(str.indexOf("Java"));//o/p= 11, the index where J in Java starts
		System.out.println(str.indexOf("Python"));//o/p= -1, because the word 'Python' is not there in my string
		
		System.out.println(str.indexOf('i', 3));//first occurrence of i in my string after index 3
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		
//Find the 4th occurrence of i in the string as homework
		
		String test = "This is Java Test Program";
		System.out.println(test.toLowerCase());
		System.out.println(test.toUpperCase());
		
		//trim
		String s = "      hello World     ";
		System.out.println(s.trim());// Spaces will be gone before and after the string, o/p= hello World
		
		//replce
		String s1 = "      hello World     ";
		System.out.println(s1.replace(" ", ""));//All spaces will be removed, o/p= helloWorld
		
		String dob = "12-06-1990";
		System.out.println(dob.replace("-", "/"));//All '=' will be replaced by '/', o/p=12/06/1990
		
		String msg = "I hate Java";
		System.out.println(msg.replace("hate", "Love"));//The string hate will be replaced by '/', o/p=
		
		//equals:
		String e1 = "Hello Selenium";
		String e2 = "Hello Selenium";
		
		System.out.println(e1.equals(e2));// Hard comparison:  o/p = true- here spaces are considered too, it's case sensitive
		System.out.println(e1.equalsIgnoreCase(e2));//Soft comparison:o/p = true- here spaces are considered too, it's not case sensitive
		System.out.println(e1.equalsIgnoreCase(e2.trim()));
	
	    //Contains: 
		String msg1 = "Welcome to Java Sessions with Jyothsna";
		System.out.println(msg1.contains("Jyothsna"));// o/p = true
		System.out.println(msg1.contains("jyothsna"));// o/p = false because it is case sensitive.
		
		//split: Always the return type for split function is string array
		String lang = "Java_Python_Ruby_Dotnet_C#";
	    String l[] = lang.split("_");
	    System.out.println(l.length);
	    System.out.println(Arrays.toString(l));
	    
	    String pop = "xXTestingxXSeleniumxXAutomationxXTrainingxX";
	    String p1[] = pop.split("xX");
	    System.out.println(p1[0]);//O/p = no o/p, just space
	    System.out.println(p1[1]);//O/p = Testing
	    System.out.println(p1[2]);//O/p = Selenium
	    
	    String s11 = "Selenium";
	    String r = "";
	    
	    r = r.concat(s11);
	    System.out.println(r);
	}

}
