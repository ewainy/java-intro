/* Please create a new package for this exercise. 
 
1) Create a new class call Encapsulation with 5 variables (one String, one integer, one double, one float and one long).
2) Encapsulate your variables (make them private and generate getters and setters).
3) Generate two constructors - one should be empty.
4) Use setters to set values in your Runner.java.
5) Use getters and System.out.println(); to print out the values in your Runner.java.
6) Generate toString in your Encapsulation.java and invoke it from Runner.java.*/ 




package encapsulation;

public class Encapsulation {

	
	private String name = "Emma";
	private int age = 30;
	private double shoeSize = 4.5;
	private float height = 154;
	private long acccount = 5775899;


public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getShoeSize() {
		return shoeSize;
	}


	public void setShoeSize(double shoeSize) {
		this.shoeSize = shoeSize;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public long getAcccount() {
		return acccount;
	}


	public void setAcccount(long acccount) {
		this.acccount = acccount;
	}





public Encapsulation(String name, int age, double shoeSize, float height, long acccount) {
	
	this.name = name;
	this.age = age;
	this.shoeSize = shoeSize;
	this.height = height;
	this.acccount = acccount;
}


public Encapsulation() {

}


@Override
public String toString() {
	return "Encapsulation [name=" + name + ", age=" + age + ", shoeSize=" + shoeSize + ", height=" + height
			+ ", acccount=" + acccount + "]";
}



}
