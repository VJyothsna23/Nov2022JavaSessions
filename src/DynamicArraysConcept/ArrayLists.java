package DynamicArraysConcept;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		//Dynamic Array: ArrayList
		//ArrayList is default class in Java
		//You can add any type of data in Array List.
		//ArrayList always does Order Based Collection, which means - 
		
		//When we create a new object of ArrayList, it initially creates 10 virtual segments( not physical segments)(VC/Virtual Capacity = 10)
		//That's why when we check the size right after creation of a new ArrayList, size will be 0.(PC/Physical Capacity =0)
		//After the first 10 segments are filled, then it creates half the PC( current size) amount of segments and so on.
		//Load Factor LF = PC(Physical Capacity)/2
		//Physical Capacity is nothing but the size of the Array List
		
		ArrayList ar = new ArrayList();// Creating a new ArrayList by creating an object of Array List class.
		System.out.println(ar.size());// .size() method gives the length of the array(dynamic array)
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		
		
		
		

	}

}
