//8. Given a list of integers, return the largest product that can be made by multiplying any three integers. For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 -10 5. 


import java.util.Scanner;

public class HighestProduct {
  public static void main(String[] args)
  {
   int i,j,k,p,n,max=0;
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the number of array elements: "); 
   n = scanner.nextInt();
   int[] a = new int[n];
   System.out.println("Enter the elements: "); 
   for(i=0;i<n;i++)
   {
    a[i]= scanner.nextInt();
   }
   for(i=0;i<n;i++)
   {
    for(j=i+1;j<n;j++)
    {
     for(k=j+1;k<n;k++)
     {
      p = a[i]*a[j]*a[k];
       max=max>p?max:p;
      }
     }
    }
    System.out.println("highest product: " + max);
  }
}
		
