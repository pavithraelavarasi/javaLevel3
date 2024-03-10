//23. Write a Java program to test the equality of two arrays. 

import java.util.Scanner;
public class Equality {
 public static void main (String args[])
 { int count =0;
  int i,j;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the number of elements an array");
  int size = sc.nextInt();
  int a[] = new int [size];
  int b[] = new int [size];
  System.out.println ("Enter the elements of A : ");
   for (i =0;i<size;i++)
   {
    a[i] = sc.nextInt();
   }
  System.out.println ("Enter the elements of B : ");
   for (j=0;j<size;j++)
    {
     b[j] = sc.nextInt();
    }
   for (i=0;i<size;i++)
    {
     if (a[i]==b[i])
      { count++;}
    }
        if (count==size)
	{
         System.out.println ("The two arrays are equal");
        }
     else
      {
      System.out.println ("The two arrays are not equal");
      }
  }
 }

