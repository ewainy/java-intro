import java.util.ArrayList;
import java.util.Collections;



public class List {


	
	
	public static void main(String[] args) {
	
		 ArrayList<String> characters = new ArrayList<>();

		    characters.add("Buffy");
		    characters.add("Angel");
		    characters.add("Willow");
		    characters.add("Spike");
		    characters.add("Anya");
		    
		    System.out.println(characters);
		    
		    //for loop
		    for (int i = 0; i < characters.size(); i++) {
		        System.out.println(characters.get(i));
		    }
		    
		    //enhanced for loop
		    for (String name : characters){
		        System.out.println(name);
		    }
		    
		    // get name from index
		    System.out.println(characters.get(0));
		    
		    // set name at index 2
		    characters.set(2, "Tara");
		    System.out.println(characters);
		    
		    // remove name at index 2
		    characters.remove(2);
		    System.out.println(characters);
		    
		    // sort array, this will print alphabetically
		    Collections.sort(characters);
		    System.out.println(characters);
		    
		    
		    // remove name from index 0
		    characters.remove(0);
		    System.out.println(characters);

		    // print out the size of the array
		    System.out.println(characters.size());

		    // clear the whole array
		    characters.clear();
		    System.out.println(characters);
		   
		    
	}
	}


