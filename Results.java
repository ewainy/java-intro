
public class Results {

	
	
	/* Results
A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. 
When all the exam marks have been added together, we can find the overall percentage that the person 
has got by multiplying their score by 100 and then dividing by 450.

Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. 
This class should also have 2 methods:

Method 1 - displays the results that the person got for each exam and then the total mark. 
Try to make the output neat and bespoke for each exam.
Method 2 - which finds and displays the percentage that the person received for the exams overall.
*/

	static int physics = 60;
	static int chemistry = 110;
	static int biology = 135;
	static int total = physics + chemistry + biology;
	static int percentage = (total * 100) / 450;

	
	public static void main(String[] args) {

		results();
		percentage();
	}
	

	public static void results() {
		
		System.out.println("The result received for Physics was " + physics + 
				". The result received for Chemistry was " + chemistry +
				". The result received for Biology was " + biology);
	
	}
	
	public static void percentage() {
		System.out.println("The overall percentage received for Science was " + percentage + "%");
	}
}
