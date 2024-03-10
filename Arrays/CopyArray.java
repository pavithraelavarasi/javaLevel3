// 8. Write a Java program to copy an array by iterating the array. 

import java.util.Scanner;
import java.util.Arrays;
public class CopyArray {
 public static void main (String args[])
 {
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the elements count of an array");
  int num = sc.nextInt ();
  int original[] = new int [num];
  int copy [] =new int [num];
    System.out.println ("Enter the values of array");
    for (int i=0;i<num;i++)
    {
      original[i] = sc.nextInt();
    }
      for (int i =0;i<original.length;i++)
       {
	 copy[i] =original[i];
       }
         System.out.println ("Copied array " + Arrays.toString(copy));
   }
}
