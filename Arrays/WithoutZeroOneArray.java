//30. Write a Java program to check if an array of integers without 0 and -1. 

import java.util.Scanner;
public class WithoutZeroOneArray {
 public static void main (String args[])
 {
   int i,j;
   boolean ValuePresent = false;
   Scanner sc = new Scanner (System.in);
   System.out.println ("Enter the number of elements");
   int size = sc.nextInt ();
   int a[] = new int [size];
   System.out.println ("Enter the elements of an array");
   for (i = 0;i<size;i++)
    {
     a[i] = sc.nextInt();
    }
   for (i=0;i<size;i++)
   {
    if ((a[i] ==(-1)) || (a[i]==0))
     {
      ValuePresent = true;
     }
   }  
    if (ValuePresent ==true)
    {
       System.out.println ("Array of integers with 0 and -1");
     }
    else 
     {
      System.out.println ("Array of integers without  0 and -1:");
     }
  
  }
}
