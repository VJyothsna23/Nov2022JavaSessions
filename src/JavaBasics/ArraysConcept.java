package JavaBasics;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
// Array: Collection of elements(data) that are of same type.
// Arrays are non-primitive data type
		
//Arrays can created using two ways: 
//1. using new keyword- ex: int a[] = new int[4];- here we assign array values one by one after creation of the array.
//2. using array literals- int a[] = {10,20,30,40};- here we assign array values all at once while creating the array itself.
		
		
//Limitations of Array: 
//1.Size is fixed - to overcome this issue, we have to use dynamic array(Array List)
//2.All the array elements must be of same type - to overcome this issue we can use object array(static array). 
//This object array is also a static array but you can store different types of data in a single array.
		
		
		
		int a[] = new int[5];
//initialization of array named 'a' holding 5 data elements that are of type int.
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		//a[5] = 60;
//AIOB- we will get 'Array Index Out of Bounds exception' because the index we are trying to assign is not in range.
		System.out.println(a[2]);//30
		//System.out.println(a[5]);//AIOB Exception
		 
//*below is index based for loop to print all the array elements:
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
//*to print the array elements without for loop:
		System.out.println(Arrays.toString(a));//o/p - [10, 20, 30, 40, 50]
		System.out.println(a);// This will print the memory address of the array instead of the array elements.
		
//*below is the for-each loop which is a modern/easier way for printing all the array values:
//This for each loop can't go in the reverse order. It only traverses in forward direction of the array only.
		for(int e:a){//for each(e) in(:) array(a)
			System.out.print(e);
		}
		
//initializing another array b:
		int b[] = new int[4];
		b[2] = 30;//we only assigned value for the 2nd index position of the array keeping the others empty
		System.out.println(b[0]);//prints '0' which is the default value for an integer data type if value is not present
		System.out.println(b[2]);//30
		System.out.println(b[3]);//again prints '0' (default value for int)
// For an integer type array - default value is '0'
// For an float type array - default value is '0.0'
// For an character type array - default value is 'blank value'
// For an boolean type array - default value is 'False'
		

	}
}
 
