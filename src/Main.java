import java.util.ArrayList;

public class Main {

	public static void main (String[] args) {
		
		//For-each loop = traversing technique to iterate through the elements in an array
		//				  collection
		//				  less steps, more readable
		//				  less flexible
		
		
		
		String[] animals = {"Cat","Dog","Bird","Rat"} ;
		//for-each loop
		//: - > represents in
		for(String i : animals) {
			System.out.println(i);
		}
		
		//Collection = > ArryList is a type of it 
		ArrayList<String> food = new ArrayList<String>();
		food.add("");
		food.add(null);
		food.add(null);
		food.add(null);
		
	}
	
}
