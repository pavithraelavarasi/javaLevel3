/*
2. Write a Java program to sum values of an array. 
*/
import java.util.Scanner;

public class SumValuesOfAnArray
{
	public static void main(String[] args)
	{
		int i, size, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		size = scan.nextInt();
		
		int [] array = new int [size];
		
		for(i = 0; i < size; i++)
		{
		    System.out.println("Enter value of " + (i+1));
		    array[i] = scan.nextInt();
		}
		scan.close();
		
		for (i = 0; i < array.length; i++)
		{
		    sum = sum + array[i];
		}
		System.out.println("Sum of all the values are : " + sum);
	}
}