//24. Write a Java program to find a missing number in an array. 

import java.util.Scanner;
public class MissingNumber{
 public static void main(String[] args){
  int i,j,n,x,y,sum=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number of elements in an array ");
   n = sc.nextInt();
   y = n-1;
   int[] a = new int[n];
   int[] b = new int[n];
   System.out.println("The " + y + " elements in an array between 1 to " + n +  "are: ");
   for(i=0;i<n-1;i++)
    {
    a[i]= sc.nextInt();
	sum = sum + a[i];
    }
	x = ((n*(n+1))/2) - sum;
    System.out.println("The missing element in an array between 1 to " + n +  " is : " + x);
 }
}

		
		
			
		
