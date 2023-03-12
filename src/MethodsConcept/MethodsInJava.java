package MethodsConcept;

public class MethodsInJava {
	
//Function/method:
//1.Functions are independent.
//2.You can't create a function inside another function. but you can call a function from another function.
//3.Even if we have multiple methods in a program, JVM always executes the main method fist.
//4.Other class methods must be called inside the main method in order to be executed.
//5.You can call a function any number of times.
//6.A function can only return one data type at a time.

	
//Data members:
//	1.Class variables
//	2.Class methods	
//Whenever we are accessing these data members(if non-static), we need to create the class object first.
	
//1. A method with no input, no return: Since the method is not returning anything, we wrote void in line 19.
	public void test() {
		System.out.println("Test method");
		int a=10;
		int b=20;
		System.out.println(a+b);//This is not returning anything, we are simply printing something on the console here.
				
	}
	
//2. No input, some return:
//When a function returns some value, we can use it and perform further operations on the returned value.
//Since we are returning integer here, we wrote 'int' in line 30. Whatever the method is returning, we need to specify the same while declaring the method.
//After return statement inside the method, we shouldn't be writing any logic. return should be the last statement of the function.
	public int getBillAmount() {
		System.out.println("Get Billing Amount");
		int food = 100;
		int drinks = 50;
		int total = food + drinks;
		return total;
		//return food + drinks; - You can even return directly like this, not only the variable.
	}
	
	public String getEmployeeName(){
		System.out.println("Getting Employee Name ");
		String name = "Jyothsna"; 
		return name;
		//return "Jyothsna"; - You can even return directly the value like this.
	}
	
	public boolean isElementPresent() {
		System.out.println("Checking if the element is present ");
		boolean flag = true;
		return flag;
	}

//3. Some input, some return: call by value
//When we declare a function that takes some data, these are called method parameters. In below example a,b are parameters.
//The actual values that we send while calling this method are called method arguments.
//Ex: Method that takes two numbers a,b and returns their sum.
	public int getSum(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public String getEmpInfo(String name, int bonus) {
		System.out.println("Getting employee info ");
		return name+": " +bonus;
	}
	
	public static void main(String[] args) {
		MethodsInJava obj = new MethodsInJava();
		obj.test();//o/p: Test method,30
		int total = obj.getBillAmount();//o/p: Get Billing Amount
		System.out.println("Total amount is: " + total);//o/p: Total amount is: 150
		
		int discounted_amount = total-25;
		System.out.println("Final amount after discount is: " + discounted_amount);// Final amount after discount is: 125
		
		String emp_name = obj.getEmployeeName();//o/p: Getting Employee Name:
		System.out.println("Employee name is: " + emp_name);// Employee name is: Jyothsna
		
		boolean flag = obj.isElementPresent();//Checking if the element is present
		System.out.println("The status of the element is: "+ flag);//The status of the element is: true
		 
		if(flag) {//here since flag is a boolean value(true), I can use it in the if condition.
			System.out.println("Click on the element");
		}
		
		int sum = obj.getSum(10, 25);//This is called call by value( calling a function by passing some value)
		// 10,25 are called method arguments.
		System.out.println("Sum of two numbers is: "+sum);//Sum of two numbers is: 35
		
		int sum1 = obj.getSum(total, discounted_amount);//Here we are passing 150, 125
		System.out.println("Sum of the numbers is: "+sum1);//Sum of the numbers is: 275
		
		String info = obj.getEmpInfo("Jyo", 100);//Getting employee info 
		System.out.println(info);//Jyo: 100
		
		System.out.println("Bye");
	}

}
