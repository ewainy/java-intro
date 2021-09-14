
public class FizzBuzz {
/* FizzBuzz
Create a method which returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
Return 'FizzBuzz' for numbers which are multiples of both three and five.
Return the input number for numbers that are neither. */
	
	public static String fb(int num) {
		
		if (num % 3 == 0 && num % 5 == 0 ){
			return "FizzBuzz";
		}
		
		else if (num % 5 == 0) {
			return "Buzz";
		}
		else if (num % 3 == 0) {
			return "Fizz";
		}
		
		else {
		return String.valueOf(num);
		}
		
	}
	
  	public static void main(String[] args) {
		System.out.println(fb(5));

	}

}
