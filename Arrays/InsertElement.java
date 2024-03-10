//9. Write a Java program to insert an element (specific position) into an array. 


import java.util.Scanner;
import java.util.Arrays;
public class InsertElement {
 public static void main (String args[])
  {
   int [] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   System.out.println("Array length is " +array.length);
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a value to be Inserted");
   int value = sc.nextInt();
   System.out.println("Enter an position  number");
   int position = sc.nextInt();
   System.out.println("Original Array : " + Arrays.toString(array));
     for(int i = array.length -1; i > position; i--)
     {
	array[position] = value;
     }
   System.out.println("New Array : " + Arrays.toString(array));
  }
}
