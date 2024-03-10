//Mapping
import java.util.Scanner;
class MobileMap {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();	
		char charKey[][] = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},
			     {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
		int n1 = num /10 , n2 = num %10;
		if(num ==0 || num ==1)
		{
			System.out.print("Please enter any other number without 0 and 1 ");
		}
		if(n1 ==7 ||n1 ==9)
		{
			if(n2==7||n2==9)
			{
				for(int i=0;i<4;i++)
				{
					for(int j=0;j<4;j++)
					{
						System.out.print(charKey[n1-2][i] + ""+charKey[n2-2][j] +" ");
					}
				}
			}
		         else
	          	{
			   for(int i=0;i<4;i++)
			   {
			     for(int j=0;j<3;j++)
			     {
				System.out.print(charKey[n1-2][i] +""+charKey[n2-2][j] +" ");
			     }
			   }
		         }
		}
		else if(n2==7 ||n2==9)
		{
			if(n1 !=7 ||n1!=9)
			{
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<4;j++)
					{
						System.out.print(charKey[n1-2][i]+""+charKey[n2-2][j] +" ");
					}
				}
			}
		}
		else
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(charKey[n1-2][i] + ""+charKey[n2-2][j] +" ");
				}
			}
		}
	}
}


