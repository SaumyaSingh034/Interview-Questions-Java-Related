package TestPractice1;

public class PalindromeNumber {
	
	public static void main(String[] args)
	{
		int num = 152;
		int temp = num;
		int sum=0;
		int r;
		while(num>0)
		{
			r = num%10;
			sum = (sum*10) + r;
			num = num/10;
		}
		System.out.println(sum);
		if(temp == sum)
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not a Palindrome.");
		}
	}

}
