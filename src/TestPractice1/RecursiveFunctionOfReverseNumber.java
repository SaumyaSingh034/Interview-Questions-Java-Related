package TestPractice1;

public class RecursiveFunctionOfReverseNumber {
	

	public static void reverseNumber(int number)
	{
		if(number<10)
		{
			System.out.println(number);
			return;
		}else
		{
			System.out.print(number%10);
			reverseNumber(number/10);
		}
	}
	
	public static void main(String[] args)
	{
		reverseNumber(123);
		reverseNumber(100);
		reverseNumber(001);
		
	}

}
