import java.util.Scanner;

class KeypadMapping {
	static String keyPad [] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	static void possibleways(String s,String ans)
	{
		if(s.equals("0") || s.equals("1"))
		{
			System.out.println("Pls enter any number without 0 and 1 ");
		}
		if(s.length()==0)
		{
			System.out.println(ans);
//			return;
		}
		else {
		String key = keyPad[s.charAt(0)-48];
		for(int i=0;i<key.length();i++)
		{
			possibleways(s.substring(1),ans + key.charAt(i)); // we pass the number as string ..so convert to int (- 48) it is the ascci value of 0//
		}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		String s = sc.next();
		possibleways(s,"");
	}
}
 
