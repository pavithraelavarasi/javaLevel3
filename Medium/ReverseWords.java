//Write a function reverse_words() that takes a message as a list of characters and reverses the order of the words in place.

import java.util.Scanner;

public class ReverseWords{
 public static void main(String[] args)
 {
  String c;
  int i;
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter a message:");
  c = scanner.nextLine();
  String[] a = c.split(" ");
  /*for(i=0;i<a.length;i++)
  {
   System.out.println("a[i] " + a[i]);
  }*/
  System.out.println("After reversing the words : ");
   for(i=a.length-1;i>=0;i--)
   {
     System.out.print(a[i] + " ");
    } 
 }
}
