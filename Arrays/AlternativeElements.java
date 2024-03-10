//50. Write a Java program to sort an array of positive integers of an array, in the sorted array the value of the first element should be maximum, second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.

import java.util.Scanner;
import java.util.Arrays;
public class AlternativeElements {
 public static void main (String args[])
 {
   int i,j,oddCount =0,evenCount=0,temp =0;
   Scanner sc = new Scanner (System.in);
   System.out.println ("Enter the size of an array");
   int size = sc.nextInt ();
   int a[] = new int [size];
   int b[] = new int [size];
   System.out.println ("Enter the elements");
   for (i=0;i<size;i++)
    { 
     a[i] = sc.nextInt ();
    }
    for (i=0;i<size-1;i++)
     {
      for (j=i+1;j<size;j++)
	{
         if (a[i]>a[j])
          {
	   temp = a[i];
	   a[i] = a[j];
	   a[j] = temp;
	  }
	}
     }
    for (i=0;i<size;i++)
    {
     if ((i%2)==0)
     {
      b[i] = a[size-(1+oddCount)];
      oddCount++;
      System.out.println("b[i] :"+ b[i]);
      System.out.println("Odd Count :"+oddCount);
     }
     if ((i%2)!=0)
     {
     // System.out.println ("Even count" +evenCount);
      b[i] = a[i-(1+evenCount)];
      evenCount++;
     }
    }
    System.out.println ("After the alternative order the array is : " );
  //  for (i=0;i<size;i++)
    // {
      System.out.println (Arrays.toString (b));
     }
   }



