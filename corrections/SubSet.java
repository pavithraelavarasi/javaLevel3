import java.util.Scanner;
class SubSet {
	public static boolean hasSubset(int value[],int targetSum,int n)
	{
		if(targetSum==0)   // if the sum/2 ==0 its divide by 2 so true
		{
			return true;
		}
		if(n==0) // if size =0 false
		{
			return false;
		}
		if(value[n-1] > targetSum)  // if last element of the array compare to target and return size one lessthan..
		{
			return hasSubset(value,targetSum,n-1);
		}
		return hasSubset(value,targetSum - value[n-1],n-1) || hasSubset(value,targetSum,n-1);
	}
	public static void main(String arhs[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
		System.out.println("Enter the elements of an array:");
		int value[] = new int[n];
		for(int i=0;i<n;i++)
		{
			value[i] = sc.nextInt();
		}
		int sum =0;
		for(int i=0;i<n;i++)
		{
			sum+=value[i];
		}
		System.out.println("Sum of Value : "+ sum);
		System.out.println("subset result : "+ hasSubset(value,sum/2,n));
	}
}
