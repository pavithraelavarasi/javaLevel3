////1.There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.For example, if N is 4, then there are 5 unique ways:
//What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.

import java.util.Scanner;
public class StairCase{
  public static void main(String[] args)
 {
         int n, s1,s2;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the steps in Staircase: ");
	n = scanner.nextInt();
	System.out.println("Enter the climb up steps: ");
	s1 = scanner.nextInt();
	s2 = scanner.nextInt();
	if(n==0 || n==1)
	{
	 System.out.println(n);
	}
	 for(int i=3;i<=n;i++)	
	  {
	   int s3 = s1 + s2;
	    s1 = s2;
	    s2 = s3;
	  }
        System.out.println("Number of unique ways to climb the staircase: " + s2);
    }
}
