//35. Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.

public class SumEqual {
 public static void main (String args[])
 { 
   int i,j;
   int a[] = {1,2,3,4,5,6};
   System.out.println ("The two elements whose sum is 6 are : ");
   for (i=0;i<a.length;i++)
   {
    for (j=i+1;j<a.length;j++)
     {
        if (a[i]+a[j]==6)
        {
	 System.out.println (a[i] + " and " + a[j]);
//	 System.out.println (i + "and" + j);
      }
   }
 }
}
}

