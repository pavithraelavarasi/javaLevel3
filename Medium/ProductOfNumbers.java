//3.Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i. Solve it without using division and in O(n) time.

//For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

import java.util.Scanner;

public class ProductOfNumbers { 
 public static void main(String[] args)
 {
   int i,j,n,m=1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements in an array: ");
    n = scanner.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    System.out.println("Enter the array elements: ");
     for(i=0;i<n;i++)
     {
       a[i]=scanner.nextInt();
      }
	for(i=0;i<n;i++)
	{
	  m =1;
	 for(j=0;j<n;j++)
	 {
	   if(i==j)
	   {
	    continue;
	    }
	     m=m*a[j];
	     b[i]= m;
	    }
	   }
           for(i=0;i<n;i++)
	   {
	   System.out.print(b[i] + " ");
	  }
     }
}	
