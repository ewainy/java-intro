
public class Person {

/*
 * 1)Create a Person class with a few variables (height, name, shoe size, job title, age).
2) Generate a constructor with all of them.
3) Create another constructor that only has name and height.
4) Create 2 methods that use these variable (e.g. greet - similar to the one I showed you). They SHOULD NOT be static.
5) Create 4 instances of the Person class in your runner and call the methods.
6) Upload your code to GitHub. */
	

	private int height;
	private String name;
	private double shoeSize;
	private int age;
	private String jobTitle;
	
	public Person(int height, String name, double shoeSize, int age, String jobTitle) {
		this.height = height;
		this.name = name;
		this.shoeSize = shoeSize;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public Person(String name, int height) {
	this.name = name;
	this.height= height;
	
}
	public void greet() {
		System.out.println("Hello " + name);
}
	public void height() {
		if (height < 160) {
			System.out.println("You are petite");
		} else if (height < 175) {
			System.out.println("You are average height");
			
		} else {
			System.out.println("You are tall");
		}
		
}
	
	
}
