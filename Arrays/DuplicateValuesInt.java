//12. Write a Java program to find the duplicate values of an array of integer values. 

import java.util.Scanner;
public class DuplicateValuesInt {
 public static void main (String args[])
 { int i,j;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the number of elements");
  int num = sc.nextInt();
  int a[] = new int [num];
  System.out.println ("Enter the elements of array");
  for (i =0;i<num;i++)
   {
    a[i]=sc.nextInt();
   }
   for (i=0;i<num-1;i++)
    { 
     for (j=i+1;j<num;j++)
      {
       if (a[i]==a[j])
	{
         System.out.println ("The Duplicate element is :"+ a[j]);
         break;
	}
       }
     }
  }
}
