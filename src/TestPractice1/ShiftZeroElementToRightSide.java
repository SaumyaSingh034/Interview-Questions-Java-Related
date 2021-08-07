package TestPractice1;

import java.util.Arrays;

public class ShiftZeroElementToRightSide {
	
	public static void main(String[] args)
	{
		int arr[] = {1,0,0,3,0,0,5,0,6,0,8};
		System.out.println(Arrays.toString(shiftAllZeros(arr)));
		
		int arr2[] = {0,1,2,3};
		System.out.println(Arrays.toString(shiftAllZeros(arr2)));
		
		int arr3[] = {0};
		System.out.println(Arrays.toString(shiftAllZeros(arr3)));
	}
	
	public static int[] shiftAllZeros(int[] arr)
	{
		int arr1[] = new int[arr.length];
		if(arr.length==1)
		{
			return arr;
		}
		else
		{
			
			int count=0;
			for(int number : arr)
			{
				if(number!=0)
				{
					arr1[count] = number;
					count++;
				}
			}
		}
		return arr1;
	}

}
