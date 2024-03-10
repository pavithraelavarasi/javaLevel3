//43. Write a Java program to find all combination of four elements of an given array whose sum is equal to a given value.   

import java.util.Scanner;
public class SumOf4Elements {
 public static void main (String args[])
 { 
    boolean ValueFound = false;
   Scanner sc =  new Scanner (System.in);
   System.out.println ("Enter the size of an array");
   int size = sc.nextInt ();
   int a[] = new int [size];
   System.out.println ("Enter the elements of an array");
   for (int i=0;i<size;i++)
    {
     a[i] = sc.nextInt();
    }
    System.out.println ("Enter the sum of the value");
    int value = sc.nextInt();
    System.out.println ("The combinaton of four elements whose sum is equal to " + value + "are :");
     for (int i=0;i<size-3;i++)
      { 
      for (int j=i+1;j<size-2;j++)
       {
        for (int k=j+1;k<size-1;k++)
	 {
          for (int l=k+1;k<size;k++)
           {
	    if (a[i]+a[j]+a[k]+a[l]==value)
	     {
	      ValueFound = true;
	      System.out.println (a[i] + "," +a[j]+" ,"+a[k]+ "," + "and" + a[l]);
	     }
	   }
	 }
       }
      }
     
     if (ValueFound ==true)
     {
	 return;
       //System.out.println ("The four elements are" + a[i] + "," +a[j]+" ,"+a[k]+ "," + "and" + a[l]);
     }
     else 
     {
      System.out.println ("not possible");
     }
   }
}
