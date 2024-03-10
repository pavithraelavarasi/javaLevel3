//7. Write a Java program to remove a specific element from an array. 

import java.util.Scanner;
public class RemoveSpecificValue {
 public static void main (String args[])
 { int i;
  Scanner sc =new Scanner (System.in);
  System.out.println ("Enter the count of elements in array");
  int num = sc.nextInt ();
   int a[] = new int[num];
   int b[] = new int [num];
   System.out.println ("Enter the array a values");
     for (i=0;i<num;i++)
      {
        a[i] =sc.nextInt();
      }
    System.out.println ("Enter the value to be removed");
     int remove = sc.nextInt();
    System.out.println ("array b values");
     for (i=0;i<num;i++)
      {
	if (remove !=a[i])
	  {
	   b[i] =a[i];
          System.out.println (b[i]);
          }
      }
   } 
} 
