//53. Write a Java program to replace every element with the next greatest element (from right side) in a given array of integers.

import java.util.Scanner;
public class ReplaceGreatestNum {
public static void main(String[] args)
{
 		int i,j,n,max=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array: ");
		n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] a = new int[n];
		int[] b = new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
       // 	b[n-1]=-1;
		int min = a[0];
		for(i=0;i<n;i++)
		{
			min=min<a[i]?min:a[i];
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				max=max>a[j]?max:a[j];
			}
			b[i]=max;
			max = min;
		}
		System.out.println("After replacing every element with the next greatest element in the array, the array is: ");
		for(i=0;i<n;i++)
		{
			System.out.print(b[i] + " ");
		}
	}
}
