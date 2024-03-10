 //Write a function that takes a list of characters and reverses the letters in place.

import java.util.Scanner;

public class ReverseChar{
 public static void main(String[] args)
 {
   int n;
   Scanner scanner= new Scanner(System.in);
   System.out.println("Enter the number of characters:");
   n=scanner.nextInt();
   char[]a = new char[n];
   System.out.println("Enter the characters:");
    for(int i=0;i<n;i++)
    {
     a[i]=scanner.next().charAt(0);
    }
    System.out.println("After Rversing the character is : ");
     for(int i=n-1;i>=0;i--)
     {	
     System.out.print(a[i] + " ");
     }
  }
}
