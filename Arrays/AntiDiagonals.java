//37. Write a Java program to create an array of its anti-diagonals from a given square matrix.  

import java.util.Scanner;
public class AntiDiagonals {
 public static void main (String args[])
 {
   int i,j,k;
   Scanner in = new Scanner(System.in);
   System.out.println("Enter rows:");
   int rows = in.nextInt();
   System.out.println("Enter columns:");
   int col = in.nextInt();
   int a[][] = new int [rows][col];
   int b[][] = new int [rows][col];
   System.out.println("Enter the matrix elements:");
     for(i = 0; i < rows ; i++)
	{
	  for(j = 0 ; j< col ; j++)
	     { 
	      a[i][j] = in.nextInt();
	      }
	 }
    System.out.println ("The matrix is : ");
     for (i =0;i<rows;i++)
      {
	for (j =0;j<col;j++)
	{
         System.out.print (a[i] [j] + " ");
	}
	System.out.println ();
       }
     System.out.println ("The Antidiagonal elements are : ");
      for (i=0;i<rows+col-1;i++)
	{
          for (j=0;j<rows;j++)
           {
	    for (k=0;k<col;k++)
	     {
	      if (j+k == i)
		{
	         System.out.print (a[j][k] + " ");
		}
	     }
	   }
	  System.out.println();
	 }
     }																																																																												
}


