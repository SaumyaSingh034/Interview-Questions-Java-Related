package TestPractice1;

import java.util.HashMap;

public class HashMapConcept {
	
	public static void main(String[] args)
	{
		HashMap<String, Integer> hashString = new HashMap<String, Integer>();
		String e1 = "Saumya";
		e1 = "Singh";
		hashString.put(e1, 21);
		e1 = "Singh";
		System.out.println(hashString.get(e1));
		System.out.println(hashString.get("Saumya"));
		
	}

}
