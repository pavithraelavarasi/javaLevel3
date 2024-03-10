//28. Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above. 

import java.util.Scanner;
import java.util.Arrays;
class DifLargeAndSmall {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		if(size <0)
		{
			System.out.println("Please Enter the array size to above 0");
		}
		System.out.println("Enter the elements of an array");
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i=0;i<size;i++)
		{
			for(int j =i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			      }
			}
		}
		System.out.println("After sorted the arrays is : " + Arrays.toString(a));
		int large = a[size-1];
		int small = a[0];
		int diff = large - small;
		System.out.println("The largest number is - " + large + "\nThe Smallest number is - " + small);
		System.out.println("Difference between the largest and smallest values is : " +  diff);
	}
}

