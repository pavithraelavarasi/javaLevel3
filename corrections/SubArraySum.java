// if the only 2 numbers sum is equal to number 

class SubArraySum {
	static void subArray(int a[],int n,int s)
	{
		for(int i =0;i<n;i++)
		{
			int curSum = a[i];
			if(curSum == s)
			{
				System.out.println("The sum index is : "+ i	 );
			}
			else
			{
				for(int j =i+1;j<n;j++)
				{
					curSum +=a[j];
					if(curSum==s)
					{
						System.out.println("The sum index are : "+ i + " " + j);
					}
				}
			}
		}
	}
	public static void main(String ar	gs[])
	{
		int a[] = {2,3,5,5,2,4};
		int n = a.length;
		int s = 12;
		subArray(a,n,s);
	}
}
