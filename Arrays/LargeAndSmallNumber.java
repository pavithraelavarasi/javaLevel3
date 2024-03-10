//28. Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000. 

import java.util.Scanner;
public class LargeAndSmallNumber {
public static void main (String args[])
 {
   Scanner sc = new Scanner (System.in);
   System.out.println ("Enter a number");
   double  num =sc.nextDouble();
  if (num > 0)
    {
      if (num < 1)
      {
       System.out.println ("Positive small number");
      }
      else if (num > 1000000)
      {
       System.out.println ("Positive large number");
      }
      else 
      {
       System.out.println ("Positive");
      }
     }
   else if (num < 0)
    {
      if (num < 1)
      {
	System.out.println ("Negative small number");
      }
      else if (num >1000000)
      {
	System.out.println ("Negative large number");
      }
      else 
      {
	System.out.println ("Negative");
       }
     }
   else 
     {
      System.out.println ("Zero");
     }
    }
}
