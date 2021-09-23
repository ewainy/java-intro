package enums;

/* 1)Create an Enum for Directions, it should consist of "North", "East", "South", and "West".

2)Provide two attributes to your Directions called Abrev and Motion. 
The Enum values for Motion should be "Forward, Left, Right, Backward". 
The enum values for Abrev should be "N, E, S, W".

3)Create an array that stores your Enum values using the .values() method in your Runner.

4)Loop through your Enums and print the Motion value from each Enum in your Runner.

5)Provide a method that returns the following String structure: 
"[Abrev] is the same as moving [Motion]" and invoke it within your loop.
Your loop should print out:
N is the same as moving Forward
E is the same as moving Right
S is the same as moving Backward
W is the same as moving Left*/

public enum Directions {
	NORTH("FORWARD", "N"),
	EAST("RIGHT", "E"),
	SOUTH("BACKWARD", "S"),
	WEST("LEFT","W");
	
	Directions(String motion, String abreviation) {
		this.motion = motion;
		this.abreviation = abreviation;
	}
	
	public String getMotion() {
		return this.motion;
	}

	public String getAbreviation() {
		return abreviation;
	}
	
	public void printInfo() {
		System.out.println(this.abreviation + 
				" is an abreviation and the same as moving " + this.motion );
	}

	private final String motion;
	private final String abreviation;
	
	

}
