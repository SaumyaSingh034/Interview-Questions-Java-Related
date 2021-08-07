package TestPractice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		
		String s = "Selenium";
		duplicateCharOccurenceCount(s);

	}
	
	public static void duplicateCharOccurenceCount(String name)
	{
		char ch[] = name.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char c : ch)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
				
			}else
			{
				charMap.put(c, 1);
			}
		}
		
		
		Set<Entry<Character, Integer>> entry = charMap.entrySet();
		
		for(Map.Entry<Character, Integer> en : entry)
		{
			if(en.getValue() > 1)
			{
				System.out.println(en.getKey() +" : "+en.getValue());
			}
		}
	}
}
