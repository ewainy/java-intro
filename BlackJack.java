public class BlackJack {
	
	/* BlackJack
Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. 
If they both go over 21 then return 0.

 play (10, 21) -> 21
 play (20, 18) -> 20
 play (1, 22) -> 1
 play (22, 23) -> 0 */
	
	public static int play(int num1, int num2) {
		
		if (num1 >21 && num2 > 21) {
			return 0;
		}
			else if (num1 > num2 && num1 <= 21){
				return num1;
		
		}
			else if (num1 >21 && num2 <= 21) {
				return num2;
			}
	
		
			else if (num2 > num1 && num2 <=21) {
				return num2;
				
			}
			else {
				return num1;
			}		
	
	}
			

	public static void main(String[] args) {
		System.out.println(play(21,5));

	}

}
