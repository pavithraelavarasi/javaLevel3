//10. Write a Java program to find the maximum and minimum value of an array. 

import java.util.Scanner;
public class MaxAndMin {
 public static void main (String args[])
{
 Scanner sc = new Scanner (System.in);
 System.out.println ("Enter the number of array");
 int num = sc.nextInt();
 int arr[] = new int[num];
 System.out.println ("Enter the elements of array");
  for (int i =0;i<num;i++)
  {
  arr [i] = sc.nextInt();
  }
    int min = arr[0];
    int max = arr[0];
  for (int i =0;i<num;i++)
  { if (arr[i]>max)
    {
     max = arr[i];
    }
  }
  for (int i =0;i<num;i++)
  { if (arr[i]<min)
   {
    min = arr[i];
   }
  }
  System.out.println ("The maximum value is " + " " + max);
  System.out.println ("The minimum value is " + " " + min);
 }
}
