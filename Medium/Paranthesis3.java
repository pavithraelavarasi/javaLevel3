import java.util.Scanner;
class Paranthesis3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		int count =0;
		boolean valid = false;
		char[]ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)== '{' ||s.charAt(i)=='['||s.charAt(i)=='(')
			{
				count++;
			}
			else 
			{
				count--;
			}
		}
		if(count <0)
		{
			System.out.println("It is already balanced");
		}
		else if(count >0)
		{
			System.out.println("We need "+count+" close brackets ");
		}
		else
		{
			System.out.println("We need "+(-count)+" open brackets to get valid");
		}
	}
}

