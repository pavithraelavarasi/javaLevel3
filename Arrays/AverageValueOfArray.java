//4. Write a Java program to calculate the average value of array elements. 

import java.util.Scanner;
public class AverageValueOfArray {
 public static void main (String args[])
 {
   Scanner sc =new Scanner (System.in);
   System.out.println ("Enter a array size: ");//how many elements do you want
   int size = sc.nextInt();
   double array[] = new double [size];//array creation
   System.out.println ("Enter array values :");//induvidual values
   double sum =0;
   for (int i=0;i <size;i++)
   {
    array[i] = sc.nextDouble();
    sum +=array[i];
   }
   System.out.println("The sum : " +sum); 
   double average =sum/size;
    System.out.println ("The average values of an array is : " + average);
   }
 }
