//45. Write a Java program to cyclically rotate a given array clockwise by one.   

import java.util.Scanner;
import java.util.Arrays;
public class CyclicallyRotate {
 public static void main (String args[])
 {
  int i,j;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the size of an array");
  int size = sc.nextInt();
  int a[] = new int [size];
  System.out.println ("Enter the elements of array");
   for (i=0;i<size;i++)
    {
     a[i] = sc.nextInt();
    }
   int x = a[a.length-1];
   for (i=size-1;i>0;i--)
   {
     a[i] =a[i-1];
   } 
   a[0] =x;  
   System.out.println (Arrays.toString (a));
  }
}
