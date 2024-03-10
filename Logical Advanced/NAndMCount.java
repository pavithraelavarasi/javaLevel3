//5. There is an N by M matrix of zeroes. Given N and M, write a function to count the number of ways of starting at the top-left corner and getting to the bottom-right corner. You can only move right or down. 

import java.util.Scanner;

public class NAndMCount {
  public static void main(String[] args)
 {
   int r,c,k;
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the number of rows in a matrix: ");
   r = scanner.nextInt();
   System.out.println("Enter the number of columns in a matrix: ");
   c = scanner.nextInt();
   k = waysCount(r,c);
   System.out.println("Total number of paths to reach bottom-right corner is: " + k);
 }
public static int waysCount(int r, int c){
  int count = 0;
  if(r==1 || c==1)
   {
    return 1;
   }
    return(waysCount(r-1,c) + waysCount(r,c-1));
}
}
