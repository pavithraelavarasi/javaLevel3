//11. Write a Java program to reverse an array of integer values. 

import java.util.Scanner;
public class ReverseArray {
 public static void main (String args[])
 {
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the number of elements in array");
  int num =sc.nextInt();
  int arr[] = new int [num];
  System.out.println ("Enter the elements of array");
  for(int i =0;i<num;i++)
   {
    arr[i] = sc.nextInt();
   }
  System.out.println ("Original array:");
  for (int i =0;i<num;i++)
  { 
   System.out.print (arr[i] + " ");
  }
  System.out.println ("\nReversed array:");
  for (int i =num-1;i>=0;i--)
  {
   System.out.print (arr[i]+ " " );
  }
 }
}
