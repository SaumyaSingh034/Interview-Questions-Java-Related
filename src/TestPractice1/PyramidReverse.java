package TestPractice1;

public class PyramidReverse {

	public static void main(String[] args)
	{
		for(int i=0;i<=6;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
