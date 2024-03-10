//16. Write a Java program to remove duplicate elements from an array. 

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicate {
 public static void main (String args[])
 {
   int i,j;
   Scanner sc = new Scanner (System.in);
   System.out.println ("Enter the number of elements");
   int num = sc.nextInt();
   int a[] = new int [num];
   int b[] = new int[num];
   int temp = 0;
   int k = 0;
   System.out.println ("Enter the elements of an array");
    for (i=0;i<num;i++)
    {
     a[i] =sc.nextInt();
    }
   for(i=0;i<num-1;i++)
   {
    for(j=i+1;j<num;j++)
    {
      if(a[i]>a[j])
       {
        temp = a[i];
		a[i]=a[j];
		a[j] = temp;
        }
     }
   }
  System.out.println("Sorted array is : " + Arrays.toString(a));
     for(i =0;i<num-1;i++)
     { 
	 if (a[i]!=a[i+1])
	  {
            b[k++] =a[i];
	  }
       }
        b[k++] = a[num-1];
    System.out.println ("After removing the duplicates from array the array is : ");
    for (i =0;i<k;i++)
       {
        System.out.println (b[i]);
       }
   }
}
