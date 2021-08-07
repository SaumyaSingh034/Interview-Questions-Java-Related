package TestPractice1;

public class CalculateCapitalizedString {
	
	public static void main(String[] args)
	{
		String s = "HelloMyNameIsSaumya";
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				count++;
				System.out.println(s.charAt(i));
			}
		}
		System.out.println(count);
	}

}
