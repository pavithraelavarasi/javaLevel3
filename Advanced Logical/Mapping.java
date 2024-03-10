//1. Given a mapping of digits to letters (as in a phone number), and a digit string, return all possible letters the number could represent. You can assume each valid number in the mapping is a single digit. For example if {“2”: [“a”, “b”, “c”], 3: [“d”, “e”, “f”], …} then “23” should return [“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"]. 

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Mapping {
 public static void main (String args[])
 {
   int i,j,x,y,num,m,size;
   Scanner sc = new Scanner (System.in);
   System.out.println ("Enter the number of inputs;" );
   size = sc.nextInt();
   HashMap < Integer,char[]>map	= new HashMap<Integer,char []>();
   for (i=0;i<size;i++)
   {
     System.out.println ("Enter the number");
      num = sc.nextInt();
     System.out.println ("Enter the characters: " );
     char [] charArray = new char[3];
     for (m=0;m<3;m++)
     {
      charArray [m] = sc.next().charAt(0);
     }
     map.put (num,charArray);
    }
    System.out.println ("Enter the value1 : ");
    x = sc.nextInt();
    System.out.println ("Enter the value2 : ");
    y = sc.nextInt ();
    char []a1 = map.get(x);
    char []a2 = map.get (y);
    for (i=0;i<3;i++)
     {
      for (j=0;j<3;j++)
      {
	     System.out.println (a1[i] + " "+a2 [j]);
      }
     }
   }
}
