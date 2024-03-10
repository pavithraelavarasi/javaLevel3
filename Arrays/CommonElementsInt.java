//15. Write a Java program to find the common elements between two arrays of integers. 

import java.util.Scanner;
public class CommonElementsInt {
 public static void main (String args[])
 {
   int i,j;
   Scanner sc = new Scanner (System.in);
   System.out.println ("Enter the number of elements");
   int num = sc.nextInt();
   int a[] = new int [num];
   System.out.println ("Enter the elements of an array A:");
    for (i=0;i<num;i++)
    {
     a[i] =sc.nextInt();
    }
    int b[] = new int [num];
   System.out.println ("Enter the elements of an array B");
    for (j=0;j<num;j++)
    {
     b[j] =sc.nextInt();
    }
   System.out.println ("The common element in array A and B :");
   for(i=0;i<num;i++)
   {
    for(j=0;j<num;j++)
    {
      if(a[i]==b[j])
       {
        System.out.print(b[j] + " ");
	}
     }
    }
 }
} 
 // to avoid the printing of duplicates
for (int i = 0; i < size1; i++) 
                {
                        boolean flag = false;
                        for (int j = 0;j < i;j++)    
                        {
                            if (a[i] == a[j])    
                            {
                                flag = true;
                                break;
                            }
                        }
                        if (!flag)     
                        {
                            for (int j = 0;j < size2;j++)
                            {
                                if (a[i] == b[j])   
                                {
                                    System.out.print( a[i] + " ");
                                    break;
                                }

                            }
                        }
                }       

