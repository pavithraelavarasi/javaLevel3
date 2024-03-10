//49. Write a Java program to arrange the elements of an given array of integers where all positive integers appear before all the negative integers.   

import java.util.Scanner;
import java.util.Arrays;
public class PositiveNegative {
 public static void main (String args[])
 {
  int i,j,temp =0;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the size of an array");
  int size = sc.nextInt ();
  int a[] = new int [size];
  System.out.println ("Enter the elements of an array");
   for (i=0;i<size;i++)
   {
    a[i] = sc.nextInt();
   }
   for (i=0;i<size-1;i++)
   {
    for (j=i+1;j<size;j++)
     {
      if (a[i]<0)
      {
        temp = a[i];
        a[i] =a[j];
        a[j] = temp;
 //       System.out.println ("a[i]" + a[i]);
       }
     }
   }
    System.out.println ("Rearranged array is: ");
//    for (i=0;i<size;i++)
     System.out.println (Arrays.toString (a));
   }
}

