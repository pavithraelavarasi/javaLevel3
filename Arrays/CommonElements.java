//14. Write a Java program to find the common elements between two arrays (String values). 


import java.util.Scanner;
public class CommonElements {
 public static void main (String args[])
 {
  int i,j;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the size of an array");
  int num = sc.nextInt();
  String a[] = new String [num];
  System.out.println ("Enter the elements of an array A :");
   for (i = 0;i<num;i++)
    {
    a[i] =sc.next();
    }
     String b[] = new String [num];
     System.out.println ("Enter the elements of an array B :");
     for (i =0;i<num;i++)
     {
       b[i] =sc.next();
     }
     System.out.println("The common string values in the array A and B: ");
     for (i =0;i<num;i++)
      {
        for (j =0;j<num;j++)
	{
          if ((a[i]).equals (b[j]))
	  {
	    System.out.println (b[j]+ " ");
	  }
       }	
     } 
  }
} 
