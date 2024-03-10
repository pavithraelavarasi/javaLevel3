
//9.A number is considered perfect if its digits sum up to exactly 10. Given a positive integer n, return the n-th perfect number. For example, given 1, you should return 19. Given 2, you should return 28. 


import java.util.Scanner;
class PerfectNum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check perfect number");
		int num = sc.nextInt();
		int cur,count =0;
		for(cur =1;;cur++)
		{
			int sum =0;
			for(int x = cur;x>0;x = x/10)
			{
				sum = sum +(x %10);
			}
			if(sum == 10)
			{
				count++;
			}
			if(count ==num)
			{
				System.out.println(num + " th perfect number is  : " +cur);
				break;
			}
		}
	}
}
