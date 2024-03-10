//38. Write a Java program to get the majority element from an given array of integers containing duplicates.  

//Majority element: A majority element is an element that appears more than n/2 times where n is the size of the array.

import java.util.Scanner;
public class MajorityDupe {
 public static void main (String args[])
 {
   int i,j;
   int temp = 0;
   int major =0;
   int maxCount = 0;
   Scanner sc = new Scanner (System.in);
   System.out.println ("Enter the size of elements");
   int size = sc.nextInt();
   int a[] = new int [size];
   System.out.println ("Enter the elements of an array");
   for (i=0;i<size;i++)
   {
    a[i] = sc.nextInt();
   }
   //System.out.println ("Enter the duplicate elements");
   for (i=0;i<size;i++)
   {
     int count = 1;
     for (j=0;j<size;j++)
     {
      if (a[i] ==a[j] && i!=j)
       {
	 count++;
	 temp =a[i];
       }
     }
     if (count>maxCount)
     {
       maxCount = count;
       major = temp;
     }
    }
    if (maxCount>size/2)
    {
     System.out.println ("The value of majority element is : " + major);
    }
    else
     {
      System.out.println ("Not possible");
     }
   }
} 
