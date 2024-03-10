// 29. Write a Java program to compute the average value of an array of integers except the largest and smallest values. 

import java.util.Scanner;

public class AverageExptLargeSmall {
  public static void main(String[] args)
  {
    int [] array = {3, 1, 8, 6, 9, 5, 7};
    int max = array[0];
    int min = array[0];
    double sum = array[0];
   for(int i = 1; i < array.length; i++)
     {
      sum = sum + array[i];

       if(array[i] > max)
	 {
	  max = array[i];
	  }
	else if(array[i] < min)
	 {
	   min = array[i];
	 }
       }
    System.out.println("average value of an array of integers except the largest and smallest values : ");
    double avg = ((sum - max - min) / (array.length - 2));
     System.out.println(avg);
    }
}
