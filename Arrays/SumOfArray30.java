//31. Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true. 

import java.util.Scanner;
public class SumOfArray30 {
 public static void main (String args[])
 {
   int i,j,count=0;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the number of elements");
  int size = sc.nextInt();
  int a[] = new int[size];
  System.out.println ("Enter the elements of an array");
  for (i =0;i<size;i++)
   {
    a[i] = sc.nextInt();
   }
  for (i =0;i<size;i++)
   {
    if (a[i] ==10)
    {
     count++;
    }
   }
   if (count==3)
     { 
      System.out.println ("true");
     }
   else
    {
     System.out.println ("False");
    }
  }
}
