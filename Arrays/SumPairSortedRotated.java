//46. Write a Java program to check whether there is a pair with a specified sum of a given sorted and rotated array.   

import java.util.Scanner;
public class SumPairSortedRotated {
 public static void main (String args[])
 { int i,j;
   boolean isPossible = false;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the number of elements");
  int size = sc.nextInt();
  int a[] = new int [size];
  System.out.println ("Enter the elements of array");
  for (i=0;i<size;i++)
    {
     a[i] = sc.nextInt();
    }
  System.out.println ("Enter the specified number");
  int num =sc.nextInt();
  System.out.println ("Pairs which give the specified sum : ");
  for (i=0;i<size;i++)
   { 
     for(j=1;j<size;j++)
      {
	if((a[i]+a[j])==num)
	{
	 isPossible = true;
         System.out.println(a[i] + " and " + a[j]);
	}
       }
     } 
     if (isPossible==true)
      {
	     System.out.println("Possible");
       }
     else
        {
     	 System.out.println ("not possible");
	}
   }
}
