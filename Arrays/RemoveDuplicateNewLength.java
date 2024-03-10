//33. Write a Java program to remove the duplicate elements of a given array and return the new length of the array.

import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicateNewLength {
 public static void main (String args[])
 { 
  int i,j,k=0, temp =0;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the number of elements");
  int size = sc.nextInt();
  int a[] = new int [size];
  int b[] = new int [size];
  System.out.println ("Enter the elements");
  for (i=0;i<size;i++)
  {
   a[i] = sc.nextInt();
  }
  for (i=0;i<size-1;i++)
   {
    for (j=i+1;j<size;j++)
     {
      if (a[i]>a[j])
		{
          temp = a[i];
       	  a[i] = a[j];
	      a[j] = temp;
		 }
       }
     }
	System.out.println (Arrays.toString (a));
    for (i=0;i<size-1;i++)
     {
     if (a[i]!=a[i+1])
      {
		b[k++] =a[i];
       }
     }
       b[k++] =a[size-1];
       System.out.println ("the length of new array is : " + k);
    }
}
