//26. Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements. 

import java.util.Scanner;
public class ZeroElement {
public static void main (String args[])
 {
   int i,j,count =0;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the number of elements");
  int size = sc.nextInt();
  int a[] = new int [size];
  System.out.println ("Enter the elements of an array");
   for (i = 0;i<size;i++)
    {
     a[i] = sc.nextInt();
    }
    for (i =0;i<size;i++)
    { 
      if (a[i]!=0)
       {
	a[count++]=a[i];
       }
     }
     while (count<size)
     {
      a[count++] =0;
     }
    for (j=0;j<size;j++)
     {
      System.out.println (a[j]);
     }
   }
}

