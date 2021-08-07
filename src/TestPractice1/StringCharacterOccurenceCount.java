package TestPractice1;

import java.util.HashMap;

public class StringCharacterOccurenceCount {
	
	public static void main(String[] args)
	{
		printCountOfSpacesOnly("My Name is Saumya");
		printCountofCharacterOccurence("I love automating things");
		
	}
	
	public static void printCountOfSpacesOnly(String name1)
	{
		char str[] = name1.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char c : str)
		{
			if(String.valueOf(c).contains(" "))
			{
				if(charMap.containsKey(c))
				{
					charMap.put(c, charMap.get(c)+1);
				}else
				{
					charMap.put(c, 1);
				}
			}
			
		}
		System.out.println(name1+" : "+charMap);
	}
	
	public static void printCountofCharacterOccurence(String name)
	{
		char strArray[] = name.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(char c : strArray)
		{
			if(!String.valueOf(c).contains(" "))
			{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}else
			{
				charMap.put(c, 1);
			}
		}
		}
		System.out.println(name+" : "+charMap);
	}
	


}
