//13. Write a Java program to find the duplicate values of an array of string values. 

import java.util.Scanner;
public class DuplicateValuesString {
 public static void main (String args[])
 { 
         Scanner sc = new Scanner (System.in);
         System.out.println ("Enter the number of elements");
         int num = sc.nextInt();
         String a[] = new String [num];
         System.out.println ("Enter the elements of array");
         for (int i =0;i<num;i++)
         {
            a[i]=sc.next();
          }  
          for (int i=0;i < num-1;i++)
          { 
               for (int j=i+1;j<num;j++)
              {
                 if (a[i].equals(a[j]))
                 {
                     System.out.println ("The Duplicate element is :"+ a[j]);
                  }
                }
             }
  }
}

