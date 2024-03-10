//34. Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.

import java.util.Arrays;

public class longConsecutive {
 public static void main (String args[])
 {
   int i,j,count=1,temp = 0;
   int a[] = {49, 1, 3, 200, 2, 4, 70, 5};
   int b[] = new int [a.length];
   for(i=0;i<a.length-1;i++)
    {
     for(j=i+1;j<a.length;j++)
      {
	if(a[i]>a[j])
	 {
	  temp = a[i];
	  a[i] = a[j];
	  a[j] = temp;
	 }
       }
     }
    System.out.println ("Sorted array is : " + Arrays.toString (a));
    for (i=0;i<a.length-1;i++)
    {
      if (a[i]+1 == a[i+1])
       {
      	  count++;
       }
     }
    System.out.println ("New length of the array is : " +count);
   }
}
