package enums;



/*
  3)Create an array that stores your Enum values using the .values() method in your Runner.

4)Loop through your Enums and print the Motion value from each Enum in your Runner. */


public class DirectionsRunner {


	public static void main(String[] args) {
		
		Directions [] directionArray = Directions.values();

	for (Directions value : directionArray) {
		System.out.println(value + " is the same as ");
		System.out.println(" The Motion value " + value.getMotion());
		value.printInfo();
	}
	
	
	}
}
