package JavaBasics;

public class NestedLoopsConcept {

	public static void main(String[] args) {
		//00 01 02 03 04 05 
		//10 11 12 13 14 15 
		//20 21 22 23 24 25 
		//'println' always generates each output in the new line.
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print(i+""+j+" ");//01 02 03 04 05
				//break;// output will be 00 10 20 30 40 50 printed vertically
			}
			System.out.println();//Just creates a new line for each outer for loop iteration.
			//break;//output will be 00 01 02 03 04 05
		}
		//000 001 002 003 004 005 
		//010 011 012 013 014 015 
		//020 021 022 023 024 025 
		for(int k=0;k<=5;k++) {
			for(int l=0;l<=5;l++) {
				for(int m=0;m<=5;m++) {
					System.out.print(k+""+l+m+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}

}
