//52. Write a Java program to separate even and odd numbers of an array of integers. Put all even numbers first, and then odd numbers.   

import java.util.Scanner;
public class EvenOddLeftRight {
  public static void main(String[] args)
 {
    int i,j,n,temp;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements in an array : ");
    n = scanner.nextInt();
    System.out.println("Enter the array elements: ");
    int[] a = new int[n];
     for(i=0;i<n;i++)
     {
      a[i] = scanner.nextInt();
     }
    System.out.println("The rearranged array1 is: ");
     for(i=0;i<n;i++)
      {
	if((a[i]%2)==0)
         {
	  for(j=0;j<n;j++)
	   {
	    temp =a[i];
	    a[i] =a[j];
	    a[j] =temp;
            }
	  }
        }
      for (i=0;i<n;i++)
       {
	System.out.println(a[i]);
       }
     }
}
