//22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number. 


import java.util.Arrays;
import java.util.Scanner;
public class SumPairs {
 public static void main (String args[])
 { int i,j;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the number of elements");
  int size = sc.nextInt();
  int a[] = new int [size];
  System.out.println ("Enter the elements of array");
  for (i=0;i<size;i++)
    {
     a[i] = sc.nextInt();
    }
  System.out.println ("Enter the specified number");
  int num =sc.nextInt();
  System.out.println ("The created array is :" + Arrays.toString(a));
  System.out.println ("Indicates the elements whose sum is :" +num);
    for (i=0;i<size;i++)
     {
      for(j=i;j<size;j++)
       {
	 if (a[i]+a[j]==num && i!=j)
          {
	   System.out.println (a[i] +" and  " + a[j]);
	   }
        }
      }
   }
}
