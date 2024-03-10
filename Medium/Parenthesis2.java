/*Paranthesis validation
"Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing."
Write a function that, given a sentence like the one above, along with the position of an opening parenthesis, finds the corresponding closing parenthesis.*/

import java.util.Scanner;
class Parenthesis2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = "(when I nest them (my parentheticals) too much (like this (and this)))";
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i] = s.charAt(i);
		}
	       char open = '(';
	       char close = ')';
	       int count =0;
	       for(int i=0;i<s.length();i++)
	       {
		       if(ch[i]==open)
		       {
			       System.out.println("Open - " +i);
			       count++;
		       }
		       if(ch[i] ==close)
		       {
			       System.out.println("Close - " +i);
			       count++;
		       }
	       }
	       char[]c = new char[count];
	       int[]pos = new int[count];
	       int index =0;
	       for(int i=0;i<s.length();i++)
	       {
		       if(s.charAt(i)=='(' ||s.charAt(i)==')')
		       {
			       c[index] = s.charAt(i);
			       pos[index] = i;
			       index++; 
		       }
	       }
	       count =0;
	       System.out.println("Enter the position");
	       int position= sc.nextInt();
	       for(int i=0;i<c.length;i++)
	       {
		       if(c[i]=='(' && position ==pos[i])
		       {
			       for(int j=i;j<c.length;j++)
			       {
				       if(c[j]==')')
				       {
					       count++;
				       }
				       else
				       {
					       count--;
				       }
				       if(count==0)
				       {
					       System.out.println("In the given string the open paranthesis corresponding close position is - " + pos[j]);
				       }
			       }
		       }
	       }
	}
}





