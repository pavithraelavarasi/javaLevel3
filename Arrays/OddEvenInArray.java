//27. Write a Java program to find the number of even and odd integers in a given array of integers. 

import java.util.Scanner;
public class OddEvenInArray {
 public static void main (String args[])
 {
   int i,j;
   Scanner sc = new Scanner (System.in);
   System.out.println ("Enter the numbers elements in array");
   int size = sc.nextInt();
   int a[] = new int [size];
   System.out.println ("Enter the elements");
    for (i=0;i<size;i++)
    { 
     a[i] = sc.nextInt();
    }
    System.out.println ("The odd numbers are : ");
    for (i=0;i<size;i++)
     {
       if (a[i] %2 !=0)
	 {
         System.out.println (a[i]);
         }
     } 
   System.out.println ("The even numbers are : " );
    for (i=0;i<size;i++)
     {
      if (a[i] % 2==0)
	{
         System.out.println (a[i]);
	}
      }
    }
}
