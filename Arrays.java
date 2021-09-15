import java.util.Arrays;

public class Array {

	
	/*Exercises
1. Create an array that will hold 10 integer values, 
populate the array with values, then call and output each element.

*/
	
	public static void main(String[] args) {
intArray();
populate();

	}
	
	
	public static void intArray() {
		int[] numArray = new int[10];
		numArray[0] = 0;
		numArray[1] = 10;
		numArray[2] = 20;
		numArray[3] = 30;
		numArray[4] = 40;
		numArray[5] = 50;
		numArray[6] = 60;
		numArray[7] = 70;
		numArray[8] = 80;
		numArray[9] = 90;
	
		System.out.println(numArray); // wont print as expected
		System.out.println(Arrays.toString(numArray)); //print array as string
		
		for(int n: numArray) { 				//for each loop
		    System.out.println(n);
		}
		
		for(int n = 0; n < numArray.length; n++) { 		//for loop
		    System.out.println(numArray[n]);
		}
	}
	
	/* 2. Create a for loop that populates an integer array with values, 
	outputting them at each iteration.
	Then create another loop that iterates through the array, 
	changing the values at each point to equal itself times 10, 
	outputting them at each iteration. */
	
	public static void populate() {
	
		int[] numbers = new int[5]; 

	for (int i = 0; i < numbers.length; i++)
	{
		System.out.println(i);
	}
	
	for (int i = 0; i < numbers.length; i++)
	{
		System.out.println(i *10);
	}


	}




}
