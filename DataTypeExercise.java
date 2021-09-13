
/* Task 1:
	    Create a class called “DataTypeExercise”.
	    Create a main method, either in the class, or in a separate runner.
	    Declare 3 variables, 2 primitive types and one String.
	    Print all 3 to the console.
	
	Task 2:
	    Create a method which has a return value. 
	    Call that method and print the value it returns to the console.*/



public class DataTypeExercise {

	public static String describeEmma() {
		return "Emma is awesome";
	}
	
	public static void main(String[] args) {
		String name = "Emma";
		int age = 30;
		boolean millenial = true;
		
		System.out.println(name + " is " + age + ". Are they a millenial? " + millenial);
		System.out.println(describeEmma());
	}

}
