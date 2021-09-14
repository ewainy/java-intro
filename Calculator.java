
public class Calculator {

	
	
	/* Create a method that accepts two integers as input, 
	 * then returns an integer that is the sum of these two parameters. (Addition) */
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	} 
	
	
	
	/* Create the following additional three methods that each take two parameters:

Multiplication - which takes two numbers and returns the product.
Subtraction - which takes two numbers, then returns the result of the subtraction.
Division - which takes two numbers, then returns the result of the division.*/
	
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	} 
	
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	} 
	
	public static int divide(int num1, int num2) {
		return num1 / num2;
	} 
	
	/*Your division method may have returned the wrong result; 
	This is called a rounding error and is quite common in most languages. 
	this is because we were using ints rather than doubles.
	Modify the division method so that it takes Double parameters 
	and then return a Double, if not already.*/
	public static double divideD(double num1, double num2) {
		return num1 / num2;
	} 
	
	
	public static void main(String[] args) {
	
	System.out.println(add(10,2));
	System.out.println(multiply(10,2));
	System.out.println(subtract(10,2));
	System.out.println(divide(10,2));
	System.out.println(divideD(10.00d,2.00d));
	}

}
