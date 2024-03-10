 //8.Given a list of integers, return the largest product that can be made by multiplying any three integers. For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 -10 5. 
 
import java.util.Scanner;
 
public class Multiply{
  public static void main(String[] args)
  {
    int n, max=1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements in an array: ");
    n = scanner.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the array elements: ");
    for(int i=0;i<n;i++)
     {
      a[i] = scanner.nextInt();
     }
    for(int i=0;i<n;i++)
     {
      for(int j=i+1;j<n;j++)
      {
	for (int k=j+1;k<n;k++)
	{
	 int product = a[i]*a[j]*a[k];
	  max=max>product?max:product;
	}
       }
      }
       System.out.println("The largest product while multiplying any three integers: " + max);
    }
 }
