package TestPractice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateValueInArray {
	
	public static void main(String[] args)
	{
		String[] arr = {"Selenium","Java","Python","Cypress","Java","C","Selenium","Selenium"};
		
		//1 - 2 for loop
		//2 - HashSet
		//3 - HashMap
		
		HashMap<String, Integer> strMap = new HashMap<String, Integer>();
		for(String s : arr)
		{
			if(strMap.containsKey(s))
			{
				strMap.put(s, strMap.get(s)+1);
			}else
			{
				strMap.put(s, 1);
			}
		}
		
		Set<Entry<String,Integer>> entrySet = strMap.entrySet();
		
		for(Map.Entry<String, Integer> entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"----->"+entry.getValue());
			}
		}
	}

}
