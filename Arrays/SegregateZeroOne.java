//42. Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.   

import java.util.Scanner;
public class SegregateZeroOne {
public static void main (String args[])
 {
  int i,j=0,k;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the size of an array");
  int size = sc.nextInt ();
  int a[] = new int [size];
  System.out.println ("Enter the elements of an array");
  for (i=0;i<size;i++)
   {
    a[i] = sc.nextInt();
   }
  for (i =0;i<size;i++)
   {
     if (a[i] ==0)
     {
      a[j++] =a[i];
     }
   }
  while (j<size)
  {
   a[j++] =1;
  }
  System.out.println ("After the segregation of 0s and 1s element the array is : " );
  for (k=0;k<size;k++)
   {
    System.out.print (a[k] + " ");
   }
 }
}
   
