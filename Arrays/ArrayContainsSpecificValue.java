//5. Write a Java program to test if an array contains a specific value. 


import java.util.Scanner;
public class ArrayContainsSpecificValue {
 public static void main (String args[])
 {
   boolean value_found = false;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter the count of array");
  int num = sc.nextInt();
  int array[] =new int [num];
  System.out.println ("Enter the array values");
   for (int i=0;i<num;i++)
   {
     array[i] = sc.nextInt();
   }
    System.out.println ("Enter the value to be tested");
      int test_value = sc.nextInt();
   for (int i=0;i<num;i++)
     {  if (test_value==array[i])
	{
	 value_found = true; break;
         }
      }	
      if (value_found)
     {
      System.out.println ("Yes,Array contains the secific given value");
     }
     else
     {
      System.out.println ("No,Array doesn't contains specific given value");
     }
   }
  }
