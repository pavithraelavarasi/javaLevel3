//Given a string and a number of lines k, print the string in zigzag form. In zigzag, characters are printed out diagonally from top left to bottom right until reaching the kth line, then back up to top right, and so on.
import java.util.Scanner;
public class ZigZag {
	public static void main(String []args){
		int row,n=0,k=0 ;
		boolean flag =true;
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word : ");
		word = sc.nextLine();
		System.out.println("Enter number of rows : ");
		row = sc.nextInt();
		int len=word.length();
		char [] ch = new char[len];
		for(int i=0;i<len;i++){
			ch[i] = word.charAt(i);
		}
		char [][] a = new char[row][len];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<len;j++)
			{
				a[i][j] = ' ';
			}
		}
		for(int j=0;j<len;j++)
		{
			if(flag == true)
			{
				a[n][j] = ch[j];
				n++;
				if(n==row)
				{
					n=n-2;
					flag = false;
					continue;
				}
			}                                       
			if(flag == false)
			{
				a[n][j] = ch[j];
				n--;
				if(n<0)
				{
					n=n+2;
					flag = true;
					continue;
				}
			}	
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<len;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
