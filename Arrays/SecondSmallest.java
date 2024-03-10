//18. Write a Java program to find the second smallest element in an array. 

import java.util.Scanner;
public class SecondSmallest {
 public static void main (String args[])
 {
  int i,j,temp;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the element number of an array");
  int num =sc.nextInt();
   int a[] =new int [num];
   System.out.println ("Enter the elements of array");
    for (i=0;i<num;i++)
    {
     a[i] = sc.nextInt();
    }
    for (i=0;i<num;i++)
    {
      for (j=i+1;j<num;j++)
       {
	 if (a[i]>a[j])
          {
           temp = a[i];
	   a[i] = a[j];
	   a[j] = temp;
	  }
	}
      }
     System.out.println ("Seconf smallest element " + a[1]);
    }
}
