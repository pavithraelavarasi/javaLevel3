import java.util.Scanner;
public class Paranthesis {
 public static void main (String args[])
 {
  int i,j;
  int open =0,close=0;
  int open1 =0,close1 =0;
  int open2 = 0,close2 =0;
  Scanner sc = new Scanner (System.in);
  System.out.println ("Enter a messeage with paranthesis");
  String s = sc.nextLine();
  char [] ch = new char [s.length()];
  for (i=0;i<s.length();i++)
   {
    ch[i] = s.charAt(i);
   }
  for (i=0;i<s.length();i++)
   {
    if (ch[i] =='(')
     {
      open++;
     }
    if (ch[i]==')')
     {
      close++;
     }
    if (ch[i]== '{')
     {
      open1++;
     }
    if (ch[i]=='}')
    {
     close1++;
    }
    if (ch[i]=='[')
    {
     open2++;
    }
    if (ch[i]==']')
     {
      close2++;
     }
   }
  if ((open==close) && (open1==close1) && (open2==close2))
   {
    System.out.println ("Valid");
   }
  if ((open!=close) || (open1!=close1) || (open2!=close2))
   {
    System.out.println ("Invalid");
   }
 }
}
