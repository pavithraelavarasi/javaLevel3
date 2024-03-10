 //32. Write a Java program to check if an array of integers contains two specified elements 65 and 77. 

import java.util.Scanner;
public class TwoSpecifiedElements {
 public static void main (String args[])
 { int i,j;
   boolean ValuePresent = false;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the number of elements");
  int size = sc.nextInt();
  int a[] = new int[size];
  System.out.println ("Enter the elements of an array");
  for (i =0;i<size;i++)
   {
    a[i] = sc.nextInt();
   }
   for (i=0;i<size;i++)
    {
      if (a[i]==65 || a[i]==77)
       { 
	ValuePresent = true;
       }
     }
      if ( ValuePresent==true)
      {
       System.out.println ("Yes, the integers contains the specified elements");
      }
     else
      {
       System.out.println ("No,the intergers doesn't contains the specified elements");
      }
  }
}
 
    

